package com.avaliacao.agendamentoservice.core.strategy.impl;

import com.avaliacao.agendamentoservice.app.adapter.configuration.exception.BusinessException;
import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import com.avaliacao.agendamentoservice.core.strategy.TaxaStrategy;

import java.time.LocalDate;

public class TaxaAStrategyImpl implements TaxaStrategy {
    @Override
    public void verificaTaxa(AgendamentoEntity entity) {
        if (!entity.getDataTransferencia().isEqual(LocalDate.now())){
            throw new BusinessException("Data de transfêrencia deve ser a data de hoje.");
        }
        entity.setTaxaTransferencia(3);
        entity.setAcrescimo(3);
    }
}
