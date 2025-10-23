package com.sorteasy.sorteasy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sorteasy.sorteasy.dto.SorteioDTO;
import com.sorteasy.sorteasy.entity.Sorteio;
import com.sorteasy.sorteasy.repository.SorteioRepository;

@Service
public class SorteioService {

    @Autowired
    private SorteioRepository sorteioRepository;

    public SorteioDTO save(SorteioDTO sorteioDTO) {
        Sorteio sorteio = toEntity(sorteioDTO);
        sorteio = sorteioRepository.save(sorteio);
        return toDto(sorteio);
    }

    public List<SorteioDTO> findAll() {
        List<Sorteio> sorteios = sorteioRepository.findAll();
        List<SorteioDTO> sorteioDTOs = new ArrayList<>();
        for (Sorteio sorteio : sorteios) {
            sorteioDTOs.add(toDto(sorteio));
        }
        return sorteioDTOs;

    }

    public void deleteById(Long id) {
        sorteioRepository.deleteById(id);
    }

    public SorteioDTO realizarSorteio(Long id) {
        Sorteio sorteio = sorteioRepository.findById(id).orElseThrow();
        SorteioDTO sorteioDTO = toDto(sorteio);
        return sorteioDTO;
    }

    private Sorteio toEntity(SorteioDTO dto) {
        Sorteio sorteio = new Sorteio();
        BeanUtils.copyProperties(dto, sorteio);
        return sorteio;
    }
    private SorteioDTO toDto(Sorteio sorteio) {
        SorteioDTO dto = new SorteioDTO();
        BeanUtils.copyProperties(sorteio, dto);
        return dto;
    }

    public List<SorteioDTO> findSorteiosAtivos() {
        List<SorteioDTO> sorteioDTOs = new ArrayList<>();
        List<Sorteio> sorteios = new ArrayList<>();
        for (Sorteio sorteio : sorteios) {
            sorteioDTOs.add(toDto(sorteio));
        }
        return sorteioDTOs;

    }
}
