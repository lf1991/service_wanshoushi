package com.lanzhou.wanshou.service;

import com.lanzhou.wanshou.entity.SubjectInfo;
import com.lanzhou.wanshou.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SubjectService {

    /**
     * 查询所有的科目
     *
     * @return
     */
    List<SubjectInfo> queryAllSubject();

    /**
     * 新增科目
     *
     * @param subjectInfo
     */
    Integer insertSubject(SubjectInfo subjectInfo);


    /**
     * 删除科目
     *
     * @param subjectInfo
     * @return
     */
    Integer deleteSubject(SubjectInfo subjectInfo);

    /**
     * 修改科目
     *
     * @param subjectInfo
     * @return
     */
    Integer updateSubject(SubjectInfo subjectInfo);

    /**
     * 查询所有单位
     *
     * @return
     */
    List<String> queryAllUnits();
}
