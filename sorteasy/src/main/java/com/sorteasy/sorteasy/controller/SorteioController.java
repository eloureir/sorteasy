package com.sorteasy.sorteasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sorteasy.sorteasy.dto.SorteioDTO;
import com.sorteasy.sorteasy.entity.Sorteio;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/sorteio")
public class SorteioController {

    @Autowired
    SorteioService service;

    @PostMapping
    public SorteioDTO save(
        @RequestBody @Valid SorteioDTO sorteioCreateDTO) {
            return service.save(sorteioCreateDTO);
        }

    @GetMapping
    public List<SorteioDTO> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }

    @GetMapping("/{id}/realizar")
    public Sorteio realizarSorteio(@PathVariable("id") Long id) {
        return service.realizarSorteio(id);
    }
    
    
}
