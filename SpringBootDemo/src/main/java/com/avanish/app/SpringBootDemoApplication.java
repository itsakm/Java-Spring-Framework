package com.avanish.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		//Normal way to call an Obj
		/*Alien alien = new Alien();
		alien.code();*/

		//Application Context can give the way to search in the Ioc container
		ApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);

		//from the Ioc container we can find the bean using get Bean method and providing Alien.class
		//whereas  Alien class has @Component annotation
		Alien obj = context.getBean(Alien.class);
		obj.code();



	}

}
