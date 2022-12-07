package com.avaliacao.agendamentoservice.core.strategy.impl;

import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import com.avaliacao.agendamentoservice.core.strategy.TaxaStrategy;

import java.time.LocalDate;

public class TaxaBStrategyImpl implements TaxaStrategy {
    @Override
    public void verificaTaxa(AgendamentoEntity entity) {
        if(!entity.getDataTransferencia().isBefore(LocalDate.now().plusDays(10))){
            throw new RuntimeException();
        }
        entity.setAcrescimo(12);
    }
}
