package com.viva.service;

import com.viva.dao.IDao;

public class SerImpl implements Iser {
	private IDao dao;
	public SerImpl() {
		IDao dao;
		System.out.println(" service");
	}

	
	public SerImpl(IDao dao) {
	
		this.dao = dao;
		System.out.println(" service with one arg");
	}


	@Override
	public String getService() {
		// TODO Auto-generated method stub
		return dao.getDao();
	}
//	public void setDao(IDao dao) {
//		System.out.println(" dao is injected");
//		this.dao=dao;
//	}
}
