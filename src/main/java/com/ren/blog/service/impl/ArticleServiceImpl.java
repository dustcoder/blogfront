package com.ren.blog.service.impl;/*
 *@Author:WuRen
 *@Description:
 *@date: 19:43 2018/12/15
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ren.blog.dao.ArticleMapper;
import com.ren.blog.dao.TagArticleMapper;
import com.ren.blog.dto.ArticleDto;
import com.ren.blog.model.Article;
import com.ren.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {


    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private TagArticleMapper tagArticleMapper;

    @Override
    public ArticleDto getArticle(Integer articleId) throws Exception{
        ArticleDto articleDto = articleMapper.selectByPrimaryKey(articleId);
        articleDto.setTagList(tagArticleMapper.getTagArticleList(articleId));
        return articleDto;
    }

    @Override
    public PageInfo getArticleList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ArticleDto> list =  articleMapper.getArticleList();
        for(ArticleDto articleDto : list){
            articleDto.setTagList(tagArticleMapper.getTagArticleList(Integer.parseInt(articleDto.getArticleId())));;
        }
        //使用PageInfo包装查询结果，只需要将pageInfo交给页面就可以
        PageInfo pageInfo = new PageInfo<ArticleDto>(list);
        return pageInfo;
    }



}
