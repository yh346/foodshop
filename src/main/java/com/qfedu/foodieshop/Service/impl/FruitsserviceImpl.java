package com.qfedu.foodieshop.Service.impl;

import com.qfedu.foodieshop.Service.Fruitsservice;
import com.qfedu.foodieshop.mapper.FruitsMapper;
import com.qfedu.foodieshop.pojo.Fruits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitsserviceImpl implements Fruitsservice {

    @Autowired
    private FruitsMapper fruitsMapper;
    @Override
    public List<Fruits> getAllFruits() {

        List<Fruits> fruits = fruitsMapper.selectAll();
        return fruits;
    }
}
