package com.avanish.app;

import com.avanish.app.model.Alien;
import com.avanish.app.model.Laptop;
import com.avanish.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		//Application Context can give the way to search in the Ioc container
		//from the Ioc container we can find the bean using get Bean method and providing Alien.class
		//whereas  Alien class has @Component annotation

		ApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService laptopService = context.getBean(LaptopService.class);
		Laptop laptop = context.getBean(Laptop.class);
		laptopService.addLaptop(laptop);



//		Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();




		//Normal way to call an Obj
		/*Alien alien = new Alien();
		alien.code();*/





	}

}
