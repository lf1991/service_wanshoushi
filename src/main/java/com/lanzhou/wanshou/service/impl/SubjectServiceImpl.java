package com.lanzhou.wanshou.service.impl;

import com.lanzhou.wanshou.dao.SubjectInfoMapper;
import com.lanzhou.wanshou.dao.UserInfoMapper;
import com.lanzhou.wanshou.entity.SubjectInfo;
import com.lanzhou.wanshou.entity.UserInfo;
import com.lanzhou.wanshou.service.SubjectService;
import com.lanzhou.wanshou.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {


    @Resource
    private SubjectInfoMapper subjectInfoMapper;

    @Override
    public List<SubjectInfo> queryAllSubject() {
        return subjectInfoMapper.selectAll();
    }

    @Override
    public Integer insertSubject(SubjectInfo subjectInfo) {
        return null;
    }

    @Override
    public Integer deleteSubject(SubjectInfo subjectInfo) {
        return null;
    }

    @Override
    public Integer updateSubject(SubjectInfo subjectInfo) {
        return null;
    }

    @Override
    public List<String> queryAllUnits() {
        return subjectInfoMapper.queryAllUnits();
    }
}
