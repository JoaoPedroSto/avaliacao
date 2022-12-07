package com.avaliacao.agendamentoservice.core.strategy.impl;

import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import com.avaliacao.agendamentoservice.core.strategy.TaxaStrategy;

public class TaxaDStrategyImpl implements TaxaStrategy {
    @Override
    public void verificaTaxa(AgendamentoEntity entity) {
        var valor = entity.getValorTransferencia();
        if(valor <=1000){
            new TaxaAStrategyImpl().verificaTaxa(entity);
        } else if (valor >1000 && valor<2000) {
            new TaxaBStrategyImpl().verificaTaxa(entity);
        }else
            new TaxaCStrategyImpl().verificaTaxa(entity);
    }
}
