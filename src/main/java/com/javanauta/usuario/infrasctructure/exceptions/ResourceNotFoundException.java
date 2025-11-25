package com.javanauta.usuario.infrasctructure.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String mensagem){
        super (mensagem);
    }

    public ResourceNotFoundException(String mensage, Throwable throwable){
        super(mensage, throwable);
    }
}
