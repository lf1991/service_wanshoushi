package com.lanzhou.wanshou.controller;


import com.alibaba.fastjson.JSONObject;
import com.lanzhou.wanshou.entity.MeritsDirection;
import com.lanzhou.wanshou.entity.SubjectInfo;
import com.lanzhou.wanshou.service.MeritsService;
import com.lanzhou.wanshou.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("merits")
public class MeritsController {

    @Autowired
    private MeritsService meritsService;

    /**
     * 模块管理
     *
     * @return
     */
    @CrossOrigin
    @GetMapping(path = "/queryAllMerits")
    public JSONObject queryAllMerits() {
        JSONObject json = new JSONObject();
        json.put("errode", 0);
        List<MeritsDirection> data = meritsService.queryAllMerits();
        json.put("data", data);
        json.put("message", "success");
        return json;
    }
}
