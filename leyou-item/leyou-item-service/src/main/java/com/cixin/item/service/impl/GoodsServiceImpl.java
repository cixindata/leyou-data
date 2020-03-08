package com.cixin.item.service.impl;


import com.cixin.item.mapper.CategoryMapper;
import com.cixin.item.pojo.Category;
import com.cixin.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 分类实现
 */
@Service
public class GoodsServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 根据parentId查询子类目
     * @param pid
     * @return
     */
    @Override
    public List<Category> queryCategoryByPid(Long pid) {
        Category category=new Category();
        category.setParentId(pid);
        List<Category>categoryList=categoryMapper.select(category);
        return categoryList;
    }
}