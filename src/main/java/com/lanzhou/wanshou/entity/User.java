package com.lanzhou.wanshou.entity;

/**
 * 成员管理类
 */
public class User {

    /**
     * id编号
     */
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 联系方式
     */
    private String tel;
    /**
     * 权限Id
     */
    private int roleId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
