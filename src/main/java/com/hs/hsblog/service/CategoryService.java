package com.hs.hsblog.service;

import com.hs.hsblog.utils.DataMap;

/**
 * @author Hs
 * @Date 2021/9/22 17:34
 * 分类Service接口
 */
public interface CategoryService {

    /**
     * 获得所有的分类
     * @return
     */
    DataMap<Object> findCategoriesNames();

    /**
     * 获取分类的数目
     * @return
     */
    int findAllCategoriesNum();

    /**
     * 获取所有分类的名称和id
     * @return
     */
    DataMap<Object> findAllCategories();
}
