package com.autotestplatform.system.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WizzyBC
 */
@Controller
public class LoginController {

    @RequestMapping("/login/{id}")
    public @ResponseBody String login(@PathVariable("id") Integer id){
        return "login:" + id;
    }

    @RequestMapping("/")
    public String logintest(){
        return "login";
    }
}
