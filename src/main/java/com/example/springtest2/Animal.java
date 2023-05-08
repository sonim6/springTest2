package com.example.springtest2;


import jakarta.persistence.*;
import lombok.Data;

//Entitna trieda
@Entity
@Data
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String species;
}
