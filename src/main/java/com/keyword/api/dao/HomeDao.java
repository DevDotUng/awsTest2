package com.keyword.api.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.keyword.api.entity.AppInfo;
import com.keyword.api.entity.Screenshot;

@Repository
@Mapper
public interface HomeDao {
	List<AppInfo> getAppInfoList();
	
	List<AppInfo> getAppInfoList(String category);
	
	List<Screenshot> getScreenshotList(int applicationId);
	
	//void insert(AppInfo home);
}
