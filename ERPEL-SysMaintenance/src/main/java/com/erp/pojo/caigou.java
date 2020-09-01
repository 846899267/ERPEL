package com.erp.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class caigou {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String iname;
    private String gname;
    private Date  riqi;
    private Long  shuliang;

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

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Date getRiqi() {
        return riqi;
    }

    public void setRiqi(Date riqi) {
        this.riqi = riqi;
    }

    public Long getShuliang() {
        return shuliang;
    }

    public void setShuliang(Long shuliang) {
        this.shuliang = shuliang;
    }
}
