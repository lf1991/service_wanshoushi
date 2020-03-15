package com.lanzhou.wanshou.dao;

import com.lanzhou.wanshou.entity.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountryMapper {

    List<Country> queryCountryByCityId(Integer cityId);

    int deleteByPrimaryKey(Integer countryId);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(Integer countryId);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);
}