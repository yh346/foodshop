package com.qfedu.foodieshop.mapper;

import com.qfedu.foodieshop.pojo.FoodImg;

public interface FoodImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FoodImg record);

    int insertSelective(FoodImg record);

    FoodImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FoodImg record);

    int updateByPrimaryKey(FoodImg record);
}