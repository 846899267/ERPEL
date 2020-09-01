package com.erp.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "item")
public class item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;

    private String gongyingshang;
    private String kucun;
    private Long cid;
    private Long gid;
    private String zhonglei;
private Long yuqi;

    public Long getYuqi() {
        return yuqi;
    }

    public void setYuqi(Long yuqi) {
        this.yuqi = yuqi;
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getZhonglei() {
        return zhonglei;
    }

    public void setZhonglei(String zhonglei) {
        this.zhonglei = zhonglei;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGongyingshang() {
        return gongyingshang;
    }

    public void setGongyingshang(String gongyingshang) {
        this.gongyingshang = gongyingshang;
    }

    public String getKucun() {
        return kucun;
    }

    public void setKucun(String kucun) {
        this.kucun = kucun;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }
}
