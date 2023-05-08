package com.example.springtest2;
//repositar pre animal, repozitar byva interface


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//povieme o aky repozitar sa jedna a ake ma v tomto pripade Id
public interface IAnimalRepository extends JpaRepository<Animal, Long> {
    List<Animal> findAll(); //findAll je nazov metody. Najde nam vsetky Animaly v databaze.
}
