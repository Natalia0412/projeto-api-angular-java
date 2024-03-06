package com.example.projetoapi.erros;

public class RecursoNaoEncontrado extends RuntimeException{
    public RecursoNaoEncontrado(String msg){
        super(msg);
    }
}
