package com.react.myapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("/index")
    public String index(){
        return "spring boot application";
    }
}
