package com.keyword.api.entity;

public class DetailResult {
	private AppInfo appInfo;
	private ScreenshotByRole[] screenshotsByRole;
	
	public DetailResult() {
		
	}
	
	public DetailResult(AppInfo appInfo, ScreenshotByRole[] screenshotsByRole) {
		super();
		this.appInfo = appInfo;
		this.screenshotsByRole = screenshotsByRole;
	}
	public AppInfo getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}
	public ScreenshotByRole[] getScreenshotsByRole() {
		return screenshotsByRole;
	}
	public void setScreenshotsByRole(ScreenshotByRole[] screenshotsByRole) {
		this.screenshotsByRole = screenshotsByRole;
	}
}
