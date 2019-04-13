package com.ren.blog.dto;/*
 *@Author:WuRen
 *@Description:
 *@date: 16:25 2019/3/30
 */

import com.ren.blog.model.TagArticle;

import java.util.Date;
import java.util.List;

public class ArticleDto {


    private Date createTime;
    private String cataName;
    private String articleName;
    private List<TagArticle> tagList;
    private String briefContent;
    private String fileName;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    private String articleId;



    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCataName() {
        return cataName;
    }

    public void setCataName(String cataName) {
        this.cataName = cataName;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }



    public String getBriefContent() {
        return briefContent;
    }

    public List<TagArticle> getTagList() {
        return tagList;
    }

    public void setTagList(List<TagArticle> tagList) {
        this.tagList = tagList;
    }

    public void setBriefContent(String briefContent) {
        this.briefContent = briefContent;
    }
}
