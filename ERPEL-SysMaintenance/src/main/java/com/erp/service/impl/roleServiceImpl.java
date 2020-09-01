package com.erp.service.impl;

import com.erp.mapper.categoryMapper;
import com.erp.mapper.roleMapper;
import com.erp.pojo.category;
import com.erp.pojo.role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class roleServiceImpl {
@Autowired
private roleMapper roleMapper ;

    public List<role> selectAll(){
        return roleMapper.selectAll();
    }
    public int deleteById(Long id){
        return roleMapper.deleteByPrimaryKey(id);
    }
    public int insert(role role){
        return roleMapper.insertSelective(role);
    }
    public int update(role role){
        return roleMapper.updateByPrimaryKeySelective(role);
    }
    public List<role> query(role cc ){
        Example e=new Example(role.class);
        Example.Criteria c=e.createCriteria();
        c.andLike("name","%"+cc.getRolename()+"%");
        return roleMapper.selectByExample(e);
    }
    public List<role> findById(Long id){
        role c=new role();
        c.setId(id);
       return  roleMapper.select(c);
    }
}
