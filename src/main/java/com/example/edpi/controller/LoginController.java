package com.example.edpi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class LoginController {

    //ログイン画面に遷移
    @GetMapping("/")
    public String Login() {
        return "login";
    }

    @PostMapping("/login")
    public String postMethodName() {
        return "main";
    }
    
    
}
