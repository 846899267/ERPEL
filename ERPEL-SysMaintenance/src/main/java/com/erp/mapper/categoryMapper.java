package com.erp.mapper;

import com.erp.pojo.caigou;
import com.erp.pojo.category;
import com.erp.pojo.item;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface categoryMapper extends Mapper<category> {
    @Select("select * from item where item.cid=#{id}")
    public List<item> findAllProductWithCategory(@Param("id") Long id);
    @Select("select * from item where item.gid=#{id}")
    public List<item> findAllProductWithGid(@Param("id") Long id);
}
