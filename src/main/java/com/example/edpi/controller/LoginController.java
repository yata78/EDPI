package com.example.edpi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.edpi.Entity.MUser;
import com.example.edpi.Entity.MUserDto;
import com.example.edpi.repository.LoginRepository;


@Controller
public class LoginController {

    @Autowired
    LoginRepository loginRepository;

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public ModelAndView requestMethodName(ModelAndView mav, MUser muser) {
        mav.setViewName("login");
        mav.addObject("muser", muser);
        return mav;
    }

    @RequestMapping( value = "/", method=RequestMethod.POST)
    public ModelAndView requestMethodName(ModelAndView mav, @ModelAttribute("MUserDto") MUserDto muserdto, @ModelAttribute("userId") String userId, @ModelAttribute("pass") String pass) {
        
        //vaidateResultを使用したい。entityを使用できる?(createdとupdatedがどうなるか)
        //そもそも日付のカラムは使用しないので無くしてもよい(慣習だと思って入れただけ)
        // MUser mUser = (MUser)loginRepository.findById(id).get();
        // if(password.equals(mUser.getPass())) {
        //     //TODO : mav.addAttribute(mUser, mUser)
        //     mav.setViewName("index");
        // } else {
        //     mav.setViewName("redirect:/");
        // }
        muserdto.setUserId(userId);
        muserdto.setPass(pass);
        mav.setViewName("login");
        mav.addObject("id", muserdto);
        mav.addObject("pass", muserdto.getPass());
        return mav;
    }
        
}
