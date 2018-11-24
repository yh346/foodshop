package com.qfedu.foodieshop.mapper;

import com.qfedu.foodieshop.pojo.Totel;

public interface TotelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Totel record);

    int insertSelective(Totel record);

    Totel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Totel record);

    int updateByPrimaryKey(Totel record);
}