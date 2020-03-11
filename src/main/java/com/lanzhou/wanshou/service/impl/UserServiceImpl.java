package com.lanzhou.wanshou.service.impl;

import com.lanzhou.wanshou.entity.User;
import com.lanzhou.wanshou.dao.UserDao;
import com.lanzhou.wanshou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.ws.RespectBinding;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过用户Id获取用户信息
     *
     * @param id
     * @return
     */
    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }
}
