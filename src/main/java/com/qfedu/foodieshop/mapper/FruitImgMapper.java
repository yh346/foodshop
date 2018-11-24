package com.qfedu.foodieshop.mapper;

import com.qfedu.foodieshop.pojo.FruitImg;

public interface FruitImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FruitImg record);

    int insertSelective(FruitImg record);

    FruitImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FruitImg record);

    int updateByPrimaryKey(FruitImg record);
}