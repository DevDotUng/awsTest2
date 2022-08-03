package com.keyword.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keyword.api.dao.HomeDao;
import com.keyword.api.entity.AppInfo;
import com.keyword.api.entity.HomeResult;
import com.keyword.api.entity.Screenshot;

@Service
public class HomeServiceImp implements HomeService {
	
	@Autowired
	private HomeDao homeDao;

	@Override
	public List<HomeResult> getHomeList() {

		List<AppInfo> appInfoList = homeDao.getAppInfoList();
		
		List<HomeResult> homeResultList = new ArrayList<HomeResult>();
		
		for (AppInfo list : appInfoList) {
			HomeResult homeResult = new HomeResult();
			
			List<Screenshot> screenshotList = homeDao.getScreenshotList(list.getId());
			
			Screenshot[] screenshotArray = screenshotList.toArray(new Screenshot[screenshotList.size()]);
			
			homeResult.setAppInfo(list);
			homeResult.setScreenshots(screenshotArray);
			
			homeResultList.add(homeResult);
		}

		return homeResultList;
	}

	@Override
	public List<HomeResult> getHomeList(String category) {
		
		List<AppInfo> appInfoList = homeDao.getAppInfoList(category);
		
		List<HomeResult> homeResultList = new ArrayList<HomeResult>();
		
		for (AppInfo list : appInfoList) {
			HomeResult homeResult = new HomeResult();
			
			List<Screenshot> screenshotList = homeDao.getScreenshotList(list.getId());
			
			Screenshot[] screenshotArray = screenshotList.toArray(new Screenshot[screenshotList.size()]);
			
			homeResult.setAppInfo(list);
			homeResult.setScreenshots(screenshotArray);
			
			homeResultList.add(homeResult);
		}

		return homeResultList;
	}

//	@Override
//	public void insert(AppInfo home) {
//		
//		homeDao.insert(home);
//	}
}
