package com.hs.hsblog.service.impl;

import com.hs.hsblog.mapper.ArticleMapper;
import com.hs.hsblog.pojo.Article;
import com.hs.hsblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Hs
 * @date 2021/9/16
 * 博客service实现类
 */

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public int saveArticle(Article article) {
        return articleMapper.saveArticle(article);
    }
}
