package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by Ben on 1/18/17.
 */
@RestController
public class TheButtonController {
    public static Status currentStatus = new Status();

    @CrossOrigin
    @RequestMapping(path = "/status", method = RequestMethod.GET)
    public Status getStatus() {
        return currentStatus;
    }

    @CrossOrigin
    @RequestMapping(path = "/click", method = RequestMethod.POST)
    public void clickButton(@RequestBody Click click) {
        HashMap<String, Integer> scores = currentStatus.getScores();

        if (!scores.containsKey(click.getName())) {
            scores.put(click.getName(), currentStatus.getCurrent());
            currentStatus.setCurrent(0);
        }
    }
}
