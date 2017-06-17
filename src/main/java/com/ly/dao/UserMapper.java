package com.ly.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


import com.ly.entity.User;
import com.sun.tools.javac.util.List;

/**
 * 
 * @Description:user dao
 * @author liuyang
 * @data  2017-6-17 上午10:12:10
 *
 */

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectByParams(Map<String, String> params);
}