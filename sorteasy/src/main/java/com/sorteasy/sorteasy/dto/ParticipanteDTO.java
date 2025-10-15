package com.sorteasy.sorteasy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sorteasy.sorteasy.entity.Sorteio;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParticipanteDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @NotBlank(message = "O nome do participante deve ser preenchido")
    @Size(max = 100, message = "O nome do participante deve ter no máximo 100 caracteres")
    private String nome;

    @NotBlank(message = "O email do participante deve ser preenchido")
    @Size(message = "Email invalido")
    private String email;

    @NotNull(message = "O ID do sorteio deve ser preenchido")
    private Sorteio sorteio;






    
}
