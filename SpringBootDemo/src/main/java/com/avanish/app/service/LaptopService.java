package com.avanish.app.service;

import com.avanish.app.repo.LaptopRepository;
import com.avanish.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepository laptopRepository;

    public void addLaptop(Laptop lap)
    {
       laptopRepository.save(lap);
    }

    public boolean isGoodForProg(Laptop lap)
    {
        return true;
    }
}
