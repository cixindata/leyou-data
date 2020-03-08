package com.cixin.item.service;

import com.cixin.item.pojo.SpecGroup;

import java.util.List;

public interface SpecificationService {

    List<SpecGroup> queryGroupByCid(Long cid);
}
