package com.lanzhou.wanshou.controller;


import com.alibaba.fastjson.JSONObject;
import com.lanzhou.wanshou.entity.MeritsDirection;
import com.lanzhou.wanshou.entity.SubjectInfo;
import com.lanzhou.wanshou.service.MeritsService;
import com.lanzhou.wanshou.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("merits")
public class MeritsController {

    @Autowired
    private MeritsService meritsService;

    /**
     * 模块管理
     *
     * @return
     */
    @GetMapping(path = "/queryAllMerits")
    public JSONObject queryAllMerits() {
        JSONObject json = new JSONObject();
        json.put("errcode", 0);
        List<MeritsDirection> meritsReturn = meritsService.queryAllMerits();
      /*  JSONObject data=new JSONObject();
        data.put("meritsReturn", meritsReturn);*/
        json.put("data", meritsReturn);
        json.put("message", "success");
        return json;
    }

    @PostMapping(path = "/insertMerit")
    @ResponseBody
    public JSONObject insertMerit(@RequestBody MeritsDirection merit) {

        JSONObject json = new JSONObject();
        json.put("errcode", 0);
        Integer result = meritsService.insertMerit(merit);
        json.put("data", result);
        json.put("message", "success");
        return json;
    }


    @PostMapping(path = "/deleteMerit")
    @ResponseBody
    public JSONObject deleteMerit(@RequestBody MeritsDirection merit) {
        JSONObject json = new JSONObject();
        json.put("errcode", 0);
        Integer result = meritsService.deleteMerit(merit);
        json.put("data", result);
        json.put("message", "success");
        return json;
    }

    @PostMapping(path = "/updateMerit")
    @ResponseBody
    public JSONObject updateMerit(@RequestBody MeritsDirection merit) {
        JSONObject json = new JSONObject();
        json.put("errcode", 0);
        Integer result = meritsService.updateMerit(merit);
        json.put("data", result);
        json.put("message", "success");
        return json;
    }

}
