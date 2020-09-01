package com.erp.mapper;

import com.erp.pojo.item;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.base.select.SelectAllMapper;

import java.util.List;
import java.util.Map;

public interface itemMapper extends Mapper<item> {
    @Select("select name from item")
    public List<String> findName();
    @Select("select kucun from item")
    public List<String>  findKucun();
    @Select("select kucun from item where name='交流电缆'")
    public List<String>  findjiaoliu();
    @Select("select kucun from item where name='直流电缆'")
    public List<String>  findzhiliu();
    @Select("select kucun from item where name='绝缘层'")
    public List<String>  findjueyuan();
    @Select("select name,kucun from item")
    public  Map<String,String> findboth();
    @Select("select kucun from item where id=#{id}")
    public Long  findKucun2(@Param("id") Long id);
}
