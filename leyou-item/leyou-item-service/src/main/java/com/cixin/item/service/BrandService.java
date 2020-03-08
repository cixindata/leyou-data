package com.cixin.item.service;

import com.cixin.common.pojo.PageResult;
import com.cixin.item.pojo.Brand;

import java.util.List;

public interface BrandService {
    PageResult<Brand> queryBrandsByPage(Integer page,Integer rows,String sortBy,Boolean desc,String key);

    void  saveBrand(Brand brand, List<Long> cids);
}
