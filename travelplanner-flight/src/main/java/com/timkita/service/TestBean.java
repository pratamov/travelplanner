package com.timkita.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.timkita.dao.TestDao;

@Stateless
public class TestBean implements TestService{

	@Inject
	TestDao testDao;
	
	public String test(String test) {
		
		return testDao.test(test);
	}

}
