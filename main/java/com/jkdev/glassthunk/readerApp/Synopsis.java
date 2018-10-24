package com.jkdev.glassthunk.readerApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Synopsis {
	
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long synopsisId;
    private String content;
    
    @ManyToOne
    @JsonIgnore
    private Article article;
    private Long articleId;
    private String userName;
	public Long getSynopsisId() {
		return synopsisId;
	}
	public void setSynopsisId(Long synopsisId) {
		this.synopsisId = synopsisId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Long getArticleId() {
		return articleId;
	}
	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
    

}
