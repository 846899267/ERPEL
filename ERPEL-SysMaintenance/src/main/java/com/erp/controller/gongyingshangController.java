package com.erp.controller;

import com.erp.pojo.gongyingshang;
import com.erp.pojo.item;
import com.erp.service.impl.gongyingshangServiceImpl;
import com.erp.service.itemService;
import com.erp.utils.Message;
import com.erp.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("waiter")
public class gongyingshangController {

    @Autowired
    private gongyingshangServiceImpl gongyingshangService;

    @GetMapping("/findAll")
    public Message selectAllItem(){
        return MessageUtil.success("success",gongyingshangService.selectAll());
    }

    @GetMapping("/deleteWaiterById")
    public int deleteById(Long id){
        return gongyingshangService.deleteById(id);
    }

    @PostMapping("/insertOrUpdate")
    public  Message insertOrUpdate(gongyingshang gongyingshang){
        if(gongyingshang.getId()!=null){
            gongyingshangService.update(gongyingshang);
            return MessageUtil.success("success");
        }

        gongyingshangService.insert(gongyingshang);
        return MessageUtil.success("success");
    }

    //    @PostMapping("/ubi")
//    public int updateById(@RequestBody item item){
//        return itemService.update(item);
//    }
    @PostMapping("batchDelete")
    public void  batchDelete (long[] ids){
        for (long a:ids) {
            gongyingshangService.deleteById(a);
        }
    }

    @PostMapping("query")
    public Message query(gongyingshang gongyingshang){
        List<gongyingshang> list=gongyingshangService.query(gongyingshang);
        return MessageUtil.success("success",list);
    }
    @GetMapping("findwaiterById")
    public Message findById(Long id){
        return   MessageUtil.success("success",gongyingshangService.findById(id));
    }
}
