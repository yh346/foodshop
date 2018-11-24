package com.qfedu.foodieshop.Controller;

import com.qfedu.foodieshop.Service.Fruitsservice;
import com.qfedu.foodieshop.pojo.Fruits;
import com.qfedu.foodieshop.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FruitsController {

    @Autowired
    private Fruitsservice fruitsservice;

    @RequestMapping("/showFruits")

    public List<Fruits> showFruits() {
        List<Fruits> fruits = fruitsservice.getAllFruits();

        return fruits;


    }


}
