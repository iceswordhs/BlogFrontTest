package com.hs.hsblog.controller;

import com.hs.hsblog.pojo.Article;
import com.hs.hsblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hs
 * @date 2021/9/6
 * 文章controller
 */
@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @RequestMapping("editArticle")
    public String editArticle(){
        return "editorArticle";
    }

    @RequestMapping("/saveArticle")
    @ResponseBody
    public Map<String,Object> saveArticle(@RequestBody Article article){
        HashMap<String, Object> resultMap = new HashMap<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-ss HH:mm:ss");
        article.setPublishDate(simpleDateFormat.format(new Date()));
        article.setUpdateDate(simpleDateFormat.format(new Date()));
        int result = articleService.saveArticle(article);
        resultMap.put("code",200);
        resultMap.put("result",result);
        return resultMap;
    }

    @RequestMapping("/test")
    @ResponseBody
    public Map<String,Object> test(){
        Map<String,Object> map=new HashMap<>();
        map.put("status",404);
        map.put("message","返回的JSON数据中的message");
        return map;
    }

    @RequestMapping("/test1")
    @ResponseBody
    public Map<String,Object> test1(){
        Map<String,Object> map=new HashMap<>();
        map.put("status",200);
        map.put("message","success");
        Map<String,Object> data=new HashMap<>();
        data.put("id","2");
        data.put("date",new Date());
        data.put("name","hs");
        map.put("data",data);
        return map;
    }
}
