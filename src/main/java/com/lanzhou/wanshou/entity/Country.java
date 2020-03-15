package com.lanzhou.wanshou.entity;

import java.io.Serializable;

public class Country implements Serializable {
    private Integer countryId;

    private Integer cityId;

    private Integer pId;

    private String countryName;

    private static final long serialVersionUID = 1L;

    public Country(Integer countryId, Integer cityId, Integer pId, String countryName) {
        this.countryId = countryId;
        this.cityId = cityId;
        this.pId = pId;
        this.countryName = countryName;
    }

    public Country() {
        super();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
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

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }
}