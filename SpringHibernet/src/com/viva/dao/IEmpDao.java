package com.viva.dao;

import java.util.List;

import com.viva.entity.Emp;



public interface IEmpDao {

	int addEmployee(Emp emp);
	
	public Emp getEmployee(int eid);
	
	public int editEmployee(Emp emp);
	 
	public int removeEmployee(int eid);
	
	public List<Emp> getEmployee(String dept);
	
	public List<Emp> getEmployee();
	
	public List<Emp> getEmployessLike(String name);
	

}
