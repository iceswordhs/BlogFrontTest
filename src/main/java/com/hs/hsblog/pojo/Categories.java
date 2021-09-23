package com.hs.hsblog.pojo;

/**
 * @author Hs
 * @Date 2021/9/22 17:04
 * 分类
 */
public class Categories {
    /**
     * 分类id
     */
    private int id;

    /**
     * 分类名
     */
    private String categoryName;

    public Categories(){

    }

    public Categories(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
