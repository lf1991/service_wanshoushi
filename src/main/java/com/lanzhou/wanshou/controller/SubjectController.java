package com.lanzhou.wanshou.controller;


import com.alibaba.fastjson.JSONObject;
import com.lanzhou.wanshou.entity.SubjectInfo;
import com.lanzhou.wanshou.entity.UserInfo;
import com.lanzhou.wanshou.service.SubjectService;
import com.lanzhou.wanshou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    /**
     * 模块管理
     *
     * @return
     */
    @GetMapping(path = "/queryAllSubject")
    public JSONObject queryAllSubject() {
        JSONObject json = new JSONObject();
        json.put("errode", 0);
        List<SubjectInfo> data = subjectService.queryAllSubject();
        json.put("data", data);
        json.put("message", "success");
        return json;
    }


}
