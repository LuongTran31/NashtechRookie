package com.nashtechglobal.datamodel;
import java.time.LocalDate;

public class Post {
	private Integer Id;
	private String author;
	private String tittle;
	private String description;
	private String content;
	private LocalDate date;
	
	
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(Integer id, String author, String tittle, String description, String content, LocalDate date) {
		super();
		Id = id;
		this.author = author;
		this.tittle = tittle;
		this.description = description;
		this.content = content;
		this.date = date;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Post [Id=" + Id + ", author=" + author + ", tittle=" + tittle + ", description=" + description
				+ ", content=" + content + ", date=" + date + "]";
	}
	
}
