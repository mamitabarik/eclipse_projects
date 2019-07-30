package com.viva.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.viva.service.Iser;

public class ClientA {
	
	private static ApplicationContext ctx;
	
	static {
		ctx = new ClassPathXmlApplicationContext("beans.xml");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		
		Iser ser= ctx.getBean("myservice" , Iser.class);
		System.out.println(ser.getService());
		
		System.out.println("2nd servi"); 
		
		ser= ctx.getBean("myservice" , Iser.class);
		System.out.println(ser.getService());
	}

}
