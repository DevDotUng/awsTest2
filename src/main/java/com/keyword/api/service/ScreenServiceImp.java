package com.keyword.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keyword.api.dao.ScreenDao;
import com.keyword.api.entity.Keyword;
import com.keyword.api.entity.PointWithKeyword;
import com.keyword.api.entity.ScreenResult;
import com.keyword.api.entity.ScreenshotWithPoint;

@Service
public class ScreenServiceImp implements ScreenService {

	@Autowired
	ScreenDao screenDao;
	
	@Override
	public ScreenResult getScreenView(int applicationId) {
		
		List<ScreenshotWithPoint> screenshotWithPoints = screenDao.getScreenshot(applicationId);
		
		for (ScreenshotWithPoint list : screenshotWithPoints) {
			List<PointWithKeyword> pointList = screenDao.getPointByImage(list.getId());
			
			for (PointWithKeyword pList : pointList) {
				List<Keyword> keywordList = screenDao.getKeyword(pList.getId());
				Keyword[] keywordArray = keywordList.toArray(new Keyword[keywordList.size()]);
				
				pList.setKeywords(keywordArray);
			}
			
			PointWithKeyword[] pointArray = pointList.toArray(new PointWithKeyword[pointList.size()]);
			
			list.setPointWithKeyword(pointArray);
		}
		
		ScreenshotWithPoint[] screenshotWithPointArray =
				screenshotWithPoints.toArray(new ScreenshotWithPoint[screenshotWithPoints.size()]);
		
		ScreenResult screenResult = new ScreenResult(screenshotWithPointArray);
		
		return screenResult;
	}

}
