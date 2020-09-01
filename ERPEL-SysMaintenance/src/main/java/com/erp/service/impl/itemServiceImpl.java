package com.erp.service.impl;

import com.erp.mapper.itemMapper;
import com.erp.pojo.item;
import com.erp.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Service
public class itemServiceImpl implements itemService {
@Autowired
private itemMapper itemMapper ;
    public List<item> selectByName(String name) {
        item item=new item();
        item.setName(name);
        return itemMapper.select(item);
    }
    public List<item> selectAll(){
        return itemMapper.selectAll();
    }
    public int deleteById(Long id){
        return itemMapper.deleteByPrimaryKey(id);
    }
    public item findById(Long id){
        return itemMapper.selectByPrimaryKey(id);
    }
    public int insert(item item){
        return itemMapper.insertSelective(item);
    }
    public int update(item item){
        return itemMapper.updateByPrimaryKeySelective(item);
    }
    public List<item> query(item item){
        Example e=new Example(item.class);
        Example.Criteria c=e.createCriteria();
        c.andLike("name","%"+item.getName()+"%");
        return itemMapper.selectByExample(e);
    }
    public void fenxi(long[] ids,long yuqi){
        item item=new item();
        Long c=0l;
        for (long a:ids)
        {c=yuqi- itemMapper.findKucun2(a);
        item.setId(a);
        item.setYuqi(c);
        itemMapper.updateByPrimaryKeySelective(item);

        }

    }
}
