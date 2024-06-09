package com.example.edpi.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.edpi.model.Edpi;
import com.example.edpi.repository.EdpiRepository;
import com.example.edpi.repository.UserRepository;


@Controller
public class LoginController {

    @Autowired
    EdpiRepository repository;

    //ログイン画面に遷移
    @GetMapping("/")
    public String Login() {
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView postMethodName(ModelAndView mav) {
        java.util.List<Edpi> edpis = repository.findAll();
        mav.addObject("data", edpis);
        mav.setViewName("main");
        return mav;
    }
    
    
}
