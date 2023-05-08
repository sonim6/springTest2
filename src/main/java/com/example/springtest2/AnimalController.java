package com.example.springtest2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/animal")
public class AnimalController {


    @Autowired
    private IAnimalService animalService;

    @GetMapping
    public List<AnimalResponse> getAllAnimals(){
        return this.animalService.getAll().stream().map(AnimalResponse::new).collect(Collectors.toList());
    }

}
