package com.qfedu.foodieshop.mapper;

import com.qfedu.foodieshop.pojo.Foods;

public interface FoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Foods record);

    int insertSelective(Foods record);

    Foods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Foods record);

    int updateByPrimaryKey(Foods record);
}