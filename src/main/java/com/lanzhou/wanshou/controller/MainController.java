package com.lanzhou.wanshou.controller;


import com.lanzhou.wanshou.entity.UserInfo;
import com.lanzhou.wanshou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("main")
public class MainController {

    @Autowired
    private UserService userService;

    /**
     * 模块管理
     *
     * @return
     */
    @GetMapping(path = "/queryUserById")
    public UserInfo queryUserById() {
        return userService.findUserById(1);
    }

    @GetMapping(path = "/queryUserById")
    public void queryGeographic() {

    }

}
