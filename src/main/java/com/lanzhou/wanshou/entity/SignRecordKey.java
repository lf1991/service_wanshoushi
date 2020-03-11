package com.lanzhou.wanshou.entity;

import java.io.Serializable;
import java.util.Date;

public class SignRecordKey implements Serializable {
    private Integer userId;

    private Date signTime;

    private Integer subjectId;

    private static final long serialVersionUID = 1L;

    public SignRecordKey(Integer userId, Date signTime, Integer subjectId) {
        this.userId = userId;
        this.signTime = signTime;
        this.subjectId = subjectId;
    }

    public SignRecordKey() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }
}