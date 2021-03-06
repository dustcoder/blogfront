package com.ren.blog.dao;

import com.ren.blog.model.TagArticle;

import java.util.List;

public interface TagArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_article
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer tagArticleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_article
     *
     * @mbggenerated
     */
    int insert(TagArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_article
     *
     * @mbggenerated
     */
    TagArticle selectByPrimaryKey(Integer tagArticleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_article
     *
     * @mbggenerated
     */
    List<TagArticle> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_article
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TagArticle record);



    int deleteTagArticle(Integer articleId);

    List<TagArticle> getTagArticleList(Integer articleId);
}