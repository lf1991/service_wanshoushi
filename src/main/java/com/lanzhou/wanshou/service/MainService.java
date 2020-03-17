package com.lanzhou.wanshou.service;

import com.lanzhou.wanshou.entity.City;
import com.lanzhou.wanshou.entity.Country;
import com.lanzhou.wanshou.entity.Province;
import com.lanzhou.wanshou.entity.SignRecord;

import java.util.List;


public interface MainService {
    List<Province> queryAllProvince();

    List<City> queryCityByPid(Integer pId);

    List<Country> queryCountryByCityId(Integer cityId);

    Integer submitSubjcet(List<SignRecord> submitList);

    List<SignRecord> querySubjectSelect(Integer userId);
}
