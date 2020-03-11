package com.lanzhou.wanshou.dao;

import com.lanzhou.wanshou.entity.MeritsDirection;

import java.util.List;

public interface MeritsDirectionMapper {

    List<MeritsDirection> queryAllMerits();

    int deleteByPrimaryKey(Integer id);

    int insert(MeritsDirection record);

    int insertSelective(MeritsDirection record);

    MeritsDirection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MeritsDirection record);

    int updateByPrimaryKey(MeritsDirection record);
}