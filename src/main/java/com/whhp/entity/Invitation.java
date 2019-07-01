package com.whhp.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * ASUS mjt
 * 2019/6/14
 */
public class Invitation {
    private Integer id;
    private String title;
    private String summry;
    private String author;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdate;
    private Integer rid;

    public Invitation() {
    }

    public Invitation(String title, String summry, String author, Date createdate,Integer rid) {
        this.title = title;
        this.summry = summry;
        this.author = author;
        this.createdate = createdate;
        this.rid= rid;
    }

    public Invitation(Integer id, String title, String summry, String author, Date createdate,Integer rid) {
        this.id = id;
        this.title = title;
        this.summry = summry;
        this.author = author;
        this.createdate = createdate;
        this.rid= rid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summry='" + summry + '\'' +
                ", author='" + author + '\'' +
                ", createdate=" + createdate +
                ", rid=" + rid +
                '}';
    }
}
