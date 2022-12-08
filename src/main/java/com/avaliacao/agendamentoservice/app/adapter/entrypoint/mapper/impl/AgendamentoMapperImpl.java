package com.avaliacao.agendamentoservice.app.adapter.entrypoint.mapper.impl;

import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoRequestDTO;
import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoResponseDTO;
import com.avaliacao.agendamentoservice.app.adapter.entrypoint.mapper.AgendamentoMapper;
import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AgendamentoMapperImpl implements AgendamentoMapper {

    private static final ModelMapper mapper = new ModelMapper();
    @Override
    public AgendamentoEntity requestDtoToEntity(AgendamentoRequestDTO agendamentoRequestDTO) {
        return mapper.map(agendamentoRequestDTO, AgendamentoEntity.class);
    }

    @Override
    public AgendamentoResponseDTO entityToResponseDto(AgendamentoEntity entity) {
        return mapper.map(entity, AgendamentoResponseDTO.class);
    }
}
