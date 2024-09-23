package com.avanish.app.repo;

import com.avanish.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop)
    {
        System.out.println("Saved in Database!!");
    }
}
