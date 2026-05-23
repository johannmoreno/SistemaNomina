package com.nomina.model;

import com.nomina.exception.VentasInvalidasException;

public class EmpleadoComision
        extends Empleado {

    private double ventas;
    private double porcentajeComision;

    public EmpleadoComision(
            String nombre,
            double salarioBase,
            double ventas,
            double porcentajeComision) {

        super(nombre, salarioBase);

        if (ventas < 0) {
            throw new VentasInvalidasException(
                    "Las ventas no pueden ser menores a 0");
        }

        this.ventas = ventas;
        this.porcentajeComision =
                porcentajeComision;
    }

    @Override
    public double calcularSalarioBruto() {

        double comision =
                ventas * porcentajeComision;

        double bono = 0;

        if (ventas > 20000000) {
            bono = ventas * 0.03;
        }

        return salarioBase
                + comision
                + bono
                + 1000000;
    }
}