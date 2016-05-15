package org.catapult.rgs.roulette.bets;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EvenBet extends BaseBet {

    @Override
    protected boolean isWinningNumber(Integer number) {
        return number % 2 == 0;
    }

    @Override
    protected Integer payout() {
        return 1;
    }
}
