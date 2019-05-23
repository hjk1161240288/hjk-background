package com.jk.model;

import java.io.Serializable;

public class DiscountcouponBean implements Serializable {

    private Integer id;

    private String discountcoupon;

    private String info;

    private String validity;

    private String wannengname;

    @Override
    public String toString() {
        return "DiscountcouponBean{" +
                "id=" + id +
                ", discountcoupon='" + discountcoupon + '\'' +
                ", info='" + info + '\'' +
                ", validity='" + validity + '\'' +
                ", wannengname='" + wannengname + '\'' +
                '}';
    }

    public String getWannengname() {
        return wannengname;
    }

    public void setWannengname(String wannengname) {
        this.wannengname = wannengname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiscountcoupon() {
        return discountcoupon;
    }

    public void setDiscountcoupon(String discountcoupon) {
        this.discountcoupon = discountcoupon;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
}
