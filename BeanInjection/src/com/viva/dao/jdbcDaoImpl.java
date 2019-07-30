package com.viva.dao;

public class jdbcDaoImpl  implements IDao{
	 public jdbcDaoImpl() {
		 System.out.println("jdbc deo");
	 }
	@Override
	public String getDao() {
		// TODO Auto-generated method stub
		return "jdbc";
	}


}
