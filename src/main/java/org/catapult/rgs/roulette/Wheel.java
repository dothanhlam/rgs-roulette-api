package org.catapult.rgs.roulette;

import org.catapult.rgs.roulette.rng.Rng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wheel {

    @Autowired
    private Rng rng;

    public Integer spin() {
        return rng.get(0, 36);
    }
}
