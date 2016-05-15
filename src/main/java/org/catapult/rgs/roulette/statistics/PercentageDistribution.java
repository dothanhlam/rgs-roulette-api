package org.catapult.rgs.roulette.statistics;

import java.util.Map;

interface PercentageDistribution {

    void add(Integer winningNumber);

    Map<String, Integer> get();

}
