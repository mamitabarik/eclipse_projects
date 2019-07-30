package com.viva.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.viva.dao.IEmpDao;
import com.viva.entity.Emp;

public class ViewEmployee {
private static ApplicationContext ctx;
	
	static {
		
		ctx= new AnnotationConfigApplicationContext(HibernateConfig.class);
	}
	public static void main(String[] args) {
		IEmpDao dao= ctx.getBean("empdao",IEmpDao.class);
		List<Emp> lst = dao.getEmployee("hr");
		lst.forEach(System.out::println);
		System.out.println("---------------------");
		List<Emp> lst2 = dao.getEmployee();
		lst2.forEach(System.out::println);
		List<Emp> lst3 = dao.getEmployessLike("ra");
		lst3.forEach(System.out::println);
		
		
	}

}
