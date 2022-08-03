package com.keyword.api.entity;

public class ScreenshotWithPoint extends Screenshot {
	private PointWithKeyword[] pointWithKeyword;

	public ScreenshotWithPoint() {
		
	}
	
	public ScreenshotWithPoint(int id, String role, String image, PointWithKeyword[] pointWithKeyword) {
		super();
		this.setId(id);
		this.setRole(role);
		this.setImage(image);
		this.pointWithKeyword = pointWithKeyword;
	}

	public PointWithKeyword[] getPointWithKeyword() {
		return pointWithKeyword;
	}

	public void setPointWithKeyword(PointWithKeyword[] pointWithKeyword) {
		this.pointWithKeyword = pointWithKeyword;
	}
	
	
}
