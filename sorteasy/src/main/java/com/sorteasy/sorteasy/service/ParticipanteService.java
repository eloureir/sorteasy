package com.sorteasy.sorteasy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sorteasy.sorteasy.dto.ParticipanteDTO;
import com.sorteasy.sorteasy.entity.Participante;
import com.sorteasy.sorteasy.repository.ParticipanteRepository;


@Service
public class ParticipanteService {

    @Autowired
    ParticipanteRepository repository;

    public ParticipanteDTO save(ParticipanteDTO participanteDTO) {
        Participante participante = toEntity(participanteDTO);
        participante = repository.save(participante);
        return toDto(participante); 
    }

    public List<ParticipanteDTO> findBySorteioId(Long id) {
        List<Participante> participantes = repository.findAll();
        List<ParticipanteDTO> participanteDTOs = new ArrayList<>();
        for (Participante participante : participantes) {
            participanteDTOs.add(toDto(participante));
        }
        return participanteDTOs;
}
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    private Participante toEntity(ParticipanteDTO dto) {
        Participante participante = new Participante();
        participante.setId(dto.getId());
        participante.setNome(dto.getNome());
        participante.setEmail(dto.getEmail());
        participante.setSorteio(dto.getSorteio());
        return participante;
    }
    private ParticipanteDTO toDto(Participante participante) {
        ParticipanteDTO dto = new ParticipanteDTO();
        dto.setId(participante.getId());
        dto.setNome(participante.getNome());
        dto.setEmail(participante.getEmail());
        dto.setSorteio(participante.getSorteio());
        return dto;
    }

}