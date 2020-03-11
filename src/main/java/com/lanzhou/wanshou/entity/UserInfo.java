package com.lanzhou.wanshou.entity;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private String tel;

    private Integer roleId;

    private static final long serialVersionUID = 1L;

    public UserInfo(Integer id, String name, String password, String tel, Integer roleId) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.tel = tel;
        this.roleId = roleId;
    }

    public UserInfo() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}