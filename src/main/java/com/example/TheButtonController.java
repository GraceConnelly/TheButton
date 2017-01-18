package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ben on 1/18/17.
 */
@RestController
public class TheButtonController {
    @RequestMapping(path = "/status", method = RequestMethod.GET)
    public Status getStatus() {
        return new Status();
    }
}
