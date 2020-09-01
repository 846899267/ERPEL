package com.erp.controller;

import com.erp.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class controller {
    @Autowired
    private itemService  itemService;


}
