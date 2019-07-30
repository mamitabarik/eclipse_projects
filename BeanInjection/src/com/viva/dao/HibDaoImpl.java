package com.viva.dao;

public class HibDaoImpl implements IDao {
	 public HibDaoImpl() {
		 System.out.println("Hibarnet dao constructor");
	 }

	@Override
	public String getDao() {
		// TODO Auto-generated method stub
		return "hibernet";
	}
}
