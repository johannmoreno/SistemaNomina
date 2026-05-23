package com.nomina.exception;

public class HorasInvalidasException extends RuntimeException {

    public HorasInvalidasException(String mensaje) {
        super(mensaje);
    }
}