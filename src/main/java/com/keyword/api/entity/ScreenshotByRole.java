package com.keyword.api.entity;

public class ScreenshotByRole {
	private String role;
	private Screenshot[] screenshots;
	
	public ScreenshotByRole() {
		
	}
	
	public ScreenshotByRole(String role, Screenshot[] screenshots) {
		super();
		this.role = role;
		this.screenshots = screenshots;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Screenshot[] getScreenshots() {
		return screenshots;
	}
	public void setScreenshots(Screenshot[] screenshots) {
		this.screenshots = screenshots;
	}
}
