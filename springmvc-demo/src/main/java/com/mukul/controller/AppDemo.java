package com.mukul.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mukul.util.UtilityImplementation1;

public class AppDemo {

	public static void main(final String[] args) {
		final ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"WEB-INF/spring-web-servlet-config.xml");
		final UtilityImplementation1 u = appContext.getBean(UtilityImplementation1.class);
		u.method();
	}
}
