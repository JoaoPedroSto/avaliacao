package com.avaliacao.agendamentoservice.core.entity.model;

import jakarta.persistence.*;
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
@Table(name = "agendamento")
public class AgendamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column
    private Integer contaOrigem;
    @Column
    private Integer contaDestino;
    @Column
    private float valorTransferencia;
    @Column
    private float taxaTransferencia;
    @Column
    private int acrescimo;
    @Column
    private float valorTotalTransferencia;
    @Column
    private LocalDate dataTransferencia;
    @Column
    private LocalDate dataCadastro;
}
