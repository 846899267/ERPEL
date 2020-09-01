package com.erp.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class guanli {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String iname;
    private String gname;

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Long getJiage() {
        return jiage;
    }

    public void setJiage(Long jiage) {
        this.jiage = jiage;
    }

    private Long shuliang;
    private String shuoming;
    private String riqi;
    private Long jiage;

    public String getShuoming() {
        return shuoming;
    }

    public void setShuoming(String shuoming) {
        this.shuoming = shuoming;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public Long getShuliang() {
        return shuliang;
    }

    public void setShuliang(Long shuliang) {
        this.shuliang = shuliang;
    }

    public String getRiqi() {
        return riqi;
    }

    public void setRiqi(String riqi) {
        this.riqi = riqi;
    }
}
