package com.jk.model;

public class FlavorBean {
    private Integer flavorId;
    private String flavorName;

    @Override
    public String toString() {
        return "FlavorBean{" +
                "flavorId=" + flavorId +
                ", flavorName='" + flavorName + '\'' +
                '}';
    }

    public Integer getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(Integer flavorId) {
        this.flavorId = flavorId;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }
}
