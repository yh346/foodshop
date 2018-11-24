package com.qfedu.foodieshop.mapper;

import com.qfedu.foodieshop.pojo.User;
import org.apache.ibatis.annotations.Insert;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

   // @Insert("insert into user(username,email,password)values(#{username},#{email},#{password})")
    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}