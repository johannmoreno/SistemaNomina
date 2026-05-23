package com.nomina.model;

public class EmpleadoAsalariado
        extends Empleado {

    private int aniosEmpresa;

    public EmpleadoAsalariado(
            String nombre,
            double salarioBase,
            int aniosEmpresa) {

        super(nombre, salarioBase);
        this.aniosEmpresa = aniosEmpresa;
    }

    @Override
    public double calcularSalarioBruto() {

        double bono = 0;

        if (aniosEmpresa > 5) {
            bono = salarioBase * 0.10;
        }

        return salarioBase + bono + 1000000;
    }
}