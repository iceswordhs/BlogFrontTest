package com.hs.hsblog.mapper;

import com.hs.hsblog.pojo.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {
    @Insert("insert into article(articleId,author,articleTitle,articleContent) values(#{articleId},#{author}," +
            "#{articleTitle},#{articleContent})")
    int saveArticle(Article article);
}
