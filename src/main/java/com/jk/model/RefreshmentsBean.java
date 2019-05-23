package com.jk.model;

import java.io.Serializable;

public class RefreshmentsBean implements Serializable {

    private Integer refreshmentsid;

    private String refreshmentsname;

    private String refreshmentsflavour;

    private Integer refreshmentsprice;

    private Integer refreshmentspecification;

    private String refreshmentslength;

    private Integer refreshmentssweetness;

    private String refreshmentsimg;

    private String wannengname;

    @Override
    public String toString() {
        return "RefreshmentsBean{" +
                "refreshmentsid=" + refreshmentsid +
                ", refreshmentsname='" + refreshmentsname + '\'' +
                ", refreshmentsflavour='" + refreshmentsflavour + '\'' +
                ", refreshmentsprice=" + refreshmentsprice +
                ", refreshmentspecification=" + refreshmentspecification +
                ", refreshmentslength='" + refreshmentslength + '\'' +
                ", refreshmentssweetness=" + refreshmentssweetness +
                ", refreshmentsimg='" + refreshmentsimg + '\'' +
                ", wannengname='" + wannengname + '\'' +
                '}';
    }

    public String getWannengname() {
        return wannengname;
    }

    public void setWannengname(String wannengname) {
        this.wannengname = wannengname;
    }

    public Integer getRefreshmentsid() {
        return refreshmentsid;
    }

    public void setRefreshmentsid(Integer refreshmentsid) {
        this.refreshmentsid = refreshmentsid;
    }

    public String getRefreshmentsname() {
        return refreshmentsname;
    }

    public void setRefreshmentsname(String refreshmentsname) {
        this.refreshmentsname = refreshmentsname;
    }

    public String getRefreshmentsflavour() {
        return refreshmentsflavour;
    }

    public void setRefreshmentsflavour(String refreshmentsflavour) {
        this.refreshmentsflavour = refreshmentsflavour;
    }

    public Integer getRefreshmentsprice() {
        return refreshmentsprice;
    }

    public void setRefreshmentsprice(Integer refreshmentsprice) {
        this.refreshmentsprice = refreshmentsprice;
    }

    public Integer getRefreshmentspecification() {
        return refreshmentspecification;
    }

    public void setRefreshmentspecification(Integer refreshmentspecification) {
        this.refreshmentspecification = refreshmentspecification;
    }

    public String getRefreshmentslength() {
        return refreshmentslength;
    }

    public void setRefreshmentslength(String refreshmentslength) {
        this.refreshmentslength = refreshmentslength;
    }

    public Integer getRefreshmentssweetness() {
        return refreshmentssweetness;
    }

    public void setRefreshmentssweetness(Integer refreshmentssweetness) {
        this.refreshmentssweetness = refreshmentssweetness;
    }

    public String getRefreshmentsimg() {
        return refreshmentsimg;
    }

    public void setRefreshmentsimg(String refreshmentsimg) {
        this.refreshmentsimg = refreshmentsimg;
    }
}
