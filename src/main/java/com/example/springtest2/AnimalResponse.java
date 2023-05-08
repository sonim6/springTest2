package com.example.springtest2;
//Service trieda

public class AnimalResponse {
    private Long Id;
    private String species;

    public AnimalResponse(Animal animal){
        this.Id=animal.getId();
        this.species=animal.getSpecies();
    }
}
