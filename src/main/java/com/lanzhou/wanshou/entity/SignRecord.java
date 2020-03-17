package com.lanzhou.wanshou.entity;

import java.io.Serializable;
import java.util.Date;

public class SignRecord extends SignRecordKey implements Serializable {
    private String subjectPeriod;
    private String subjectName;
    private Long targetAmount;

    private Long signAmount;

    private Integer subjectSort;

    private Date subjectSelectDate;

    private static final long serialVersionUID = 1L;

    public SignRecord(Integer userId, Date signTime, Integer subjectId, String subjectPeriod, Long targetAmount, Long signAmount, Integer subjectSort, Date subjectSelectDate, String subjectName) {
        super(userId, signTime, subjectId);
        this.subjectPeriod = subjectPeriod;
        this.targetAmount = targetAmount;
        this.signAmount = signAmount;
        this.subjectSort = subjectSort;
        this.subjectSelectDate = subjectSelectDate;
        this.subjectName = subjectName;
    }

    public SignRecord() {
        super();
    }

    public String getSubjectPeriod() {
        return subjectPeriod;
    }

    public void setSubjectPeriod(String subjectPeriod) {
        this.subjectPeriod = subjectPeriod == null ? null : subjectPeriod.trim();
    }

    public Long getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(Long targetAmount) {
        this.targetAmount = targetAmount;
    }

    public Long getSignAmount() {
        return signAmount;
    }

    public void setSignAmount(Long signAmount) {
        this.signAmount = signAmount;
    }

    public Integer getSubjectSort() {
        return subjectSort;
    }

    public void setSubjectSort(Integer subjectSort) {
        this.subjectSort = subjectSort;
    }

    public Date getSubjectSelectDate() {
        return subjectSelectDate;
    }

    public void setSubjectSelectDate(Date subjectSelectDate) {
        this.subjectSelectDate = subjectSelectDate;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}