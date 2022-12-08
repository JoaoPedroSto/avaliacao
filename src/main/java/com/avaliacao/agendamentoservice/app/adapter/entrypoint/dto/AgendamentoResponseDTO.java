package com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoResponseDTO {
    private Integer contaOrigem;
    private Integer contaDestino;
    private float valorTransferencia;
    private float taxaTransferencia;
    private int acrescimo;
    private float valorTotalTransferencia;
    private LocalDate dataTransferencia;
    private LocalDate dataCadastro;
}
