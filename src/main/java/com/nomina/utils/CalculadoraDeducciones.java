package com.nomina.utils;
public class CalculadoraDeducciones {

    private static final double SEGURIDAD_SOCIAL = 0.04;
    private static final double ARL = 0.01;

    public static double calcularSaludYPension(
            double salarioBruto) {

        return salarioBruto * SEGURIDAD_SOCIAL;
    }

    public static double calcularARL(
            double salarioBruto) {

        return salarioBruto * ARL;
    }

}
