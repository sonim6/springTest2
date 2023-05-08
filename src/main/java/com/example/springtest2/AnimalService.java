package com.example.springtest2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService implements IAnimalService {

    @Autowired
    private IAnimalRepository repository;

    public List<Animal> getAll(){
        return this.repository.findALl();
    }

}
