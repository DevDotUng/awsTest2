package com.keyword.api.service;

import java.util.List;

import com.keyword.api.entity.AppInfo;
import com.keyword.api.entity.HomeResult;

public interface HomeService {
	List<HomeResult> getHomeList();
	
	List<HomeResult> getHomeList(String category);

	//void insert(AppInfo home);
}
