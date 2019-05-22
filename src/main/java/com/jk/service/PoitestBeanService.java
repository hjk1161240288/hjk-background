package com.jk.service;

import com.jk.model.*;
import com.jk.utils.Page;

import java.util.List;

public interface PoitestBeanService {
    Page PoitesList(Integer page, Integer rows, PoitestBean poitestBean);

    Page MaterialsList(Integer page, Integer rows, DiscountcouponBean discountcouponBean);

    void saveMaterial(DiscountcouponBean discountcouponBean);

    int deletediscountcoupon(Integer[] ids);

    Page RefreshmentsList(Integer page, Integer rows, RefreshmentsBean refreshmentsBean);

    void saveRefreshments(RefreshmentsBean refreshmentsBean);

    int deleteRefreshments(Integer[] ids);

    DiscountcouponBean selectDiscountcouponinfo(String info);

    Page CakeList(Integer page, Integer rows, CakeNumberBean cakeNumberBean);

    void saveCake(CakeNumberBean cakeNumberBean);

    List<CakeBean> cakeidlist();

    List<LecakeNumberBean> numberidlist();

    Page CakequeryList(Integer page, Integer rows, CakeBean cakeBean);

    void lingquTyped(Integer cakeId);

    void fangqiTyped(Integer cakeId);

    int deletednumberid(Integer[] ids);

    void savenumberid(CakeBean cakeBean);

    List<PromotionBean> Promotionlist();

    List<FlavorBean> Flavorlist();

    List<FoodBean> Foodlist();

    Page orderList(Integer page, Integer rows, OrderBean orderBean);


//    PoitestBean queryUserByName(String loginNumber);
}
