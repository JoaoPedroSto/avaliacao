package com.avaliacao.agendamentoservice.core.strategy.impl;

import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import com.avaliacao.agendamentoservice.core.strategy.TaxaStrategy;

import java.time.LocalDate;

public class TaxaCStrategyImpl implements TaxaStrategy {
    @Override
    public void verificaTaxa(AgendamentoEntity entity) {
        if(!entity.getDataTransferencia().isBefore(LocalDate.now().plusDays(10))){
            throw new RuntimeException();
        }
        if(verificaData(entity.getDataTransferencia(), 10, 20)){
            entity.setTaxaTransferencia((8.2f));
        } else if (verificaData(entity.getDataTransferencia(), 20, 30)) {
            entity.setTaxaTransferencia(6.9f);
        } else if (verificaData(entity.getDataTransferencia(), 30, 40)) {
            entity.setTaxaTransferencia(4.7f);
        }else
            entity.setTaxaTransferencia(1.7f);
    }

    private boolean verificaData(LocalDate data, int diasInicio, int diasFim){
        return data.isAfter(LocalDate.now().plusDays(diasInicio)) && data.isBefore(LocalDate.now().plusDays(diasFim));
    }
}
