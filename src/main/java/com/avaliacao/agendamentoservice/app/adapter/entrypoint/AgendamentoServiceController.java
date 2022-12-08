package com.avaliacao.agendamentoservice.app.adapter.entrypoint;

import com.avaliacao.agendamentoservice.app.adapter.entrypoint.dto.AgendamentoRequestDTO;
import com.avaliacao.agendamentoservice.core.services.CadastroService;
import com.avaliacao.agendamentoservice.core.services.ListagemService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("avaliacao/v1")
@AllArgsConstructor
public class AgendamentoServiceController {


    @Autowired
    private CadastroService cadastroService;
    @Autowired
    private ListagemService listagemService;

    @PostMapping(value = "/agendamento")
    public ResponseEntity cadastrarAgendamento(@RequestBody AgendamentoRequestDTO agendamentoRequest){
        return ResponseEntity.ok(cadastroService.cadastroAgendamento(agendamentoRequest));
    }

    @GetMapping(value = "/agendamento")
    public ResponseEntity listarAgendamento(){
        return ResponseEntity.ok(listagemService.listarAgendamento());
    }

}
