package org.catapult.rgs.roulette.rng;

public class SecureRng extends java.security.SecureRandom implements Rng {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long m = 1;
	private long r = 0;

	@Override
	public int get(int min, int max) {
		m = min;
		return nextInt(max);
	}

	@Override
	public final int nextInt(int n) {
		while (true) {
			if (m < 0x80000000L) {
				m <<= 32;
				r <<= 32;
				r += (long) next(32) - Integer.MIN_VALUE;
			}
			long q = m / n;
			if (r < n * q) {
				int x = (int) (r % n);
				m = q;
				r /= n;
				return x;
			}
			m -= n * q;
			r -= n * q;
		}
	}
}
