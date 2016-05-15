package org.catapult.rgs.roulette.rest;


import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.catapult.rgs.roulette.Roulette;
import org.catapult.rgs.roulette.bets.Bets;
import org.catapult.rgs.roulette.results.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouletteController {

    @Autowired
    private Roulette roulette;

    @RequestMapping(value = "/spin", method = POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Results spin(@Valid @RequestBody Bets bets) {
        return roulette.play(bets);
    }
}