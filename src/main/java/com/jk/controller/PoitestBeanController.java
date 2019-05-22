package com.jk.controller;


import com.jk.model.*;
import com.jk.service.PoitestBeanService;
import com.jk.utils.OSSClientUtil;
import com.jk.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
public class PoitestBeanController {

    @Autowired
    private PoitestBeanService poitestBeanService;

    //*****************************************************  用户  **************************************************************


    /**
     * 跳转用户页面
     */
    @RequestMapping("Poites")
    public String treequert(){
        return "PoitestList";
    }

    /**
     * 查询用户
     */
    @RequestMapping("PoitesList")
    @ResponseBody
    public Page PoitesList(Integer page, Integer rows, PoitestBean poitestBean){
        return poitestBeanService.PoitesList(page,rows,poitestBean);
    }


    //*****************************************************  优惠卷  **************************************************************

    /**
     * 跳转优惠卷页面
     */
    @RequestMapping("infoList")
    public String infoList(){
        return "infoList";
    }

    /**
     * 优惠卷页面
     */
    @RequestMapping("Materials")
    public String Materials(){
        return "MaterialsList";
    }

    /**
     * 查询优惠卷
     */
    @RequestMapping("MaterialsList")
    @ResponseBody
    public Page MaterialsList(Integer page, Integer rows, DiscountcouponBean discountcouponBean){
        return poitestBeanService.MaterialsList(page,rows,discountcouponBean);
    }

    /**
     * 查询优惠劵介绍
     */
    @RequestMapping("huixian")
    public String huixian() {
        return "infoList";
    }
    @RequestMapping("selectDiscountcouponinfo")
    @ResponseBody
    public DiscountcouponBean selectDiscountcouponinfo(String info){
        return poitestBeanService.selectDiscountcouponinfo(info);
    }

    /**
     * 跳转优惠卷新增页面
     */
    @RequestMapping("MaterialsAdd")
    public String MaterialsAdd(){
        return "MaterialsAdd";
    }

