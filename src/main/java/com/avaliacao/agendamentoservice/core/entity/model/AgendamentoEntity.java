package com.avaliacao.agendamentoservice.core.entity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoEntity {
    @Id
    @GeneratedValue
    private String id;
    private Integer contaOrigem;
    private Integer contaDestino;
    private float valorTransferencia;
    private float taxaTransferencia;
    private int acrescimo;
    private float valorTotalTransferencia;
    private LocalDate dataTransferencia;
    private LocalDate dataCadastro;
}
