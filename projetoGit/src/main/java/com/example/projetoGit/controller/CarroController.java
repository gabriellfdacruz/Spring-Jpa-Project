package com.example.projetoGit.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoGit.entities.Carro;
import com.example.projetoGit.service.CarroService;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @PostMapping
    public ResponseEntity<Carro> create(@RequestBody Carro obj){
        return ResponseEntity.status(HttpStatus.CREATED).body(carroService.create(obj));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> findId(@PathVariable Long id) {
        Carro carro = carroService.findById(id)
            .orElseThrow(() -> new RuntimeException("Carro não encontrado"));
        return ResponseEntity.ok(carro);
    }
    
    @PutMapping("path/{id}")
    public ResponseEntity<Carro> update(@PathVariable Long id, @RequestBody Carro obj) {
        obj.setId(id);
        return ResponseEntity.ok().body(carroService.update(obj));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
       carroService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Carro>> getAll() {
        return ResponseEntity.ok().body(carroService.getAll());
    }
    
}
