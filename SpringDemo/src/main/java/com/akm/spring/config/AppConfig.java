package com.akm.spring.config;


import com.akm.spring.Alien;
import com.akm.spring.Computer;
import com.akm.spring.Desktop;
import com.akm.spring.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.akm.spring")
public class AppConfig {

//    @Bean
//    public Alien alien( Computer com) //Though we are putting computer here w
//    {                                //we will get the desktop created below @Qualifier("desktop")
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//
//    @Bean
////    @Bean(name = "com2")
////    @Bean(name = {"com2","beast","com1"})
////    @Scope("prototype")
//    public Desktop desktop()
//    {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop()
//    {
//        return new Laptop();
//    }
}
