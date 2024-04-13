package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(MyComponentBean.class);
		MyComponentBean myComponentBean = context.getBean(MyComponentBean.class);
		myComponentBean.doSomething();

		ApplicationContext context2 = new AnnotationConfigApplicationContext(MyConfiguration.class);
		AnotherBean anotherBean = context2.getBean(AnotherBean.class);
		anotherBean.doSomethingElse();

		ApplicationContext context3 = new AnnotationConfigApplicationContext(AnotherConfiguration.class);
		boolean condition = context3.getBeanNamesForType(ConditionalBean.class).length > 0;
		if (condition) {
			ConditionalBean thirdBean = context3.getBean(ConditionalBean.class);
			thirdBean.doSomething();
		} else {
			System.out.println("ConditionalBean is empty");
		}
	}


}
