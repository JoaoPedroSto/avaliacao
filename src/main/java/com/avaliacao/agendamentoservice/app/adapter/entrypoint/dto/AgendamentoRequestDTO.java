package com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto;


import com.avaliacao.agendamentoservice.app.adapter.entrypoint.enuns.TipoTaxa;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@Builder
public class AgendamentoRequestDTO {
    @NotEmpty
    private Integer contaOrigem;
    @NotEmpty
    private Integer contaDestino;
    @NotEmpty
    private float valorTransferencia;
    @NotEmpty
    private TipoTaxa tipoTaxa;
    @FutureOrPresent(message = "A data de transferência deve estar no presente ou futuro.")
    private LocalDate dataTransferencia;
}
