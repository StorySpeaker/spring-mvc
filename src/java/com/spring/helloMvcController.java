package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class helloMvcController {

    @RequestMapping("/mvc")
    public String getName(){
        return "home";
    }

}
