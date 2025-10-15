package com.sorteasy.sorteasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sorteasy.sorteasy.entity.Sorteio;

public interface SorteioRepository extends 
        JpaRepository<Sorteio, Long> {
}
