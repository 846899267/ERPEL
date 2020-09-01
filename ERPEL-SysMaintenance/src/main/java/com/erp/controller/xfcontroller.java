package com.erp.controller;

import com.erp.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class xfcontroller {
    @Autowired
    private itemService itemService;

//    @GetMapping("/cxsl")
//    public int cxsl(int num){
//
//    }
}
