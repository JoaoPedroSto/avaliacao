package com.avaliacao.agendamentoservice.core.services;

import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ListagemService {
    List<AgendamentoResponseDTO> listarAgendamento();
}
