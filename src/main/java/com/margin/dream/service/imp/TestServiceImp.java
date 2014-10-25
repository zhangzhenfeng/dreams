package com.margin.dream.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.margin.dream.dao.TestDao;
import com.margin.dream.service.TestService;

@Service
public class TestServiceImp implements TestService{
	
	@Autowired
	private TestDao testDao;
	
	@Override
	public String test() {
		
		testDao.test();
		return null;
	}
	
}
