package com.erp.controller;

import com.erp.pojo.caigou;
import com.erp.pojo.guanli;
import com.erp.pojo.item;
import com.erp.service.impl.caigouServiceImpl;
import com.erp.service.impl.guanliServiceImpl;
import com.erp.utils.Message;
import com.erp.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("order")
public class guanliController {

    @Autowired
    private guanliServiceImpl guanliService;

    @GetMapping("findAll")
    public Message selectAllItem(){
    return MessageUtil.success("success",guanliService.selectAll());
    }

    @GetMapping("/deleteById")
    public int deleteById(Long id){
        return guanliService.deleteById(id);
    }

//    @PostMapping("/saveOrUpdate")
//    public  int insert(@RequestBody(required=false) guanli guanli){
//        return guanliService.insert(guanli);
//    }

//    @PostMapping("/ubi")
//    public int updateById(@RequestBody guanli guanli){
//        return guanliService.update(guanli);
//    }
    @PostMapping("/saveOrupdate")
    public Message insertOrUpdate(guanli guanli){
        if(guanli.getId()!=null){
            guanliService.update(guanli);
            return MessageUtil.success("success");
        }

        guanliService.insert(guanli);
        return MessageUtil.success("success");
    }


    @PostMapping("batchDelete")
    public void  batchDelete (long[] ids){
        for (long a:ids) {
            guanliService.deleteById(a);
        }
    }

    @PostMapping("query")
    public Message query(guanli guanli){
        List<guanli> list=guanliService.query(guanli);
        return MessageUtil.success("success",list);
    }

}
