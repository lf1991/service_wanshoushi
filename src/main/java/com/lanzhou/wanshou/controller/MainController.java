package com.lanzhou.wanshou.controller;


import com.alibaba.fastjson.JSONObject;
import com.lanzhou.wanshou.entity.*;
import com.lanzhou.wanshou.service.MainService;
import com.lanzhou.wanshou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
     * 登录接口
     *
     * @return
     */
    @PostMapping(path = "/login")
    @ResponseBody
    public JSONObject login(@RequestBody UserInfo user) {
        JSONObject json = new JSONObject();
        json.put("errcode", 0);
        //List<Province> allProvince = mainService.queryAllProvince();
        json.put("data", null);
        json.put("message", "success");
        return json;
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

    /**
     * 课程选择
     *
     * @param signList
     * @return
     */
    @PostMapping(path = "/submitSubjcet")
    @ResponseBody
    public JSONObject submitSubjcet(@RequestBody List<SignRecord> signList) {

        JSONObject json = new JSONObject();
        List<SignRecord> subjectSign = new ArrayList<SignRecord>();
        json.put("errcode", 0);

        for (int i = 0; i < signList.size(); i++) {
            SignRecord record = signList.get(i);
            Date subjectSelectDate = record.getSubjectSelectDate();
            if (subjectSelectDate == null) {

//                DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                String submitDate = dFormat.format(new Date());
                record.setSubjectSelectDate(new Date());

            }
            record.setUserId(1);
            record.setSignTime(new Date());
            subjectSign.add(record);
        }
        int result = mainService.submitSubjcet(subjectSign);
        json.put("data", result);
        json.put("message", "success");
        return json;
    }

    /**
     * 已选课程查询
     *
     * @param userId
     * @return
     */
    @GetMapping(path = "/querySubjectSelect/{userId}")
    @ResponseBody
    public JSONObject querySubjectSelect(@PathVariable Integer userId) {

        JSONObject json = new JSONObject();
        json.put("errcode", 0);
        List<SignRecord> result = mainService.querySubjectSelect(userId);
        json.put("data", result);
        json.put("message", "success");
        return json;
    }

    /**
     * 每日填到
     *
     * @param fillList
     * @return
     */
    @PostMapping(path = "/submitFill")
    @ResponseBody
    public JSONObject submitFill(@RequestBody List<SignRecord> fillList) {

        JSONObject json = new JSONObject();
        json.put("data", null);
        json.put("message", "success");
        return json;
    }
}
