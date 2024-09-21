package com.akm.spring;

import com.akm.spring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //JAVA Based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();




//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//        Desktop dt1 = context.getBean(Desktop.class);

        //XML based configuration
/*        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien)context.getBean("alien");
        System.out.println(obj1.age);
        obj1.code();*/
//        obj1.setAge(20);
//        System.out.println(obj1.getAge());
//        Alien obj2 = (Alien)context.getBean("alien");
//        System.out.println(String.valueOf(obj2.age));

    }
}
