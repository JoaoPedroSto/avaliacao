package com.avaliacao.agendamentoservice.app.adapter.configuration.exception.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
@Data
public class ErrorDetails {
    private String error;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String messageException;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String details;

    public ErrorDetails(String error, String message, String details) {
        super();
        this.error = error;
        this.messageException = message;
        this.details = details;
    }

}
