package com.jk.service.impl;

import com.jk.mapper.PoitestBeanMapper;
import com.jk.model.*;
import com.jk.service.PoitestBeanService;
import com.jk.utils.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class PoitestBeanServiceImpl implements PoitestBeanService {

    @Resource
    private PoitestBeanMapper poitestBeanMapper;

    //*****************************************************  用户  **************************************************************

    /**
     * 查询用户
     */
    @Override
    public Page PoitesList(Integer page, Integer rows, PoitestBean poitestBean) {
        Page page2 = new Page();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("bookBean", poitestBean);
        Integer count = poitestBeanMapper.bookcount(hashMap);
        page2.setTotal(count);
        hashMap.put("page", (page-1)*rows);
        hashMap.put("rows", rows);
        List<PoitestBean> list  = poitestBeanMapper.bookpagelist(hashMap);
        page2.setRows(list);
        return page2;
    }

    //*****************************************************  优惠卷  **************************************************************

    /**
     * 查询优惠卷
     */
    @Override
    public Page MaterialsList(Integer page, Integer rows, DiscountcouponBean discountcouponBean) {
        Page page2 = new Page();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("bookBean", discountcouponBean);
        Integer count = poitestBeanMapper.materialscount(hashMap);
        page2.setTotal(count);
        hashMap.put("page", (page-1)*rows);
        hashMap.put("rows", rows);
        List<PoitestBean> list  = poitestBeanMapper.materialspagelist(hashMap);
        page2.setRows(list);
        return page2;
    }

    /**
     * 新增优惠卷
     */
    @Override
    public void saveMaterial(DiscountcouponBean discountcouponBean) {
        poitestBeanMapper.saveMaterial(discountcouponBean);
    }

    /**
     * 删除优惠卷
     */
    @Override
    public int deletediscountcoupon(Integer[] ids) {
        int count = poitestBeanMapper.deletediscountcoupon(ids);
        return count;
    }

    //*****************************************************  小食  **************************************************************

    /**
     * 查询小食
     */
    @Override
    public Page RefreshmentsList(Integer page, Integer rows, RefreshmentsBean refreshmentsBean) {
        Page page2 = new Page();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("bookBean", refreshmentsBean);
        Integer count = poitestBeanMapper. refreshmentscount(hashMap);
        page2.setTotal(count);
        hashMap.put("page", (page-1)*rows);
        hashMap.put("rows", rows);
        List<PoitestBean> list  = poitestBeanMapper.refreshmentslist(hashMap);
        page2.setRows(list);
        return page2;
    }

    /**
     * 新增小食
     */
    @Override
    public void saveRefreshments(RefreshmentsBean refreshmentsBean) {
        poitestBeanMapper.saveRefreshments(refreshmentsBean);
    }

    /**
     * 删除小食
     */
    @Override
    public int deleteRefreshments(Integer[] ids) {
        int count = poitestBeanMapper.deleteRefreshments(ids);
        return count;
    }

    /**
     * 介绍
     */
    @Override
    public DiscountcouponBean selectDiscountcouponinfo(String info) {
        return poitestBeanMapper.selectDiscountcouponinfo(info);
    }

    //*****************************************************  蛋糕  **************************************************************


    /**
     * 查询蛋糕
     */
    @Override
    public Page CakeList(Integer page, Integer rows, CakeNumberBean cakeNumberBean) {
        Page page2 = new Page();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("bookBean", cakeNumberBean);
        Integer count = poitestBeanMapper.CakeListcount(hashMap);
        page2.setTotal(count);
        hashMap.put("page", (page - 1) * rows);
        hashMap.put("rows", rows);
        List<PoitestBean> list = poitestBeanMapper.CakeListlist(hashMap);
        page2.setRows(list);
        return page2;
    }

    /**
     * 蛋糕新增页面
     */
    @Override
    public void saveCake(CakeNumberBean cakeNumberBean) {
        poitestBeanMapper.saveCake(cakeNumberBean);
    }
    /**
     * 蛋糕种类
     */
    @Override
    public List<CakeBean> cakeidlist() {
        return poitestBeanMapper.cakeidlist();
    }
    /**
     * 餐具
     */
    @Override
    public List<LecakeNumberBean> numberidlist() {
        return poitestBeanMapper.numberidlist();
    }
    /**
     * 删除蛋糕
     */
    @Override
    public int deletednumberid(Integer[] ids) {
        int count = poitestBeanMapper.deletednumberid(ids);
        return count;
    }






    //*****************************************************  save蛋糕  **************************************************************

    /**
     * 查询save蛋糕
     */
    @Override
    public Page CakequeryList(Integer page, Integer rows, CakeBean cakeBean) {
        Page page2 = new Page();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("bookBean", cakeBean);
        Integer count = poitestBeanMapper.Cakequerycount(hashMap);
        page2.setTotal(count);
        hashMap.put("page", (page - 1) * rows);
        hashMap.put("rows", rows);
        List<PoitestBean> list = poitestBeanMapper.Cakequerylist(hashMap);
        page2.setRows(list);
        return page2;
    }

    /**
     * 上架
     */
    @Override
    public void lingquTyped(Integer cakeId) {
        poitestBeanMapper.lingquTyped(cakeId);
}

    /**
     * 下架
     */
    @Override
    public void fangqiTyped(Integer cakeId) {
        poitestBeanMapper.fangqiTyped(cakeId);
    }

    /**
     * 新增save蛋糕
     */
    @Override
    public void savenumberid(CakeBean cakeBean) {
        poitestBeanMapper.savenumberid(cakeBean);
    }

    /**
     * 查询促销
     */
    @Override
    public List<PromotionBean> Promotionlist() {
        return poitestBeanMapper.Promotionlist();
    }
    /**
     * 查询蛋糕口味
     */
    @Override
    public List<FlavorBean> Flavorlist() {
        return poitestBeanMapper.Flavorlist();    }
    /**
     * 查询蛋糕材料
     */
    @Override
    public List<FoodBean> Foodlist() {
        return poitestBeanMapper.Foodlist();    }


    //*****************************************************  订单  **************************************************************

    /**
     * 查询订单
     */
    @Override
    public Page orderList(Integer page, Integer rows, OrderBean orderBean) {
        Page page2 = new Page();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("bookBean", orderBean);
        Integer count = poitestBeanMapper.ordercount(hashMap);
        page2.setTotal(count);
        hashMap.put("page", (page-1)*rows);
        hashMap.put("rows", rows);
        List<PoitestBean> list  = poitestBeanMapper.orderpagelist(hashMap);
        page2.setRows(list);
        return page2;
    }





  /*  @Override
    public PoitestBean queryUserByName(String loginNumber) {
        return poitestBeanMapper.queryUserByName(loginNumber);
    }*/
}
