package com.example.projetoGit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetoGit.entities.Carro;
import com.example.projetoGit.repository.CarroRepository;

@Service
public class CarroService {
    
    @Autowired
    private CarroRepository repository;

    public Carro create(Carro obj){//create
        return repository.save(obj);
    }

    public Optional<Carro> findById(Long id) {//read
        return repository.findById(id);
    }

    public Carro update(Carro obj) {//update
        Carro entity = repository.findById(obj.getId())
            .orElseThrow(() -> new RuntimeException("carro nao encontrado"));
        updateCarro(entity, obj);
        return repository.save(entity);
    }

    private void updateCarro( Carro entity, Carro obj) {//update
        entity.setModelo(obj.getModelo());
    }

    public void delete(Long id){//delete
        repository.deleteById(id);
    }

    public List<Carro> getAll() {
        return repository.findAll();
    }

}
