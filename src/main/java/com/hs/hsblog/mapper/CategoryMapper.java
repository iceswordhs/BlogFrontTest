package com.hs.hsblog.mapper;

import com.hs.hsblog.pojo.Categories;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Hs
 * @Date 2021/9/22 17:13
 * 分类Mapper
 */
@Mapper
public interface CategoryMapper {
    @Insert("insert into categories(id,categoryName) values(#{id},#{categoryName})")
    void save(Categories categories);

    @Select("select categoryName from categories")
    List<String> findCategoriesName();

    @Select("select count(*) from categories")
    int countCategoriesNum();

    @Select("select id,categoryName from categories")
    List<Categories> findAllCategories();

    @Delete("delete from categories where categoryName=#{categoryName}")
    void deleteCategory(String categoryName);

    @Select("select ifnull((select id from categories where categoryName=#{categoryName}),0)")
    int findIsExistByCategoryName(String categoryName);
}
