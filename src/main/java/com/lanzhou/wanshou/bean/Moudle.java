package com.lanzhou.wanshou.bean;

/**
 * 模块
 */
public class Moudle {
    /**
     * 模块id
     */
    private int id;
    /**
     * 模块name
     */
    private String name;
    /**
     * 模块简介
     */
    private String brief;
    /**
     * 模块图标
     */
    private String icon;
    /**
     * 模块路由
     */
    private String router;
    /**
     * 路由是否激活
     */
    private boolean active;

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

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
