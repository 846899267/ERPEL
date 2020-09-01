package com.erp.service.impl;

import com.erp.mapper.caigouMapper;
import com.erp.mapper.itemMapper;
import com.erp.pojo.caigou;
import com.erp.pojo.item;
import com.erp.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class caigouServiceImpl {
@Autowired
private caigouMapper caigouMapper ;
    public List<caigou> selectByIName(String name) {
        caigou caigou=new caigou();
        caigou.setIname(name);
        return caigouMapper.select(caigou);
    }
    public List<caigou> selectAll(){
        return caigouMapper.selectAll();
    }
    public int deleteById(Long id){
        return caigouMapper.deleteByPrimaryKey(id);
    }
    public int insert(caigou caigou){
        return caigouMapper.insertSelective(caigou);
    }
    public int update(caigou caigou){
        return caigouMapper.updateByPrimaryKeySelective(caigou);
    }

}
