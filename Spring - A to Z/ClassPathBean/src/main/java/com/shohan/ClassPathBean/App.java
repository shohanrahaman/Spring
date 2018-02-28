package com.shohan.ClassPathBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class Path Bean!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shohan/bean/beans.xml"); //ClassPathBean
		People p = (People) context.getBean("people");
		p.speak();

	}
}
