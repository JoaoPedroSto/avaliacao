package com.avaliacao.agendamentoservice.core.entity.factory;

import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoRequestDTO;
import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoResponseDTO;
import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import org.springframework.stereotype.Component;

@Component
public interface AgendamentoFactory {

    AgendamentoEntity agendamentoEntityFactory(AgendamentoRequestDTO requestDto);

    AgendamentoResponseDTO agendamentoResponseDtoFactory(AgendamentoEntity entity);

}
