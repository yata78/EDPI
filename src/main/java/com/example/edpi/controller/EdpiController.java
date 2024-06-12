package com.example.edpi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EdpiController {
    
    @GetMapping("edpi")
    public ModelAndView getMethodName(ModelAndView mav) {
        mav.setViewName("registEdpi");
        return mav;
    }
    
}
