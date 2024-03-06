package com.example.projetoapi.erros;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ManipuladorDeExcecoes {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(RecursoNaoEncontrado.class)
    public RespostasGenericaDeErro manipuladorRecursoNaoEncontrado(RecursoNaoEncontrado ex, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        List<MensagemErro> erros = new ArrayList<>();
        MensagemErro erro = MensagemErro.builder()
                .mensagem(ex.getMessage())
                .build();
        erros.add(erro);
        return RespostasGenericaDeErro.builder()
                .status(status.value())
                .erros(erros)
                .url(request.getRequestURI())
                .build();

    }
}
