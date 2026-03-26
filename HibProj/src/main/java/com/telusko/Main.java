package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.telusko.Laptop.class)
                .configure()
                .buildSessionFactory();


        Session session = sf.openSession();

        String brand = "Asus";
        Query query = session.createQuery("select brand,model from Laptop where brand like ?1");
        query.setParameter(1,brand);

        List<Object []> laptops = query.getResultList();
//        Laptop l1 = session.find(Laptop.class,3);

        for(Object[] data : laptops)
            System.out.println((String)data[0] + " "+ (String)data[1]);

        session.close();

        sf.close();



    }
}
