package com.sorteasy.sorteasy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sorteasy.sorteasy.entity.Participante;

@Repository
public interface ParticipanteRepository extends 
        JpaRepository<Participante, Long> {
    
}

