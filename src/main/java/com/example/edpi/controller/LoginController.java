package com.example.edpi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.edpi.Entity.MUser;
import com.example.edpi.repository.LoginRepository;


@Controller
public class LoginController {

    @Autowired
    LoginRepository loginRepository;

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public ModelAndView requestMethodName(ModelAndView mav) {
        mav.setViewName("login");
        return mav;
    }

    @RequestMapping( value = "/", method=RequestMethod.POST)
    public ModelAndView requestMethodName(ModelAndView mav, @RequestParam("loginId") Integer id, @RequestParam("password") String password) {
        
        MUser muser = loginRepository.findById(id).get();
        if(password.equals(muser.getPass())) {
            mav.setViewName("index");
        } else {
            mav.setViewName("redirect:/");
        }     
        return mav;
    }
    
    
}
