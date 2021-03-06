package com.lanzhou.wanshou.service.impl;

import com.lanzhou.wanshou.dao.SubjectInfoMapper;
import com.lanzhou.wanshou.dao.UserInfoMapper;
import com.lanzhou.wanshou.entity.SubjectInfo;
import com.lanzhou.wanshou.entity.UserInfo;
import com.lanzhou.wanshou.service.SubjectService;
import com.lanzhou.wanshou.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {


    @Resource
    private UserInfoMapper mapper;

    @Override
    public UserInfo findUserById(Integer id) {
        return mapper.selectByPrimaryKey(1);
    }
}
