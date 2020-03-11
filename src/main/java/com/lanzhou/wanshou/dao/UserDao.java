package com.lanzhou.wanshou.dao;

import com.lanzhou.wanshou.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


public interface UserDao {
    /**
     * 用户查询
     */
    User findUserById(Integer id);
}
