package com.farmbot.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/users")
public class UserController {

    @GetMapping(value = "")
    public ResponseEntity<String> getUsers(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

}
