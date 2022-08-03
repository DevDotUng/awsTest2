package com.keyword.api.entity;

public class Screenshot {
	private int id;
	private String role;
	private String image;
	
	public Screenshot() {
		
	}
	
	public Screenshot(int id, String role, String image) {
		super();
		this.id = id;
		this.role = role;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
