package com.xxl.job.executor.service;

import com.xxl.job.executor.dao.CategoryMapper;
import com.xxl.job.executor.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiangtingfeng
 * @description
 * @date 2019/9/24/024
 */
@Service
public class CategoryService {
        @Autowired
        private CategoryMapper categoryMapper;

        public int insert(){
            Category category = new Category();
            category.setCategoryName("sda");
            category.setText("asdsad");
            int rows = categoryMapper.insert(category);
            return rows;
        }
}
