package com.lanzhou.wanshou.service.impl;

import com.lanzhou.wanshou.dao.SubjectInfoMapper;
import com.lanzhou.wanshou.dao.UserInfoMapper;
import com.lanzhou.wanshou.entity.SubjectInfo;
import com.lanzhou.wanshou.entity.UserInfo;
import com.lanzhou.wanshou.service.SubjectService;
import com.lanzhou.wanshou.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
        String subjectName = subjectInfo.getName();
        String unit = subjectInfo.getName();
        if (StringUtils.isEmpty(subjectName) || StringUtils.isEmpty(unit)) {
            return -1;
        }
        subjectInfoMapper.insert(subjectInfo);
        return 1;
    }

    @Override
    public Integer deleteSubject(SubjectInfo subjectInfo) {
        Integer id = subjectInfo.getId();
        if (id == null) return -1;
        subjectInfoMapper.deleteByPrimaryKey(id);
        return 1;
    }

    @Override
    public Integer updateSubject(SubjectInfo subjectInfo) {
        Integer id = subjectInfo.getId();
        String dubjectName = subjectInfo.getName();
        if (id == null || dubjectName.equals("")) return -1;
        subjectInfoMapper.updateByPrimaryKeySelective(subjectInfo);
        return 1;
    }

    @Override
    public List<String> queryAllUnits() {
        return subjectInfoMapper.queryAllUnits();
    }
}
