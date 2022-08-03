package com.keyword.api.entity;

public class Keyword {
	private int id;
	private String keyword;
	private String category;
	
	public Keyword() {
		
	}
	
	public Keyword(int id, String keyword, String category) {
		super();
		this.id = id;
		this.keyword = keyword;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
