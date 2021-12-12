package com.ksyun.safe.fastjson.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FastJsonController {
    @RequestMapping(value="/shit", method= RequestMethod.POST)
    public String echo(User user) {
        return "ok";
    }
}
