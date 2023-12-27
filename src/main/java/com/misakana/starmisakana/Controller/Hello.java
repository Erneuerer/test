package com.misakana.starmisakana.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping
    public String hello() {
        return "Hello World!";
    }

}