    /**
     * 新增优惠卷
     */
    @RequestMapping("saveMaterial")
    @ResponseBody
    public boolean saveMaterial(DiscountcouponBean discountcouponBean){
        try {
            poitestBeanService.saveMaterial(discountcouponBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 删除优惠卷
     */
    @RequestMapping("deletediscountcoupon")
    @ResponseBody
    public boolean deletediscountcoupon(Integer[] ids){
        try {
            poitestBeanService.deletediscountcoupon(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //*****************************************************  小食  **************************************************************

    /**
     * 跳转小食页面
     */
    @RequestMapping("Refreshments")
    public String Refreshments(){
        return "RefreshmentsList";
    }

    /**
     * 查询小食
     */
    @RequestMapping("RefreshmentsList")
    @ResponseBody
    public Page RefreshmentsList(Integer page, Integer rows, RefreshmentsBean refreshmentsBean){
        return poitestBeanService.RefreshmentsList(page,rows,refreshmentsBean);
    }

    /**
     * 跳转小食新增页面
     */
    @RequestMapping("RefreshmentsAdd")
    public String RefreshmentsAdd(){
        return "RefreshmentsAdd";
    }


    //上传图片
    @RequestMapping("text")
    @ResponseBody
    public String uploadImg(MultipartFile file)throws IOException {
        if (file == null || file.getSize() <= 0) {
            throw new IOException("file不能为空");
        }
        OSSClientUtil ossClient=new OSSClientUtil();
        String name = ossClient.uploadImg2Oss(file);
        String imgUrl = ossClient.getImgUrl(name);
        String[] split = imgUrl.split("\\?");
        refreshmentsimg=split[0];
        return split[0];
    }
    String refreshmentsimg ="";

    /**
     * 新增小食
     */
    @RequestMapping("saveRefreshments")
    @ResponseBody
    public boolean saveRefreshments(RefreshmentsBean refreshmentsBean){
        try {
            refreshmentsBean.setRefreshmentsimg(refreshmentsimg);
            poitestBeanService.saveRefreshments(refreshmentsBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    /**
     * 删除小食
     */
    @RequestMapping("deleteRefreshments")
    @ResponseBody
    public boolean deleteRefreshments(Integer[] ids){
        try {
            poitestBeanService.deleteRefreshments(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //*****************************************************  蛋糕  **************************************************************

    /**
     * 跳转蛋糕页面
     */
    @RequestMapping("Cake")
    public String Cake(){
        return "CakeList";
    }

    /**
     * 查询蛋糕
     */
    @RequestMapping("CakeList")
    @ResponseBody
    public Page CakeList(Integer page, Integer rows, CakeNumberBean cakeNumberBean){
        return poitestBeanService.CakeList(page,rows,cakeNumberBean);
    }

    /**
     * 跳转蛋糕新增页面
     */
    @RequestMapping("CakeAdd")
    public String CakeAdd(){
        return "CakeAdd";
    }
    /**
     * 新增蛋糕
     */
    @RequestMapping("saveCake")
    @ResponseBody
    public boolean saveCake(CakeNumberBean cakeNumberBean){
        try {
            poitestBeanService.saveCake(cakeNumberBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * 查询蛋糕种类
     */
    @RequestMapping("cakeidlist")
    @ResponseBody
    public List<CakeBean> cakeidlist(){
        return  poitestBeanService.cakeidlist();
    }
    /**
     * 查询用餐人数
     */
    @RequestMapping("numberidlist")
    @ResponseBody
    public List<LecakeNumberBean> numberidlist(){
        return  poitestBeanService.numberidlist();
    }


    //*****************************************************  查询save蛋糕蛋糕  **************************************************************

    /**
     * 跳转查询save蛋糕页面
     */
    @RequestMapping("Cakequery")
    public String Cakequery(){
        return "CakequeryList";
    }

    /**
     * 查询查询save蛋糕
     */
    @RequestMapping("CakequeryList")
    @ResponseBody
    public Page CakequeryList(Integer page, Integer rows, CakeBean cakeBean){
        return poitestBeanService.CakequeryList(page,rows,cakeBean);
    }
    /**
     * 上架
     */
    @RequestMapping("lingquTyped")
    @ResponseBody
    public boolean lingquTyped(Integer cakeId){
        try {
            poitestBeanService.lingquTyped(cakeId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
    /**
     * 下架
     */
    @RequestMapping("fangqiTyped")
    @ResponseBody
    public boolean fangqiTyped(Integer cakeId){
        try {
            poitestBeanService.fangqiTyped(cakeId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * 跳转蛋糕新增页面
     */
    @RequestMapping("numberidAdd")
    public String numberidAdd(){
        return "CakequeryAdd";
    }
    /**
     * 新增save蛋糕
     */
    @RequestMapping("savenumberid")
    @ResponseBody
    public boolean savenumberid(CakeBean cakeBean){
        try {
            cakeBean.setCakeImg(refreshmentsimg);
            poitestBeanService.savenumberid(cakeBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * 查询促销
     */
    @RequestMapping("Promotionlist")
    @ResponseBody
    public List<PromotionBean> Promotionlist(){
        return  poitestBeanService.Promotionlist();
    }
    /**
     * 查询蛋糕口味
     */
    @RequestMapping("Flavorlist")
    @ResponseBody
    public List<FlavorBean> Flavorlist(){
        return  poitestBeanService.Flavorlist();
    }
    /**
     * 查询蛋糕材料
     */
    @RequestMapping("Foodlist")
    @ResponseBody
    public List<FoodBean> Foodlist(){
        return  poitestBeanService.Foodlist();
    }
    /**
     * 删除蛋糕
     */
    @RequestMapping("deletednumberid")
    @ResponseBody
    public boolean deletednumberid(Integer[] ids){
        try {
            poitestBeanService.deletednumberid(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



    //*****************************************************  订单  **************************************************************


    /**
     * 跳转订单页面
     */
    @RequestMapping("order")
    public String order(){
        return "OrderList";
    }

    /**
     * 查询订单
     */
    @RequestMapping("orderList")
    @ResponseBody
    public Page orderList(Integer page, Integer rows, OrderBean orderBean){
        return poitestBeanService.orderList(page,rows,orderBean);
    }





  /*  @RequestMapping("login")
    public String login(HttpServletRequest request, ModelMap map){
        //认证器会根据对应的错误 返回对应的异常 根据异常判断对应错误
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        System.out.println("-*****************-");
        System.out.println("123"+exceptionClassName);
        if(UnknownAccountException.class.getName().equals(exceptionClassName)
                || AuthenticationException.class.getName().equals(exceptionClassName)){
            System.out.println("request = [ 用户名异常]");
            map.put("message","用户名错误");
        }else{
            System.out.println("request = [密码异常]");
            map.put("message","密码错误");
        }
        return "login";
    }
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }*/

    }
