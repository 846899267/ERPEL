package com.erp.service.impl;

import com.erp.mapper.categoryMapper;
import com.erp.mapper.guanliMapper;
import com.erp.pojo.category;
import com.erp.pojo.guanli;
import com.erp.pojo.item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class categoryServiceImpl {
@Autowired
private categoryMapper categoryMapper ;

    public List<category> selectAll(){
        return categoryMapper.selectAll();
    }
    public int deleteById(Long id){
        return categoryMapper.deleteByPrimaryKey(id);
    }
    public int insert(category category){
        return categoryMapper.insertSelective(category);
    }
    public int update(category category){
        return categoryMapper.updateByPrimaryKeySelective(category);
    }
    public List<category> query(category cc ){
        Example e=new Example(category.class);
        Example.Criteria c=e.createCriteria();
        c.andLike("name","%"+cc.getName()+"%");
        return categoryMapper.selectByExample(e);
    }
    public List<category> findById(Long id){
        category c=new category();
        c.setId(id);
       return  categoryMapper.select(c);
    }
}
