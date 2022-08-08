package com.keyword.api.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keyword.api.dao.HomeDao;
import com.keyword.api.entity.AppInfo;
import com.keyword.api.entity.Screenshot;

@Repository
public class MybatisHomeDao implements HomeDao {
	
	private HomeDao mapper;
	
	@Autowired
	public MybatisHomeDao(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(HomeDao.class);
	}
	
	@Override
	public List<AppInfo> getAppInfoList() {
		
		return mapper.getAppInfoList();
	}

	@Override
	public List<AppInfo> getAppInfoList(String category) {
		
		return mapper.getAppInfoList(category);
	}

	@Override
	public List<Screenshot> getScreenshotList(int applicationId) {

		return mapper.getScreenshotList(applicationId);
	}
}
