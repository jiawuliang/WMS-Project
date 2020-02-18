package com.wms.wmscontrol.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/login")
    public String hello() {
        return "Hello Spring boot!";
    }
}
