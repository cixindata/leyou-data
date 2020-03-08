package com.cixin.item.service;

import com.cixin.item.pojo.Category;

import java.util.List;

/**
 * 分类业务场景
 */
public interface  CategoryService{


    List<Category>queryCategoryByPid(Long pid);

    List<Category>queryLast();

}