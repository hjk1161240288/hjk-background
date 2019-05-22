package com.jk.controller;

import com.jk.model.TreeBean;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TreeController {

    @Autowired
    private TreeService treeService;

    /**
     * 页面
     */
    @RequestMapping("treelist")
    public String treequert(){
        return "treelist";
    }

    /**
     * 查询树
     */
    @RequestMapping("treequery")
    @ResponseBody
    private List<TreeBean> treequery(){
        return treeService.treequery();
    }
}
