package com.avaliacao.agendamentoservice.app.adapter.configuration.exception.handler;

import com.avaliacao.agendamentoservice.app.adapter.configuration.exception.model.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalHandlerException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handlerBadRequest(Exception ex, WebRequest request){
        ErrorDetails erros = new ErrorDetails("Erro durante o Processamento!" ,ex.getMessage(), request.getDescription(false));
        return new ResponseEntity(erros, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
