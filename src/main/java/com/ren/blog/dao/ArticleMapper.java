package com.ren.blog.dao;

import com.ren.blog.dto.ArticleDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {

    ArticleDto selectByPrimaryKey(@Param("articleId")Integer articleId);

    List<ArticleDto> getArticleList();

    List<ArticleDto> getArticleListByCataName(@Param("cataName") String cataName);

    List<ArticleDto> getArticleListByTagId(@Param("tagId") Integer tagId);


}