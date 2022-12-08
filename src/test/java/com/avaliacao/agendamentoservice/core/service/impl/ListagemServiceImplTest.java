package com.avaliacao.agendamentoservice.core.service.impl;

import com.avaliacao.agendamentoservice.app.repository.AgendamentoRepository;
import com.avaliacao.agendamentoservice.core.entity.factory.AgendamentoFactory;
import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import com.avaliacao.agendamentoservice.core.services.impl.ListagemServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ListagemServiceImplTest {

    @InjectMocks
    private ListagemServiceImpl service;

    @Mock
    private AgendamentoRepository repository;

    @Mock
    private AgendamentoFactory factory;

    @Test
    private void listar_agendamentos_test(){
        List<AgendamentoEntity> lista = new ArrayList<AgendamentoEntity>();
        lista.add(AgendamentoEntity.builder().build());
        when(repository.findAll()).thenReturn(lista);
        service.listarAgendamento();
    }

}
