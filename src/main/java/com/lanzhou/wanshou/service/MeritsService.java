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

    /**
     * 新增功德回向
     *
     * @return
     */
    Integer insertMerit(MeritsDirection meritsDirection);

    /**
     * 删除功德回向
     *
     * @param meritsDirection
     * @return
     */
    Integer deleteMerit(MeritsDirection meritsDirection);

    /**
     * 修改功德回向
     *
     * @param meritsDirection
     * @return
     */
    Integer updateMerit(MeritsDirection meritsDirection);

}
