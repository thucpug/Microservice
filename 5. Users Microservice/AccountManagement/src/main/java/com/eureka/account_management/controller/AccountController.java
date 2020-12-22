package com.eureka.account_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "accounts")
public class AccountController {

    @GetMapping(path = "/status")
    public String createAccount(){
        return "Working...";
    }
}
