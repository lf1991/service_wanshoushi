package com.lanzhou.wanshou.dao;

import com.lanzhou.wanshou.entity.SubjectInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SubjectInfoMapper {

    List<SubjectInfo> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(SubjectInfo record);

    int insertSelective(SubjectInfo record);

    SubjectInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SubjectInfo record);

    int updateByPrimaryKey(SubjectInfo record);

    List<String> queryAllUnits();
}