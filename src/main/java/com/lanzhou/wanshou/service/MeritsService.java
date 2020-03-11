package com.lanzhou.wanshou.service;

import com.lanzhou.wanshou.entity.MeritsDirection;
import com.lanzhou.wanshou.entity.SubjectInfo;

import java.util.List;


public interface MeritsService {

    /**
     * 查询所有功德回向
     *
     * @return
     */
    List<MeritsDirection> queryAllMerits();

}
