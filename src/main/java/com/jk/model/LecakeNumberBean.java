package com.jk.model;

public class LecakeNumberBean {

    private Integer numberId;

    private String numberName;

    private String tableware;

    private String bulk;

    private Integer weight;

    private String sweetness;

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    public String getNumberName() {
        return numberName;
    }

    public void setNumberName(String numberName) {
        this.numberName = numberName;
    }

    public String getTableware() {
        return tableware;
    }

    public void setTableware(String tableware) {
        this.tableware = tableware;
    }

    public String getBulk() {
        return bulk;
    }

    public void setBulk(String bulk) {
        this.bulk = bulk;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getSweetness() {
        return sweetness;
    }

    public void setSweetness(String sweetness) {
        this.sweetness = sweetness;
    }

    @Override
    public String toString() {
        return "LecakeNumberBean{" +
                "numberId=" + numberId +
                ", numberName='" + numberName + '\'' +
                ", tableware='" + tableware + '\'' +
                ", bulk='" + bulk + '\'' +
                ", weight=" + weight +
                ", sweetness='" + sweetness + '\'' +
                '}';
    }
}
