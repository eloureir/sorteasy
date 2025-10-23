package com.sorteasy.sorteasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sorteasy.sorteasy.dto.ParticipanteDTO;
import com.sorteasy.sorteasy.service.ParticipanteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/participantes")
public class ParticipanteController {

    @Autowired
    ParticipanteService service;

    @PostMapping
    public ParticipanteDTO save(
        @RequestBody @Valid ParticipanteDTO participanteCreateDTO) {
            return service.save(participanteCreateDTO);
        }

    @GetMapping("/sorteio/{id}")
    public List<ParticipanteDTO> findBySorteioId(@PathVariable("id") Long id) {
        return service.findBySorteioId(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }
}
