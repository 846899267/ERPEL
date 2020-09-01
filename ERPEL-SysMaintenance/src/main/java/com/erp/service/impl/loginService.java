package com.erp.service.impl;

import com.erp.mapper.loginMapper;
import com.erp.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class loginService {
    @Autowired
    private loginMapper loginMapper;

    public int login(user user){
        Map<String,String> a= loginMapper.findByName(user.getUsername());
      System.out.println(a.get("password")+" "+a.get("role"));
       if(a.get("password").equals(user.getPassword())&&(a.get("role").equals("1")))
           return 1;
        if(a.get("password").equals(user.getPassword())&&(a.get("role").equals("2")))
            return 2;
        if(a.get("password").equals(user.getPassword())&&(a.get("role").equals("3")))
            return 3;
       return 0;
    }
}
