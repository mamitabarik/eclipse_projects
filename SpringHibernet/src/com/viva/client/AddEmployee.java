package com.viva.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.viva.dao.IEmpDao;
import com.viva.entity.Emp;

public class AddEmployee {
	
	private static ApplicationContext ctx;
	
	static {
		ctx = new AnnotationConfigApplicationContext(HibernateConfig.class);
	}
	public static void main(String[] args) {
		IEmpDao dao= ctx.getBean("empdao",IEmpDao.class);
		Emp emp=new Emp();
		emp.setEmpId(10005);
		emp.setEmpName("Sizuka");
		emp.setSal(5000000);
		emp.setDept("hr");
		emp.setDoj(LocalDate.of(2017, 1, 1));
		dao.addEmployee(emp);
		System.out.println("employee added");
		
	}
}
