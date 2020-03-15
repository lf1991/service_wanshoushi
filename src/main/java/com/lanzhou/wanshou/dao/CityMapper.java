package com.lanzhou.wanshou.dao;

import com.lanzhou.wanshou.entity.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {

    List<City> queryCityByPid(Integer pId);

    int deleteByPrimaryKey(Integer cityId);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer cityId);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}