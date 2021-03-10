package com.pradeep.spring.springcoreadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/pradeep/spring/springcoreadvanced/autowiring/config.xml");
		Employee e = (Employee) context.getBean("employee");
		System.out.println(e);

	}

}
