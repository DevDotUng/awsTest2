package com.keyword.api.entity;

public class AppInfo {
	private int id;
	private String name;
	private String icon;
	private String category;
	private String corperation;
	
	public AppInfo() {
		
	}
	
	public AppInfo(int id, String name, String icon, String category, String corperation) {
		super();
		this.id = id;
		this.name = name;
		this.icon = icon;
		this.category = category;
		this.corperation = corperation;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCorperation() {
		return corperation;
	}
	public void setCorperation(String corperation) {
		this.corperation = corperation;
	}
	
	
}
