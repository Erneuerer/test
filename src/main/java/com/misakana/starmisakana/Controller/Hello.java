package com.misakana.starmisakana.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping(value = "/hello")
    public String hello() {
        System.out.println("Hello World!");
        return "Hello 山东农大!";
    }

}
