package com.example.springrootdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloWorld {
    @RequestMapping(value = {"/say","/hi"},method = RequestMethod.GET)
    public String say(@RequestParam String person){
        System.out.println(person);
        return "Hello world"+person;
    }
    @RequestMapping(value = {"/host"},method = RequestMethod.GET)
    public ResponseEntity<List<User>> getList(){
        List<User> users=new ArrayList<>();
        users.add(new User("zhangsan",10));
        users.add(new User("lisi",20));
        return ResponseEntity.ok().body(users);
    }
    @RequestMapping(value = {"/host2"},method = RequestMethod.GET)
    public ResponseEntity<List<Map<String,Object>>> getList2(){
        List<Map<String,Object>> users=new ArrayList<>();
        Map<String,Object> wangwu=new HashMap<>();
        wangwu.put("name","wangwu");
        wangwu.put("age",16);
        users.add(wangwu);
        return ResponseEntity.ok().body(users);
    }
}
