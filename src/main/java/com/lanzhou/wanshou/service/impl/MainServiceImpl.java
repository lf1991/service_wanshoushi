package com.lanzhou.wanshou.service.impl;

import com.lanzhou.wanshou.dao.CityMapper;
import com.lanzhou.wanshou.dao.CountryMapper;
import com.lanzhou.wanshou.dao.ProvinceMapper;
import com.lanzhou.wanshou.entity.City;
import com.lanzhou.wanshou.entity.Country;
import com.lanzhou.wanshou.entity.Province;
import com.lanzhou.wanshou.service.MainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class MainServiceImpl implements MainService {


    @Resource
    private ProvinceMapper provinceMapper;

    @Resource
    private CityMapper cityMapper;

    @Resource
    private CountryMapper countryMapper;

    @Override
    public List<Province> queryAllProvince() {
        return provinceMapper.queryAllProvince();
    }

    @Override
    public List<City> queryCityByPid(Integer pId) {
        return cityMapper.queryCityByPid(pId);
    }

    @Override
    public List<Country> queryCountryByCityId(Integer cityId) {
        return countryMapper.queryCountryByCityId(cityId);
    }
}
