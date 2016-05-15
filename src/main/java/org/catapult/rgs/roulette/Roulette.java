package org.catapult.rgs.roulette;

import org.catapult.rgs.roulette.bets.Bets;
import org.catapult.rgs.roulette.results.Results;
import org.catapult.rgs.roulette.statistics.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Roulette {

    @Autowired
    private Wheel wheel;

    @Autowired
    private Statistics statistics;

    public Results play(Bets bets) {
        Integer number = wheel.spin();
        statistics.addNumber(number);
        bets.calculateOutcome(number);

        Results results = new Results();
        results.setBets(bets);
        results.setWinningNumber(number);
        results.setStatistics(statistics.getSummary());

        return results;
    }
}