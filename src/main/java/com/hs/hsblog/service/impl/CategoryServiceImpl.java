package com.hs.hsblog.service.impl;

import com.hs.hsblog.mapper.CategoryMapper;
import com.hs.hsblog.pojo.Categories;
import com.hs.hsblog.service.CategoryService;
import com.hs.hsblog.utils.DataMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hs
 * @Date 2021/9/22 17:50
 * 分类service的实现类
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public DataMap<Object> findCategoriesNames() {
        List<String> categoriesName = categoryMapper.findCategoriesName();
        return DataMap.success().setData(categoriesName);
    }

    @Override
    public int findAllCategoriesNum() {
        return categoryMapper.countCategoriesNum();
    }

    @Override
    public DataMap<Object> findAllCategories() {
        List<Categories> allCategories = categoryMapper.findAllCategories();
        return DataMap.success().setData(allCategories);
    }
}
