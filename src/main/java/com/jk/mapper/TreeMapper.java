package com.jk.mapper;

import com.jk.model.TreeBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TreeMapper {

    @Select("select id , text, url as href ,pid from t_tree where pid = #{value} ")
    List<TreeBean> treequeryPid(Integer id);
}
