package com.erp.controller;

import com.erp.mapper.itemMapper;
import com.erp.pojo.item;
import com.erp.service.impl.itemServiceImpl;

import com.erp.utils.Message;
import com.erp.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/product")
public class itemController {

    @Autowired
    private itemServiceImpl itemService;
    @Autowired
    private itemMapper itemMapper;

    @GetMapping("/findAll")
    public Message selectAllItem(){
    return MessageUtil.success("success",itemService.selectAll());
    }

    @GetMapping("/deleteProductById")
    public int deleteById(Long id){
        return itemService.deleteById(id);
    }
    @GetMapping("/findProductById")
    public Message findById(Long id){
        return MessageUtil.success("success",itemService.findById(id));
    }

    @GetMapping("/findName")
    public Message findName(){
        return MessageUtil.success("success",itemMapper.findName());
    }
    @GetMapping("/findKucun")
    public Message findKucun(){
        return MessageUtil.success("success",itemMapper.findKucun());
    }
    @GetMapping("/findjiaoliu")
    public Message findjiaoliu(){
        return MessageUtil.success("success",itemMapper.findjiaoliu());
    }
    @GetMapping("/findzhiliu")
    public Message findzhiliu(){
        return MessageUtil.success("success",itemMapper.findzhiliu());
    }
    @GetMapping("/findjueyuan")
    public Message findjueyuan(){
        return MessageUtil.success("success",itemMapper.findjueyuan());
    }
    @GetMapping("/findBoth")
    public Message findBoth(){
        return MessageUtil.success("success",itemMapper.findboth());
    }
    @PostMapping("/batchDelete")
    public void  batchDelete (long[] ids){for (long a:ids) {itemService.deleteById(a);}}
    @PostMapping("/fenxi")
    public void fenxi (long[] ids,long yuqi){
        itemService.fenxi(ids,yuqi);
    }

    @PostMapping("/insertOrUpdate")
    public  Message insertOrUpdate(item item){
        if(item.getId()!=null){
            itemService.update(item);
            return MessageUtil.success("success");
        }

        itemService.insert(item);
        return MessageUtil.success("success");
    }

    @PostMapping("query")
    public Message query(item item){
        List<item> list=itemService.query(item);
        return MessageUtil.success("success",list);
    }
}
