package com.jk.model;

import java.io.Serializable;

public class FoodBean implements Serializable {


    private Integer foodId;
    private String foodName;
    private String region;

    @Override
    public String toString() {
        return "FoodBean{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", region='" + region + '\'' +
                '}';
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
