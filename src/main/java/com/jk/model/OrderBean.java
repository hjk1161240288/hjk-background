package com.jk.model;

public class OrderBean {

   private Integer id ;
    private String orderid;
    private String  orderdate;
    private Double orderprice;
    private  String jifenprice;
    private  Double  commodity;
    private  Double  yunfei;
    private Integer  kehuojifen;
    private  String  delivergoods;
    private  String  message;
    private  Integer  orderstatus ;
    private  String  userid;
    private  Integer  paymentinfo;
    private  Integer  shouhuoinfoid;
    private   Integer cakeId;


    private String cakeimg;
    private String goodsname;
    private String size;
    private  String goodsprice;
    private String count;
    private String tsname;
    private String youbian;
    private String phone;
    private  String area;
    private String wannengname;

    @Override
    public String toString() {
        return "OrderBean{" +
                "id=" + id +
                ", orderid='" + orderid + '\'' +
                ", orderdate='" + orderdate + '\'' +
                ", orderprice=" + orderprice +
                ", jifenprice='" + jifenprice + '\'' +
                ", commodity=" + commodity +
                ", yunfei=" + yunfei +
                ", kehuojifen=" + kehuojifen +
                ", delivergoods='" + delivergoods + '\'' +
                ", message='" + message + '\'' +
                ", orderstatus=" + orderstatus +
                ", userid='" + userid + '\'' +
                ", paymentinfo=" + paymentinfo +
                ", shouhuoinfoid=" + shouhuoinfoid +
                ", cakeId=" + cakeId +
                ", cakeimg='" + cakeimg + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", size='" + size + '\'' +
                ", goodsprice='" + goodsprice + '\'' +
                ", count='" + count + '\'' +
                ", tsname='" + tsname + '\'' +
                ", youbian='" + youbian + '\'' +
                ", phone='" + phone + '\'' +
                ", area='" + area + '\'' +
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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public Double getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Double orderprice) {
        this.orderprice = orderprice;
    }

    public String getJifenprice() {
        return jifenprice;
    }

    public void setJifenprice(String jifenprice) {
        this.jifenprice = jifenprice;
    }

    public Double getCommodity() {
        return commodity;
    }

    public void setCommodity(Double commodity) {
        this.commodity = commodity;
    }

    public Double getYunfei() {
        return yunfei;
    }

    public void setYunfei(Double yunfei) {
        this.yunfei = yunfei;
    }

    public Integer getKehuojifen() {
        return kehuojifen;
    }

    public void setKehuojifen(Integer kehuojifen) {
        this.kehuojifen = kehuojifen;
    }

    public String getDelivergoods() {
        return delivergoods;
    }

    public void setDelivergoods(String delivergoods) {
        this.delivergoods = delivergoods;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getPaymentinfo() {
        return paymentinfo;
    }

    public void setPaymentinfo(Integer paymentinfo) {
        this.paymentinfo = paymentinfo;
    }

    public Integer getShouhuoinfoid() {
        return shouhuoinfoid;
    }

    public void setShouhuoinfoid(Integer shouhuoinfoid) {
        this.shouhuoinfoid = shouhuoinfoid;
    }

    public Integer getCakeId() {
        return cakeId;
    }

    public void setCakeId(Integer cakeId) {
        this.cakeId = cakeId;
    }

    public String getCakeimg() {
        return cakeimg;
    }

    public void setCakeimg(String cakeimg) {
        this.cakeimg = cakeimg;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(String goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getTsname() {
        return tsname;
    }

    public void setTsname(String tsname) {
        this.tsname = tsname;
    }

    public String getYoubian() {
        return youbian;
    }

    public void setYoubian(String youbian) {
        this.youbian = youbian;
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
}
