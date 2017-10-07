package com.timkita.dao;

import java.io.Serializable;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.enterprise.context.SessionScoped;

import com.timkita.util.RestClientUtil;

@SessionScoped
public class TestDao implements Serializable{

	private static final long serialVersionUID = 1L;

	public String test(String test) {
		try {
			return RestClientUtil.getFeature(test);
		} catch (KeyManagementException e) {
			return e.getMessage();
		} catch (NoSuchAlgorithmException e) {
			return e.getMessage();
		}
	}
	
}
