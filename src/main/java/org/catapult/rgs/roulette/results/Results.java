package org.catapult.rgs.roulette.results;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.catapult.rgs.roulette.bets.Bets;
import org.catapult.rgs.roulette.bets.validation.RouletteNumber;
import org.catapult.rgs.roulette.statistics.StatisticsSummary;

@Data
public class Results {

    @NotNull
    @RouletteNumber
    private Integer winningNumber;

    @Valid
    @NotNull
    private Bets bets;

    @Valid
    @NotNull
    private StatisticsSummary statistics;
}