package com.example.edpi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public ModelAndView requestMethodName(ModelAndView mav) {
        mav.setViewName("login");
        return mav;
    }

    @RequestMapping( value = "/", method=RequestMethod.POST)
    public ModelAndView requestMethodName(ModelAndView mav, @RequestParam("loginId") String id, @RequestParam("password") String password) {
        mav.setViewName("index");
        return mav;
    }
    
    
}
