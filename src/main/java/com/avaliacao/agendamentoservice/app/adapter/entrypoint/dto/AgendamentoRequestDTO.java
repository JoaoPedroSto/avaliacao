package com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto;


import com.avaliacao.agendamentoservice.app.adapter.entrypoint.enuns.TipoTaxa;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AgendamentoRequestDTO {
    private Integer contaOrigem;
    private Integer contaDestino;
    private float valorTransferencia;
    private TipoTaxa tipoTaxa;
    private LocalDate dataTransferencia;
}
