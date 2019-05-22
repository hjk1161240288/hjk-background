package com.jk.model;

public class CakeBean {

    private Integer cakeId;

    private String cakeImg;

    private String cakeName;

    private Integer promotionId;

    private Integer foodId;

    private Integer flavorId;

    private Integer numberId;

    private Integer typecake;

    private String promotionName;
    private String flavorName;
    private String wannengname;
    private String foodName;

    @Override
    public String toString() {
        return "CakeBean{" +
                "cakeId=" + cakeId +
                ", cakeImg='" + cakeImg + '\'' +
                ", cakeName='" + cakeName + '\'' +
                ", promotionId=" + promotionId +
                ", foodId=" + foodId +
                ", flavorId=" + flavorId +
                ", numberId=" + numberId +
                ", typecake=" + typecake +
                ", promotionName='" + promotionName + '\'' +
                ", flavorName='" + flavorName + '\'' +
                ", wannengname='" + wannengname + '\'' +
                ", foodName='" + foodName + '\'' +
                '}';
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getWannengname() {
        return wannengname;
    }

    public void setWannengname(String wannengname) {
        this.wannengname = wannengname;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public Integer getTypecake() {
        return typecake;
    }

    public void setTypecake(Integer typecake) {
        this.typecake = typecake;
    }

    public Integer getCakeId() {
        return cakeId;
    }

    public void setCakeId(Integer cakeId) {
        this.cakeId = cakeId;
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

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(Integer flavorId) {
        this.flavorId = flavorId;
    }

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

}