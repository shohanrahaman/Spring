package com.shohan.PNamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean Scope!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shohan/bean/beans.xml");
		Patient p = (Patient) context.getBean("patient");
		System.out.println(p);
		
		//Using Property Namespace [P Namespace] 
	}
}
