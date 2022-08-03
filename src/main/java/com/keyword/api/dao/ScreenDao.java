package com.keyword.api.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.keyword.api.entity.Keyword;
import com.keyword.api.entity.PointWithKeyword;
import com.keyword.api.entity.ScreenshotWithPoint;

@Mapper
public interface ScreenDao {
	List<ScreenshotWithPoint> getScreenshot(int applicationId);
	
	List<PointWithKeyword> getPointByImage(int imageId);
	
	List<Keyword> getKeyword(int pointId);
}
