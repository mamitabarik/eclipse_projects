package com.viva.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.viva.dao.IEmpDao;
import com.viva.entity.Emp;

public class ViewEmpByID {
	
	private static ApplicationContext ctx;
	
	static {
		ctx = new AnnotationConfigApplicationContext(HibernateConfig.class);
	}
	public static void main(String[] args) {
		IEmpDao dao= ctx.getBean("empdao",IEmpDao.class);
		Emp emp=dao.getEmployee(10002);
		System.out.println(emp);
		
	}
	

}
