package com.nomina.model;

public class EmpleadoTemporal
        extends Empleado {

    public EmpleadoTemporal(
            String nombre,
            double salarioBase) {

        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioBase;
    }
}