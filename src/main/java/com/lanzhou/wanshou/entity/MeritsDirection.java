package com.lanzhou.wanshou.entity;

import java.io.Serializable;

public class MeritsDirection implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;

    public MeritsDirection(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public MeritsDirection() {
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
}