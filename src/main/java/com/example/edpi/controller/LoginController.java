package com.example.edpi.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.edpi.model.Edpi;
import com.example.edpi.repository.EdpiRepository;
import com.example.edpi.repository.UserRepository;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;



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
    public ModelAndView postMethodName(ModelAndView mav ,@RequestParam("userName") String message, Model model) {
        java.util.List<Edpi> edpis = repository.findAll();
        mav.addObject("message", message);
        mav.addObject("data", edpis);
        mav.setViewName("main");
        return mav;
    }
    
    
}
