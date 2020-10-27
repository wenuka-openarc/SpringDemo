package com.demo.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Payment payment = context.getBean("payment" , Payment.class );
		
		payment.pay();
		
	}

}
