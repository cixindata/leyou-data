package com.cixin.item.mapper;

import com.cixin.item.pojo.Category;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 商品
 */
public interface CategoryMapper extends Mapper<Category>{

    /**
     * 查询数据库中最后一条记录
     * @return
     */
    @Select("SELECT * FROM tb_category WHERE id = (SELECT MAX(id) FROM tb_category)")
    List<Category>selectLast();

}
