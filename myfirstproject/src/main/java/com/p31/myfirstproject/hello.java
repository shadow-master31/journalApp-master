package com.p31.myfirstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController public class hello {
    @GetMapping("abc") public String hello(){
        return "hello";
    }
}
