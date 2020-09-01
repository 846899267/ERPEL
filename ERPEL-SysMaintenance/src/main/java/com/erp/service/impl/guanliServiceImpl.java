package com.erp.service.impl;

import com.erp.mapper.caigouMapper;
import com.erp.mapper.guanliMapper;
import com.erp.pojo.caigou;
import com.erp.pojo.category;
import com.erp.pojo.guanli;
import com.erp.pojo.item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class guanliServiceImpl {
@Autowired
private guanliMapper guanliMapper ;
    public List<guanli> selectByIName(String name) {
        guanli guanli=new guanli();
        guanli.setIname(name);
        return guanliMapper.select(guanli);
    }
    public List<guanli> selectAll(){
        return guanliMapper.selectAll();
    }
    public int deleteById(Long id){
        return guanliMapper.deleteByPrimaryKey(id);
    }
    public int insert(guanli guanli){
        return guanliMapper.insertSelective(guanli);
    }
    public int update(guanli guanli){
        return guanliMapper.updateByPrimaryKeySelective(guanli);
    }
    public List<guanli> query(guanli cc ){
        Example e=new Example(guanli.class);
        Example.Criteria c=e.createCriteria();
        c.andLike("name","%"+cc.getIname()+"%");
        return guanliMapper.selectByExample(e);
    }
    public List<guanli> findById(Long id){
        guanli c=new guanli();
        c.setId(id);
        return  guanliMapper.select(c);
    }
}
