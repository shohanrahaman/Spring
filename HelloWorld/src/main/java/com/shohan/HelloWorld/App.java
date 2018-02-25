package com.shohan.HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

		HelloDemo hd = (HelloDemo) context.getBean("hellodemo");
		hd.display();
		
		((FileSystemXmlApplicationContext)context).close();
	}
}
