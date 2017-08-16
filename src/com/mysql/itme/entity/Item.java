package com.mysql.itme.entity;

/**
 * Created by Admin on 2017/8/16.
 */
public class Item {
    private int tId;
    private String tName;
    private int tmpCount;
    private int tcount;
    private String tDate;

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int getTmpCount() {
        return tmpCount;
    }

    public void setTmpCount(int tmpCount) {
        this.tmpCount = tmpCount;
    }

    public int getTcount() {
        return tcount;
    }

    public void setTcount(int tcount) {
        this.tcount = tcount;
    }

    public String gettDate() {
        return tDate;
    }

    public void settDate(String tDate) {
        this.tDate = tDate;
    }

    public Item(int tId, String tName, int tmpCount, int tcount, String tDate) {
        this.tId = tId;
        this.tName = tName;
        this.tmpCount = tmpCount;
        this.tcount = tcount;
        this.tDate = tDate;
    }
}
