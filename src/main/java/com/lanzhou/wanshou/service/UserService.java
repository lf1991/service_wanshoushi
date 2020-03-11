package com.lanzhou.wanshou.service;

import com.lanzhou.wanshou.entity.UserInfo;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    UserInfo findUserById(Integer id);
}
