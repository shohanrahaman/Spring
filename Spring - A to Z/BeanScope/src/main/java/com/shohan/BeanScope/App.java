package com.shohan.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean Scope!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shohan/bean/beans.xml");
		Patient p1 = (Patient) context.getBean("patient");
		p1.setName("Rahaman");
		System.out.println(p1);
		
		//singleton - same object reference
		//prototype - different object reference
		
		Patient p2 = (Patient) context.getBean("patient");
		System.out.println(p2); 
	}
}
