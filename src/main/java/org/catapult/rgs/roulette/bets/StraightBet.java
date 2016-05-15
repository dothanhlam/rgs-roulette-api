package org.catapult.rgs.roulette.bets;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

import org.catapult.rgs.roulette.bets.validation.RouletteNumber;

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class StraightBet extends BaseBet {

    @NotNull
    @RouletteNumber
    private Integer number;

    @Override
    protected boolean isWinningNumber(Integer number) {
        return this.number.equals(number);
    }

    @Override
    protected Integer payout() {
        return 35;
    }
}
