package com.erp.service.impl;

import com.erp.mapper.gongyingshangMapper;
import com.erp.mapper.itemMapper;
import com.erp.pojo.category;
import com.erp.pojo.gongyingshang;
import com.erp.pojo.item;
import com.erp.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class gongyingshangServiceImpl  {
@Autowired
private gongyingshangMapper gongyingshangMapper ;
    public List<gongyingshang> selectByName(String name) {
        gongyingshang gongyingshang=new gongyingshang();
        gongyingshang.setName(name);
        return gongyingshangMapper.select(gongyingshang);
    }
    public List<gongyingshang> selectAll(){
        return gongyingshangMapper.selectAll();
    }
    public int deleteById(Long id){
        return gongyingshangMapper.deleteByPrimaryKey(id);
    }
    public int insert(gongyingshang gongyingshang){
        return gongyingshangMapper.insertSelective(gongyingshang);
    }
    public int update(gongyingshang gongyingshang){
        return gongyingshangMapper.updateByPrimaryKeySelective(gongyingshang);
    }
    public List<gongyingshang> query(gongyingshang gongyingshang){
        Example e=new Example(gongyingshang.class);
        Example.Criteria c=e.createCriteria();
        c.andLike("name","%"+gongyingshang.getName()+"%");
        return gongyingshangMapper.selectByExample(e);
    }
    public List<gongyingshang> findById(Long id){
        gongyingshang c=new gongyingshang();
        c.setId(id);
        return  gongyingshangMapper.select(c);
    }
}
