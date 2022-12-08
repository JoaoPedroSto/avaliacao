package com.avaliacao.agendamentoservice.core.entity.factory.impl;

import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoRequestDTO;
import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoResponseDTO;
import com.avaliacao.agendamentoservice.app.adapter.entrypoint.mapper.AgendamentoMapper;
import com.avaliacao.agendamentoservice.core.entity.factory.AgendamentoFactory;
import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AgendamentoFactoryImpl implements AgendamentoFactory {

    @Autowired
    private AgendamentoMapper mapper;

    @Override
    public AgendamentoEntity agendamentoEntityFactory(AgendamentoRequestDTO requestDto) {
        var entity = mapper.requestDtoToEntity(requestDto);
        entity.setDataCadastro(LocalDate.now());
        return entity;
    }

    @Override
    public AgendamentoResponseDTO agendamentoResponseDtoFactory(AgendamentoEntity entity) {
        return mapper.entityToResponseDto(entity);
    }
}
