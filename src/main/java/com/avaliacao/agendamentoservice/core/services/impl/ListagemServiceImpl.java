package com.avaliacao.agendamentoservice.core.services.impl;

import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoResponseDTO;
import com.avaliacao.agendamentoservice.app.repository.AgendamentoRepository;
import com.avaliacao.agendamentoservice.core.entity.factory.AgendamentoFactory;
import com.avaliacao.agendamentoservice.core.services.ListagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ListagemServiceImpl implements ListagemService {
    @Autowired
    private AgendamentoRepository repository;
    @Autowired
    private AgendamentoFactory agendamentoFactory;
    @Override
    public List<AgendamentoResponseDTO> listarAgendamento() {
        List listaDto = new ArrayList<AgendamentoResponseDTO>();
        var lista = repository.findAll();
        lista.forEach(agendamento -> listaDto.add(agendamentoFactory.agendamentoResponseDtoFactory(agendamento)));
        return listaDto;
    }
}
