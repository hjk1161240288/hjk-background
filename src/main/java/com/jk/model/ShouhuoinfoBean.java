package com.jk.model;

import java.io.Serializable;

public class ShouhuoinfoBean implements Serializable {
   private Integer id;
    private String phone;
    private String  area;
    private String shouhuodate;
    private String  name;
    private String youbian;
    private Integer userid;

    @Override
    public String toString() {
        return "ShouhuoinfoBean{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", area='" + area + '\'' +
                ", shouhuodate='" + shouhuodate + '\'' +
                ", name='" + name + '\'' +
                ", youbian='" + youbian + '\'' +
                ", userid=" + userid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getShouhuodate() {
        return shouhuodate;
    }

    public void setShouhuodate(String shouhuodate) {
        this.shouhuodate = shouhuodate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYoubian() {
        return youbian;
    }

    public void setYoubian(String youbian) {
        this.youbian = youbian;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
