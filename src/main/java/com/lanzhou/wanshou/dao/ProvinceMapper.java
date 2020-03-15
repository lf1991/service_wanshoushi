package com.lanzhou.wanshou.dao;

import com.lanzhou.wanshou.entity.Province;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProvinceMapper {

    List<Province> queryAllProvince();

    int deleteByPrimaryKey(Integer pId);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
}