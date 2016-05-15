package org.catapult.rgs.roulette.statistics;

import org.catapult.rgs.roulette.bets.BlackBet;
import org.catapult.rgs.roulette.bets.RedBet;

class BlackRedZeros extends BasePercentageDistribution<BlackRedZeros.BlackRedZero> {

    @Override
    protected BlackRedZero fromNumber(Integer winningNumber) {
        return BlackRedZero.fromNumber(winningNumber);
    }

    @Override
    protected BlackRedZero[] definedValues() {
        return BlackRedZero.values();
    }

    protected enum BlackRedZero {
        BLACK, RED, ZERO;

        public static BlackRedZero fromNumber(Integer number) {
            if (0 == number) {
                return ZERO;
            }

            if (BlackBet.BLACK_NUMBERS.contains(number)) {
                return BLACK;
            }

            if (RedBet.RED_NUMBERS.contains(number)) {
                return RED;
            }

            throw new IllegalArgumentException(number + " is not Zero, Black or Red.");
        }
    }
}
