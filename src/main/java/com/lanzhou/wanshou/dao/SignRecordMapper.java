package com.lanzhou.wanshou.dao;

import com.lanzhou.wanshou.entity.SignRecord;
import com.lanzhou.wanshou.entity.SignRecordKey;

import java.util.List;

public interface SignRecordMapper {
    int deleteByPrimaryKey(SignRecordKey key);

    int insert(SignRecord record);

    int insertSelective(SignRecord record);

    SignRecord selectByPrimaryKey(SignRecordKey key);

    int updateByPrimaryKeySelective(SignRecord record);

    int updateByPrimaryKey(SignRecord record);

    int insertByList(List<SignRecord> list);

    List<SignRecord> querySubjectSelect(Integer userId);
}