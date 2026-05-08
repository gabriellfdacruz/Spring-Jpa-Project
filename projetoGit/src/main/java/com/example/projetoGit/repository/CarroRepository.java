package com.example.projetoGit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoGit.entities.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
