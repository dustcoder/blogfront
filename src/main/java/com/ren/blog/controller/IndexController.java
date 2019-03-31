package com.ren.blog.controller;
/*
 *@Author:WuRen
 *@Description:主页
 */

import com.github.pagehelper.PageInfo;
import com.ren.blog.model.Article;
import com.ren.blog.model.TagArticle;
import com.ren.blog.service.ArticleService;
import com.ren.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private TagService tagService;


    @GetMapping("/index")
    public ModelAndView index(@RequestParam(defaultValue = "1") Integer pageNum,
                              @RequestParam(defaultValue = "10") Integer pageSize){

        ModelAndView view = new ModelAndView();
        try {
            view.setViewName("index.html");
            PageInfo pageInfo = articleService.getArticleList(pageNum,pageSize);
            //我的标签
            view.addObject("tagList",tagService.getTags());
            view.addObject("pageNum", pageInfo.getPageNum());
            //获得一页显示的条数
            view.addObject("pageSize", pageInfo.getPageSize());
            //是否是第一页
            view.addObject("isFirstPage", pageInfo.isIsFirstPage());
            //获得总页数
            view.addObject("totalPages", pageInfo.getPages());
            //是否是最后一页
            view.addObject("isLastPage", pageInfo.isIsLastPage());
            view.addObject("pageInfo", pageInfo);
//            view.addObject("article",articleService.getArticleList());//文章列表
        }catch (Exception e){
            e.printStackTrace();
        }
        return view;
    }

    @GetMapping("/article")
    public ModelAndView article(@RequestParam(value="articleId") Integer articleId){
        ModelAndView view = new ModelAndView();
        try {
            view.setViewName("article.html");
            view.addObject("article",articleService.getArticle(articleId));
        }catch (Exception e){
            e.printStackTrace();
        }
        return view;
    }

    @GetMapping("/catalist")
    public ModelAndView catalist(){
        ModelAndView view = new ModelAndView();
        view.setViewName("catalist.html");
        return view;
    }

    @GetMapping("/taglist")
    public ModelAndView taglist(){
        ModelAndView view = new ModelAndView();
        view.setViewName("taglist.html");
        return view;
    }
}
