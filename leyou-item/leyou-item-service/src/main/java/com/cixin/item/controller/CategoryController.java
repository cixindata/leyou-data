package com.cixin.item.controller;

import com.cixin.item.pojo.Category;
import com.cixin.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoryByPid(@RequestParam(value = "pid", defaultValue = "0") Long pid) {
        //如果pid的值为-1,那么需要获取数据库中的最后一条记录
        if (pid == -1) {
            List<Category> last = this.categoryService.queryLast();
            return ResponseEntity.ok(last);
        } else {
            List<Category> categories = this.categoryService.queryCategoryByPid(pid);
            if (CollectionUtils.isEmpty(categories)) {
                // 响应404
                return ResponseEntity.notFound().build();
            }
            //返回200
            return ResponseEntity.ok(categories);

        }
    }
}
