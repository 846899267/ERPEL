package com.erp.controller;

import com.erp.pojo.category;
import com.erp.pojo.role;
import com.erp.service.impl.categoryServiceImpl;
import com.erp.service.impl.roleServiceImpl;
import com.erp.utils.Message;
import com.erp.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/role")
public class roleController {

    @Autowired
    private roleServiceImpl roLeServiceImpl;

    @GetMapping("/list")
    public Message selectAllItem(){
    return MessageUtil.success("success",roLeServiceImpl.selectAll());
    }

    @GetMapping("findCategoryById")
    public Message findById(Long id){
       return   MessageUtil.success("success",roLeServiceImpl.findById(id));
    }
    @GetMapping("/deleteCategoryById")
    public int deleteById(Long id){
        return roLeServiceImpl.deleteById(id);
    }

    @PostMapping("/insertOrUpdate")
    public  Message insertOrUpdate(role role){
        if(role.getId()!=null){
            roLeServiceImpl.update(role);
          return MessageUtil.success("success");
        }

        roLeServiceImpl.insert(role);
        return MessageUtil.success("success");
    }

    @PostMapping("create")
    public void  create (role role){
        roLeServiceImpl.insert(role);
    }


//    @PostMapping("/ubi")
//    public int updateById(@RequestBody item item){
//        return itemService.update(item);
//    }

    @PostMapping("batchDelete")
    public void  batchDelete (long[] ids){
        for (long a:ids) {
            roLeServiceImpl.deleteById(a);
        }
    }

    @PostMapping("query")
    public Message query(role role){
        List<role> list=roLeServiceImpl.query(role);
        return MessageUtil.success("success",list);
    }


}
