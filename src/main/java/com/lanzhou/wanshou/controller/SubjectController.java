package com.lanzhou.wanshou.controller;


import com.alibaba.fastjson.JSONObject;
import com.lanzhou.wanshou.entity.MeritsDirection;
import com.lanzhou.wanshou.entity.SubjectInfo;
import com.lanzhou.wanshou.entity.UserInfo;
import com.lanzhou.wanshou.service.SubjectService;
import com.lanzhou.wanshou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    /**
     * 查询所有课目
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

    @PostMapping(path = "/insertSubject")
    @ResponseBody
    public JSONObject insertSubject(@RequestBody SubjectInfo subjectInfo) {

        JSONObject json = new JSONObject();
        json.put("errcode", 0);
        Integer result = subjectService.insertSubject(subjectInfo);
        json.put("data", result);
        json.put("message", "success");
        return json;
    }


    @PostMapping(path = "/deleteSubject")
    @ResponseBody
    public JSONObject deleteSubject(@RequestBody SubjectInfo subjectInfo) {
        JSONObject json = new JSONObject();
        json.put("errcode", 0);
        Integer result = subjectService.deleteSubject(subjectInfo);
        json.put("data", result);
        json.put("message", "success");
        return json;
    }

    @PostMapping(path = "/updateSubject")
    @ResponseBody
    public JSONObject updateSubject(@RequestBody SubjectInfo subjectInfo) {
        JSONObject json = new JSONObject();
        json.put("errcode", 0);
        Integer result = subjectService.updateSubject(subjectInfo);
        json.put("data", result);
        json.put("message", "success");
        return json;
    }

    /**
     * 查询科=课目单位
     *
     * @return
     */
    @GetMapping(path = "/queryAllUnits")
    public JSONObject queryAllUnits() {
        JSONObject json = new JSONObject();
        json.put("errode", 0);
        List<String> data = subjectService.queryAllUnits();
        json.put("data", data);
        json.put("message", "success");
        return json;
    }
}
