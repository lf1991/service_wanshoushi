package com.lanzhou.wanshou.entity;

import java.io.Serializable;

public class SubjectInfo implements Serializable {
    private Integer id;

    private String name;

    private String brief;

    private String unit;

    private static final long serialVersionUID = 1L;

    public SubjectInfo(Integer id, String name, String brief, String unit) {
        this.id = id;
        this.name = name;
        this.brief = brief;
        this.unit = unit;
    }

    public SubjectInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }
}