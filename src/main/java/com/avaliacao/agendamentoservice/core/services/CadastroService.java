package com.avaliacao.agendamentoservice.core.services;

import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoRequestDTO;
import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoResponseDTO;
import org.springframework.stereotype.Service;
@Service
public interface CadastroService {

    AgendamentoResponseDTO cadastroAgendamento(AgendamentoRequestDTO requestDTO);

}
