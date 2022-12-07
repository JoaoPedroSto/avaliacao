package com.avaliacao.agendamentoservice.core.services.impl;

import com.avaliacao.agendamentoservice.app.adapter.configuration.exception.BusinessException;
import com.avaliacao.agendamentoservice.app.adapter.entrypoint.enuns.TipoTaxa;
import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import com.avaliacao.agendamentoservice.core.services.CalculadoraTaxa;
import com.avaliacao.agendamentoservice.core.strategy.impl.TaxaAStrategyImpl;
import com.avaliacao.agendamentoservice.core.strategy.impl.TaxaBStrategyImpl;
import com.avaliacao.agendamentoservice.core.strategy.impl.TaxaCStrategyImpl;
import com.avaliacao.agendamentoservice.core.strategy.impl.TaxaDStrategyImpl;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraTaxaImpl implements CalculadoraTaxa {
    @Override
    public void calcularTaxa(AgendamentoEntity entity, TipoTaxa taxa) {
        switch (taxa){
            case TAXA_A:
                new TaxaAStrategyImpl().verificaTaxa(entity);
                break;
            case TAXA_B:
                new TaxaBStrategyImpl().verificaTaxa(entity);
                break;
            case TAXA_C:
                new TaxaCStrategyImpl().verificaTaxa(entity);
                break;
            case TAXA_D:
                new TaxaDStrategyImpl().verificaTaxa(entity);
                break;
            default:
                throw new BusinessException("Tipo de Taxa Inválido.");
        }
        calculaValorTotal(entity);
    }

    private void calculaValorTotal(AgendamentoEntity entity){
        var valor = entity.getValorTransferencia();
        var taxa = entity.getTaxaTransferencia();
        var acrescimo = entity.getAcrescimo();

        var total = valor+(valor*taxa/100);
        entity.setValorTotalTransferencia(total+acrescimo);

    }

}
