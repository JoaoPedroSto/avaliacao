package com.avaliacao.agendamentoservice.app.adapter.entrypoint.mapper;

import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoRequestDTO;
import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoResponseDTO;
import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import org.springframework.stereotype.Component;

@Component
public interface AgendamentoMapper {

    AgendamentoEntity requestDtoToEntity(AgendamentoRequestDTO agendamentoRequestDTO);

    AgendamentoResponseDTO entityToResponseDto(AgendamentoEntity entity);

}
