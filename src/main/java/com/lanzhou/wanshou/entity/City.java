package com.lanzhou.wanshou.entity;

import java.io.Serializable;

public class City implements Serializable {
    private Integer cityId;

    private Integer pId;

    private String cityName;

    private static final long serialVersionUID = 1L;

    public City(Integer cityId, Integer pId, String cityName) {
        this.cityId = cityId;
        this.pId = pId;
        this.cityName = cityName;
    }

    public City() {
        super();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }
}