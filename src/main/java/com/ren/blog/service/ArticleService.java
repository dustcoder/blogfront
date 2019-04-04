package com.ren.blog.service;/*
 *@Author:WuRen
 *@Description:
 *@date: 19:42 2018/12/15
 */

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.ren.blog.dto.ArticleDto;
import com.ren.blog.model.Article;

import java.util.List;

public interface ArticleService {

    PageInfo getArticleList(int pageNum, int pageSize);


    PageInfo getArticleListByCataId(int pageNum, int pageSize,String cataName);


    PageInfo getArticleListByTagId(int pageNum, int pageSize,Integer tagId);


    ArticleDto getArticle(Integer articleId)  throws Exception;

}
