package com.avaliacao.agendamentoservice.core.service.impl;

import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoRequestDTO;
import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoResponseDTO;
import com.avaliacao.agendamentoservice.app.adapter.entrypoint.enuns.TipoTaxa;
import com.avaliacao.agendamentoservice.app.repository.AgendamentoRepository;
import com.avaliacao.agendamentoservice.core.entity.factory.AgendamentoFactory;
import com.avaliacao.agendamentoservice.core.entity.model.AgendamentoEntity;
import com.avaliacao.agendamentoservice.core.services.CalculadoraTaxa;
import com.avaliacao.agendamentoservice.core.services.impl.CadastroServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@SpringBootTest
class CadastroServiceImplTest {
    @InjectMocks
    private CadastroServiceImpl service;
    @Mock
    private AgendamentoFactory agendamentoFactory;
    @Mock
    private AgendamentoRepository repoitory;
    @Mock
    private CalculadoraTaxa calculadoraTaxa;
    private static AgendamentoRequestDTO agendamentoDto;
    private static AgendamentoEntity agendamentoEntity;

    @BeforeAll
    private static void setup(){
        agendamentoDto = AgendamentoRequestDTO
                .builder()
                .contaOrigem(123456789)
                .contaDestino(987654321)
                .dataTransferencia(LocalDate.now().plusDays(5))
                .tipoTaxa(TipoTaxa.TAXA_B)
                .valorTransferencia(1001)
                .build();
        agendamentoEntity = AgendamentoEntity
                .builder()
                .id(UUID.randomUUID().toString())
                .contaOrigem(123456789)
                .contaDestino(987654321)
                .dataTransferencia(LocalDate.now().plusDays(5))
                .taxaTransferencia(0)
                .acrescimo(12)
                .valorTransferencia(1001)
                .valorTotalTransferencia(1013)
                .build();
    }

    @Test
    private void cadastro_agendamento_sucesso(){
        when(agendamentoFactory.agendamentoEntityFactory(agendamentoDto)).thenReturn(agendamentoEntity);
        doNothing().when(calculadoraTaxa).calcularTaxa(agendamentoEntity, TipoTaxa.TAXA_B);
        doNothing().when(repoitory).save(agendamentoEntity);
        when(agendamentoFactory.agendamentoResponseDtoFactory(agendamentoEntity)).thenReturn(any(AgendamentoResponseDTO.class));
        service.cadastroAgendamento(agendamentoDto);
    }
}
