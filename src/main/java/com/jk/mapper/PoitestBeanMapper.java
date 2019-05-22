package com.jk.mapper;

import com.jk.model.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.HashMap;
import java.util.List;

public interface PoitestBeanMapper {

    Integer bookcount(HashMap<String, Object> hashMap);

    List<PoitestBean> bookpagelist(HashMap<String, Object> hashMap);

    Integer materialscount(HashMap<String, Object> hashMap);

    List<PoitestBean> materialspagelist(HashMap<String, Object> hashMap);

    void saveMaterial(DiscountcouponBean discountcouponBean);

    int deletediscountcoupon(Integer[] ids);

    Integer refreshmentscount(HashMap<String, Object> hashMap);

    List<PoitestBean> refreshmentslist(HashMap<String, Object> hashMap);

    void saveRefreshments(RefreshmentsBean refreshmentsBean);

    int deleteRefreshments(Integer[] ids);

    @Select("select * from t_discountcoupon td where td.id = #{value}")
    DiscountcouponBean selectDiscountcouponinfo(String info);


    Integer CakeListcount(HashMap<String, Object> hashMap);

    List<PoitestBean> CakeListlist(HashMap<String, Object> hashMap);

    void saveCake(CakeNumberBean cakeNumberBean);

    @Select("select * from lecake_cake")
    List<CakeBean> cakeidlist();

    @Select("select * from lecake_number")
    List<LecakeNumberBean> numberidlist();

    Integer Cakequerycount(HashMap<String, Object> hashMap);

    List<PoitestBean> Cakequerylist(HashMap<String, Object> hashMap);

    @Update("update lecake_cake set typecake=1 where typecake=2 and cakeId=#{cakeId}")
    void lingquTyped(Integer cakeId);

    @Update("update lecake_cake set typecake=2 where typecake=1 and cakeId=#{cakeId}")
    void fangqiTyped(Integer cakeId);


    int deletednumberid(Integer[] ids);

    void savenumberid(CakeBean cakeBean);

    @Select("select * from lecake_promotion")
    List<PromotionBean> Promotionlist();

    @Select("select * from lecake_flavor")
    List<FlavorBean> Flavorlist();

    @Select("select * from lecake_food")
    List<FoodBean> Foodlist();

    Integer ordercount(HashMap<String, Object> hashMap);

    List<PoitestBean> orderpagelist(HashMap<String, Object> hashMap);


//    @Select("select * from t_poitest tpt where tpt.name = #{loginNumber}")
//    PoitestBean queryUserByName(String loginNumber);
}
