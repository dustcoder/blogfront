package com.ren.blog.model;

import java.io.Serializable;

public class TagArticle implements Serializable {

    private String tagName;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }


    private Integer tagArticleId;


    private Integer tagId;


    private Integer articleId;


    private String enable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tag_article
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag_article.tag_article_id
     *
     * @return the value of tag_article.tag_article_id
     *
     * @mbggenerated
     */
    public Integer getTagArticleId() {
        return tagArticleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag_article.tag_article_id
     *
     * @param tagArticleId the value for tag_article.tag_article_id
     *
     * @mbggenerated
     */
    public void setTagArticleId(Integer tagArticleId) {
        this.tagArticleId = tagArticleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag_article.tag_id
     *
     * @return the value of tag_article.tag_id
     *
     * @mbggenerated
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag_article.tag_id
     *
     * @param tagId the value for tag_article.tag_id
     *
     * @mbggenerated
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag_article.article_id
     *
     * @return the value of tag_article.article_id
     *
     * @mbggenerated
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag_article.article_id
     *
     * @param articleId the value for tag_article.article_id
     *
     * @mbggenerated
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag_article.enable
     *
     * @return the value of tag_article.enable
     *
     * @mbggenerated
     */
    public String getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag_article.enable
     *
     * @param enable the value for tag_article.enable
     *
     * @mbggenerated
     */
    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_article
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tagArticleId=").append(tagArticleId);
        sb.append(", tagId=").append(tagId);
        sb.append(", articleId=").append(articleId);
        sb.append(", enable=").append(enable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}