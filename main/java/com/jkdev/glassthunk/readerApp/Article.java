package com.jkdev.glassthunk.readerApp;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long articleId;
	private String articleName;
	private String title;
	private String description;
	
	@CreationTimestamp
	private Date published;
	
	@ManyToOne
	@JsonBackReference
	private User user;
	
	private int likes;
	
	@OneToMany(mappedBy = "article", fetch=FetchType.EAGER)
	private List<Synopsis> synopsisList;

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Synopsis> getSynopsisList() {
		return synopsisList;
	}

	public void setSynopsisList(List<Synopsis> synopsisList) {
		this.synopsisList = synopsisList;
	}
	
	
	
}
