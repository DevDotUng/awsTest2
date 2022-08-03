package com.keyword.api.entity;

public class HomeResult {
	private AppInfo appInfo;
	private Screenshot[] screenshots;
	
	public HomeResult() {
		
	}
	
	public HomeResult(AppInfo appInfo, Screenshot[] screenshots) {
		super();
		this.appInfo = appInfo;
		this.screenshots = screenshots;
	}

	public AppInfo getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}
	public Screenshot[] getScreenshots() {
		return screenshots;
	}
	public void setScreenshots(Screenshot[] screenshots) {
		this.screenshots = screenshots;
	}
}
