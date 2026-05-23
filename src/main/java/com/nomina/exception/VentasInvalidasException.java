package com.nomina.exception;

public class VentasInvalidasException
        extends RuntimeException {

    public VentasInvalidasException(String mensaje) {
        super(mensaje);
    }
}