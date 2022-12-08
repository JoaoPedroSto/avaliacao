package com.avaliacao.agendamentoservice.app.adapter.configuration.exception;

import lombok.Data;

@Data
public class BusinessException extends RuntimeException{

    private String label;

    private String details;

    public BusinessException(String message, Throwable cause){
        super(message, cause);
    }

    public BusinessException(String message){
        super(message);
        this.label = "Erro na validação de negócios!";
    }

}
