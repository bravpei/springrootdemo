package com.example.springrootdemo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {
    @RequestMapping(value = {"/say","/hi"},method = RequestMethod.GET)
    public String say(@RequestParam String person){
        System.out.println(person);
        return "Hello world"+person;
    }
}
