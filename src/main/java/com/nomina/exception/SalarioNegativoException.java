package com.nomina.exception;

public class SalarioNegativoException
        extends RuntimeException {

    public SalarioNegativoException(String mensaje) {
        super(mensaje);
    }
}