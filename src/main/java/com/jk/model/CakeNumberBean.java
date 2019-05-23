package com.jk.model;

import java.io.Serializable;

public class CakeNumberBean  implements Serializable {


    private Integer cakeNumberId;

    private Integer cakeId;

    private Integer numberId;

    private Integer price;




    private String bulk ;
    private String numberName ;
    private String sweetness ;
    private String tableware ;
    private String weight ;
    private String flavorName ;
    private String cakeImg;
    private String cakeName;
    private String wannengname;

    public String getWannengname() {
        return wannengname;
    }

    public void setWannengname(String wannengname) {
        this.wannengname = wannengname;
    }

    public String getCakeImg() {
        return cakeImg;
    }

    public void setCakeImg(String cakeImg) {
        this.cakeImg = cakeImg;
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public Integer getCakeNumberId() {
        return cakeNumberId;
    }

    public void setCakeNumberId(Integer cakeNumberId) {
        this.cakeNumberId = cakeNumberId;
    }

    public Integer getCakeId() {
        return cakeId;
    }

    public void setCakeId(Integer cakeId) {
        this.cakeId = cakeId;
    }

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBulk() {
        return bulk;
    }

    public void setBulk(String bulk) {
        this.bulk = bulk;
    }

    public String getNumberName() {
        return numberName;
    }

    public void setNumberName(String numberName) {
        this.numberName = numberName;
    }

    public String getSweetness() {
        return sweetness;
    }

    public void setSweetness(String sweetness) {
        this.sweetness = sweetness;
    }

    public String getTableware() {
        return tableware;
    }

    public void setTableware(String tableware) {
        this.tableware = tableware;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }


    @Override
    public String toString() {
        return "CakeNumberBean{" +
                "cakeNumberId=" + cakeNumberId +
                ", cakeId=" + cakeId +
                ", numberId=" + numberId +
                ", price=" + price +
                ", bulk='" + bulk + '\'' +
                ", numberName='" + numberName + '\'' +
                ", sweetness='" + sweetness + '\'' +
                ", tableware='" + tableware + '\'' +
                ", weight='" + weight + '\'' +
                ", flavorName='" + flavorName + '\'' +
                ", cakeImg='" + cakeImg + '\'' +
                ", cakeName='" + cakeName + '\'' +
                ", wannengname='" + wannengname + '\'' +
                '}';
    }
}
