package com.jk.service.impl;

import com.jk.mapper.TreeMapper;
import com.jk.model.TreeBean;
import com.jk.service.TreeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TreeServiceImpl implements TreeService {

    @Resource
    private TreeMapper treeMapper;

    @Override
    public List<TreeBean> treequery() {

        Integer id = 0;


        return queryTree(id);

    }
    private List<TreeBean> queryTree(Integer id) {
        List<TreeBean> trees = treeMapper.treequeryPid(id);
        for (TreeBean treeBean : trees) {
            List<TreeBean> queryTree = queryTree(treeBean.getId());
            if (queryTree != null & queryTree.size() > 0) {
                treeBean.setNodes(queryTree);
                treeBean.setSelectable(false);
            }else {
                treeBean.setSelectable(true);
            }
        }
        return trees;
    }
}
