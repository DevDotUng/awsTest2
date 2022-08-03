package com.keyword.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keyword.api.dao.DetailDao;
import com.keyword.api.entity.AppInfo;
import com.keyword.api.entity.DetailResult;
import com.keyword.api.entity.Screenshot;
import com.keyword.api.entity.ScreenshotByRole;

@Service
public class DetailServiceImp implements DetailService {
	
	@Autowired
	DetailDao detailDao;

	@Override
	public DetailResult getDetailView(int applicationId) {
		
		AppInfo appInfo = detailDao.getAppInfo(applicationId);
		
		List<ScreenshotByRole> screenshotByRoleList = new ArrayList<ScreenshotByRole>();
		
		int maxRoleSequence = detailDao.getMaxRoleSequence(applicationId);
		
		for (int roleSequence = 0; roleSequence <= maxRoleSequence; roleSequence++) {
			String role = detailDao.getRole(applicationId, roleSequence);
			List<Screenshot> screenshots = detailDao.getImage(applicationId, roleSequence);
			screenshotByRoleList.add(new ScreenshotByRole(role, screenshots.toArray(new Screenshot[screenshots.size()])));
		}
		
		DetailResult detailResult =
				new DetailResult(appInfo, screenshotByRoleList.toArray(new ScreenshotByRole[screenshotByRoleList.size()]));
		
		return detailResult;
	}

}
