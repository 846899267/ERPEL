package com.erp.service;

import com.erp.pojo.item;

import java.util.List;

public interface itemService {
    List<item> selectByName(String name);
    List<item> selectAll();
    int deleteById(Long id);
     int insert(item item);
    int update(item item);
}
