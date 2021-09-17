package com.hs.hsblog.pojo;

/**
 *
 * @author Hs
 * @date 2021/9/3
 * 文章实体类
 */

public class Article {
    private Integer id;

    /**
     * 文章id
     */
    private Long articleId;

    /**
     * 文章作者
     */
    private String author;

    /**
     * 文章名
     */
    private String articleTitle;

    /**
     * 文章发布时间
     */
    private String publishDate;

    /**
     * 最后一次修改时间
     */
    private String updateDate;

    /**
     * 文章内容
     */
    private String articleContent;

    public Article(){

    }

    public Article(Integer id, Long articleId, String author, String articleTitle, String publishDate, String updateDate, String articleContent) {
        this.id = id;
        this.articleId = articleId;
        this.author = author;
        this.articleTitle = articleTitle;
        this.publishDate = publishDate;
        this.updateDate = updateDate;
        this.articleContent = articleContent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", author='" + author + '\'' +
                ", articleTitle=" + articleTitle +
                ", publishDate='" + publishDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", articleContent='" + articleContent + '\'' +
                '}';
    }
}
