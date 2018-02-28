package com.shohan.HelloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello Spring!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shohan/bean/beans.xml"); 
		People p = (People) context.getBean("people");
		p.speak();

	}
}
