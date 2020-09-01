package com.erp.mapper;

import com.erp.pojo.user;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface loginMapper extends Mapper<user> {
@Select("select password,role from user where username=#{username}")
    public Map<String,String> findByName(@Param("username") String username);
    @Select("select password,role from user where username='ccc'")
    public Map<String,String> findByName2();
}
