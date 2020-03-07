package com.lanzhou.wanshou.controller;


import com.lanzhou.wanshou.bean.Moudle;
import com.lanzhou.wanshou.bean.Subject;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("main")
public class MainController {

    /**
     * 模块管理
     *
     * @return
     */
    @GetMapping(path = "/queryMoudles")
    public List<Moudle> queryMoudles() {
        List<Moudle> moudles = new ArrayList<Moudle>();
        for (int i = 0; i <= 10; i++) {
            Moudle moudle = new Moudle();
            moudle.setId(1);
            moudle.setName("共修科目");
            moudle.setBrief("南无啊弥陀拂...");
            moudles.add(moudle);
        }
        return moudles;
    }

    /**
     * 科目查询
     *
     * @return
     */
    @GetMapping(path = "/getSubjects")
    public List<Subject> querySubjects() {
        List<Subject> subjects = new ArrayList<Subject>();
        for (int i = 0; i <= 10; i++) {
            Subject subject = new Subject();
            subject.setId(1);
            subject.setName("金刚经");
            subject.setBrief("金刚经xxxxxx");
            subject.setChapterId(100);
            subjects.add(subject);
        }
        return subjects;
    }
    /**
     * 填到详情查询
     *
     * @return
     */
    @GetMapping(path = "/queryFillDetail")
    public List<Subject> fillIn() {
        return null;
    }

    /**
     * 每日填到
     *
     * @return
     */
    @PostMapping(path = "/fillIn")
    public void fillIn(@RequestBody Subject Subjects) {
        System.out.print(Subjects);
        Subject SubjectsTT = new Subject();
        SubjectsTT.setId(1);
        SubjectsTT.setName("lifei");
    }


}