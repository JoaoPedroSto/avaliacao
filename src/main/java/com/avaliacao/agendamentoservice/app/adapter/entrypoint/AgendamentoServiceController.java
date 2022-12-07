package com.avaliacao.agendamentoservice.app.adapter.entrypoint;

import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoRequestDTO;
import com.avaliacao.agendamentoservice.core.services.CadastroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("avaliacao/v1")
@AllArgsConstructor
public class AgendamentoServiceController {


    @Autowired
    private CadastroService cadastroService;

    @PostMapping(value = "/agendamento")
    public ResponseEntity cadastrarAgendamento(@RequestBody AgendamentoRequestDTO agendamentoRequest){
        return ResponseEntity.ok(cadastroService.cadastroAgendamento(agendamentoRequest));
    }


}
