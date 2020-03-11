package com.lanzhou.wanshou.entity;

import java.io.Serializable;

public class UserRole implements Serializable {
    private Integer id;

    private String role;

    private static final long serialVersionUID = 1L;

    public UserRole(Integer id, String role) {
        this.id = id;
        this.role = role;
    }

    public UserRole() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}