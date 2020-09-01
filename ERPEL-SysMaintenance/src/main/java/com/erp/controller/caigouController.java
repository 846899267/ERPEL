package com.erp.controller;

import com.erp.pojo.caigou;
import com.erp.pojo.gongyingshang;
import com.erp.service.impl.caigouServiceImpl;
import com.erp.service.impl.gongyingshangServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("caigou")
public class caigouController {

    @Autowired
    private caigouServiceImpl caigouService;
    @GetMapping("/haha")
    public String haha(){
    return "haha";
    }
    @GetMapping("/sibn/{name}")
    public List<caigou> selectItemByName(@PathVariable String name){
        return caigouService.selectByIName(name);
    }

    @GetMapping({"/sa","/user/api"})
    public List<caigou> selectAllItem(){
    return caigouService.selectAll();
    }

    @GetMapping("/dbi")
    public int deleteById(Long id){
        return caigouService.deleteById(id);
    }

    @PostMapping("/insert")
    public  int insert(@RequestBody(required=false) caigou caigou){
        return caigouService.insert(caigou);
    }

    @PostMapping("/ubi")
    public int updateById(@RequestBody caigou caigou){
        return caigouService.update(caigou);
    }

}
