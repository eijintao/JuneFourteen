package com.whhp.util;

/**
 * ASUS mjt
 * 2019/6/14
 */
public class Params {
    //分页条件
    private int pageNum;
    private int pageSize=2;
    //条件查询
    private String title;
    private String summry;
    private String author;
    private String createdateForm;
    private String createdateTo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummry() {
        return summry;
    }

    public void setSummry(String summry) {
        this.summry = summry;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreatedateForm() {
        return createdateForm;
    }

    public void setCreatedateForm(String createdateForm) {
        this.createdateForm = createdateForm;
    }

    public String getCreatedateTo() {
        return createdateTo;
    }

    public void setCreatedateTo(String createdateTo) {
        this.createdateTo = createdateTo;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
