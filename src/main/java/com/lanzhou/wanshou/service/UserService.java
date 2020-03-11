package com.lanzhou.wanshou.service;

import com.lanzhou.wanshou.entity.User;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    User findUserById(Integer id);
}
