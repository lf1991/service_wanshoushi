package com.lanzhou.wanshou.service;

import com.lanzhou.wanshou.entity.City;
import com.lanzhou.wanshou.entity.Country;
import com.lanzhou.wanshou.entity.Province;

import java.util.List;


public interface MainService {
    List<Province> queryAllProvince();

    List<City> queryCityByPid(Integer pId);

    List<Country> queryCountryByCityId(Integer cityId);
}
