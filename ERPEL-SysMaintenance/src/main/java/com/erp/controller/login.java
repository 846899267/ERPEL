package com.erp.controller;

import com.erp.mapper.loginMapper;
import com.erp.pojo.user;
import com.erp.service.impl.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
@RequestMapping("/login")
public class login  {
@Autowired
private loginService loginService;
    @Autowired
    private loginMapper loginMapper;

    @RequestMapping("/login")
    public String index(String username,String password){
        user user=new user();
        user.setUsername(username);
        user.setPassword(password);
       int a= loginService.login(user);
       System.out.println(username+" "+password+" "+a);
       if(a==1)
            return "redirect:http://bishee.com";
       if(a==2)
           return "redirect:http://bisshe.com";
       if(a==3){
             //   System.out.println(a);
           return "redirect:http://bishe.com";
       }

        return "redirect:http://localhost:8088.login.html";


    }
    @GetMapping("/r")
    public void r(){
        Map<String,String> a= loginMapper.findByName2();
        System.out.println(a.get("password")+" "+a.get("role"));
    }
    @RequestMapping("/redirect")
    public String redirect(){
        return"redirect:http://localhost:8000";
    }

}