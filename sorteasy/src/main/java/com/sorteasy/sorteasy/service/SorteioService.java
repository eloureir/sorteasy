package com.sorteasy.sorteasy.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sorteasy.sorteasy.dto.SorteioDTO;
import com.sorteasy.sorteasy.entity.Sorteio;
import com.sorteasy.sorteasy.repository.SorteioRepository;

@Service
public class SorteioService {

    @Autowired

    SorteioRepository repository;

    public SorteioDTO toDto(Sorteio sorteio) {
        SorteioDTO dto = new SorteioDTO();
        BeanUtils.copyProperties(sorteio, dto);
        return dto;
    }

    public SorteioDTO toEntity(SorteioDTO dto) {
        Sorteio sorteio = new Sorteio();
        BeanUtils.copyProperties(dto, sorteio);
        return dto;
    }

}
