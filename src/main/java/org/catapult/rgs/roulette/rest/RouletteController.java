package org.catapult.rgs.roulette.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class RouletteController {

    @RequestMapping(value="/test", method=GET)
    public String test() {
    	return "test";
    }
}
