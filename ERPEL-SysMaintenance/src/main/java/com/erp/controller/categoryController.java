package com.erp.controller;

import com.erp.mapper.categoryMapper;
import com.erp.pojo.category;
import com.erp.pojo.item;
import com.erp.service.impl.categoryServiceImpl;
import com.erp.service.impl.itemServiceImpl;
import com.erp.utils.Message;
import com.erp.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/category")
public class categoryController {

    @Autowired
    private categoryServiceImpl categoryService;
    @Autowired
    private categoryMapper categoryMapper;
    @GetMapping("/findAll")
    public Message selectAllItem(){
    return MessageUtil.success("success",categoryService.selectAll());
    }

    @GetMapping("findCategoryById")
    public Message findById(Long id){
       return   MessageUtil.success("success",categoryService.findById(id));
    }
    @GetMapping("/deleteById")
    public int deleteById(Long id){
        return categoryService.deleteById(id);
    }

@GetMapping("findAllProductWithCategory")
public Message findAllProductWithCategory(Long id){
    return   MessageUtil.success("success",categoryMapper.findAllProductWithCategory(id));
}
    @GetMapping("findAllProductWithGid")
    public Message findAllProductWithGid(Long id){
        return   MessageUtil.success("success",categoryMapper.findAllProductWithGid(id));
    }

    @PostMapping("/insertOrUpdate")
    public  Message insertOrUpdate(category category){
        if(category.getId()!=null){
            categoryService.update(category);
          return MessageUtil.success("success");
        }

        categoryService.insert(category);
        return MessageUtil.success("success");
    }

//    @PostMapping("/ubi")
//    public int updateById(@RequestBody item item){
//        return itemService.update(item);
//    }

    @PostMapping("batchDelete")
    public void  batchDelete (long[] ids){
        for (long a:ids) {
            categoryService.deleteById(a);
        }
    }

    @PostMapping("query")
    public Message query(category category){
        List<category> list=categoryService.query(category);
        return MessageUtil.success("success",list);
    }
}
