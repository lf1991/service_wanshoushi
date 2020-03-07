package com.lanzhou.wanshou.bean;

/**
 * 成员管理类
 */
public class Subject {
    /**
     * id 科目编号
     */
    private int id;
    /**
     * 科目名称
     */
    private String name;
    /**
     * 科目简介
     */
    private String brief;
    /**
     * 科目章节id
     */
    private int chapterId;

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

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }
}
