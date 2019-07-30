
package com.viva.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.viva.dao.IEmpDao;
import com.viva.entity.Emp;

public class RemoveEmployee{
	
	private static ApplicationContext ctx;
	
	static {
		ctx = new AnnotationConfigApplicationContext(HibernateConfig.class);
	}
	public static void main(String[] args) {
		IEmpDao dao= ctx.getBean("empdao",IEmpDao.class);
		
		dao.removeEmployee(10004);
		System.out.println("delited");
		
	}
	

}


