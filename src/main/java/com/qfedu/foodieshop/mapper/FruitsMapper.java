package com.qfedu.foodieshop.mapper;

import com.qfedu.foodieshop.pojo.Fruits;

import java.util.List;

public interface FruitsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fruits record);

    int insertSelective(Fruits record);

    Fruits selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fruits record);

    int updateByPrimaryKey(Fruits record);

    List<Fruits> selectAll();
}