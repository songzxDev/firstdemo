package org.songzx.firstdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestController {
    @RequestMapping(path="/hello/")
    public String hello() {
        return "Hello World! ";
    }
}
