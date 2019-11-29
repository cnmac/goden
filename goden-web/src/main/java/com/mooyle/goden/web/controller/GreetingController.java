package com.mooyle.goden.web.controller;

import com.mooyle.goden.domain.model.GodenUser;
import com.mooyle.goden.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/index")
public class GreetingController {

    @Autowired
    UserService userService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/user")
    public GodenUser getUser(@RequestParam(value="uid") String uid){
        return userService.getUsers(Long.valueOf(uid));
    }
}
