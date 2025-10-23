package com.sorteasy.sorteasy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sorteasy.sorteasy.entity.Participante;
import com.sorteasy.sorteasy.entity.Sorteio;

public interface SorteioRepository extends 
        JpaRepository<Sorteio, Long> {

                @Query("SELECT p FROM Participante p WHERE p.sorteio.finalizado = false")
                List<Participante> findSorteiosAtivos();
}
