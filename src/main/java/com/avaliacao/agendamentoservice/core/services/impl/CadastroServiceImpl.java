package com.avaliacao.agendamentoservice.core.services.impl;

import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoRequestDTO;
import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoResponseDTO;
import com.avaliacao.agendamentoservice.app.repository.AgendamentoRepository;
import com.avaliacao.agendamentoservice.core.entity.factory.AgendamentoFactory;
import com.avaliacao.agendamentoservice.core.services.CadastroService;
import com.avaliacao.agendamentoservice.core.services.CalculadoraTaxa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroServiceImpl implements CadastroService {

    @Autowired
    private AgendamentoFactory agendamentoFactory;
    @Autowired
    private AgendamentoRepository repository;

    @Autowired
    private CalculadoraTaxa calculadoraTaxa;
    @Override
    public AgendamentoResponseDTO cadastroAgendamento(AgendamentoRequestDTO requestDTO) {
        var agendamentoEntity = agendamentoFactory.agendamentoEntityFactory(requestDTO);
        calculadoraTaxa.calcularTaxa(agendamentoEntity, requestDTO.getTipoTaxa());
        repository.save(agendamentoEntity);
        return agendamentoFactory.agendamentoResponseDtoFactory(agendamentoEntity);
    }
}
