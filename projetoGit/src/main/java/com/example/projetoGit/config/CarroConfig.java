package com.example.projetoGit.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.projetoGit.entities.Carro;
import com.example.projetoGit.repository.CarroRepository;

public class CarroConfig implements CommandLineRunner {

    @Autowired
    private CarroRepository carroRepository;

    @Override
    public void run(String... args) throws Exception{

        Carro c1 = new Carro(null,"Porsche", "911", 2017);

        carroRepository.saveAll(Arrays.asList(c1));
    } 

}
