package com.lanzhou.wanshou.controller;


import com.alibaba.fastjson.JSONObject;
import com.lanzhou.wanshou.entity.*;
import com.lanzhou.wanshou.service.MainService;
import com.lanzhou.wanshou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("main")
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private MainService mainService;

    /**
     * 模块管理
     *
     * @return
     */
    @GetMapping(path = "/queryUserById")
    public UserInfo queryUserById() {
        return userService.findUserById(1);
    }

    /**
     * 查获地理省份
     *
     * @return
     */
    @GetMapping(path = "/queryAllProvince")
    public JSONObject queryAllProvince() {

        JSONObject json = new JSONObject();
        json.put("errcode", 0);
        List<Province> allProvince = mainService.queryAllProvince();
        json.put("data", allProvince);
        json.put("message", "success");
        return json;
    }

    /**
     * 查获地理市
     *
     * @return
     */


    @GetMapping(path = "/queryCityByPid/{pId}")
    @ResponseBody
    public JSONObject queryCityByPid(@PathVariable Integer pId) {
        JSONObject json = new JSONObject();
        json.put("errcode", 0);
        List<City> allProvince = mainService.queryCityByPid(pId);
        json.put("data", allProvince);
        json.put("message", "success");
        return json;
    }

    /**
     * 查获地理县
     *
     * @return
     */

    @GetMapping(path = "/queryCountryByCityId/{cityId}")
    @ResponseBody
    public JSONObject queryCountryByCityId(@PathVariable Integer cityId) {

        JSONObject json = new JSONObject();
        json.put("errcode", 0);
        List<Country> allProvince = mainService.queryCountryByCityId(cityId);
        json.put("data", allProvince);
        json.put("message", "success");
        return json;
    }
}
