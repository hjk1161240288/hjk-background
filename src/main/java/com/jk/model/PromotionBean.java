package com.jk.model;

public class PromotionBean {

    private Integer promotionId;
    private String promotionName;
    private String promotionInfo;

    @Override
    public String toString() {
        return "PromotionBean{" +
                "promotionId=" + promotionId +
                ", promotionName='" + promotionName + '\'' +
                ", promotionInfo='" + promotionInfo + '\'' +
                '}';
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }
}
