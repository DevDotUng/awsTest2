package com.keyword.api.entity;

public class ScreenResult {
	private ScreenshotWithPoint[] screenshotWithPoint;

	public ScreenResult() {
		
	}
	
	public ScreenResult(ScreenshotWithPoint[] screenshotWithPoint) {
		super();
		this.screenshotWithPoint = screenshotWithPoint;
	}

	public ScreenshotWithPoint[] getScreenshotWithPoint() {
		return screenshotWithPoint;
	}

	public void setScreenshotWithPoint(ScreenshotWithPoint[] screenshotWithPoint) {
		this.screenshotWithPoint = screenshotWithPoint;
	}
}
