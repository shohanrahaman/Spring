package com.shohan.RootPathBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Root Path Bean!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml"); //RootPathBean
		Patient p = (Patient) context.getBean("patient"); 
		p.speak();

	}
}
