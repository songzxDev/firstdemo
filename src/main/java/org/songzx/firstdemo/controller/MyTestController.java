package org.songzx.firstdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestController {
    @RequestMapping(path = "/hello/")
    public String hello(@RequestParam(value = "username", required = false, defaultValue = "World") String username) {
        return "Hello " + username;
    }
}
