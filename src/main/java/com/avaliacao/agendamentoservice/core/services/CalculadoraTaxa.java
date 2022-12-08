package com.avaliacao.agendamentoservice.core.services;

import com.avaliacao.agendamentoservice.app.adapter.entrypoint.enuns.TipoTaxa;
import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import org.springframework.stereotype.Service;

@Service
public interface CalculadoraTaxa {

    void calcularTaxa(AgendamentoEntity entity, TipoTaxa taxa);
}
