package com.keyword.api.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.keyword.api.entity.AppInfo;
import com.keyword.api.entity.Screenshot;

@Mapper
public interface DetailDao {
	AppInfo getAppInfo(int applicationId);
	
	int getMaxRoleSequence(int applicationId);
	
	String getRole(int applicationId, int roleSequence);
	
	List<Screenshot> getImage(int applicationId, int roleSequence);
}
