package com.lanzhou.wanshou.entity;

import java.io.Serializable;

public class Province implements Serializable {
    private Integer pId;

    private String provinceName;

    private static final long serialVersionUID = 1L;

    public Province(Integer pId, String provinceName) {
        this.pId = pId;
        this.provinceName = provinceName;
    }

    public Province() {
        super();
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }
}