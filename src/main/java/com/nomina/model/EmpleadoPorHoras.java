package com.nomina.model;

import com.nomina.exception.HorasInvalidasException;

public class EmpleadoPorHoras
        extends Empleado {

    private int horasTrabajadas;
    private double tarifaHora;
    private boolean fondoAhorro;
    private int aniosEmpresa;

    public EmpleadoPorHoras(
            String nombre,
            double tarifaHora,
            int horasTrabajadas,
            boolean fondoAhorro,
            int aniosEmpresa) {

        super(nombre, 0);

        if (horasTrabajadas < 0) {
            throw new HorasInvalidasException(
                    "Las horas no pueden ser negativas");
        }

        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
        this.fondoAhorro = fondoAhorro;
        this.aniosEmpresa = aniosEmpresa;
    }

    @Override
    public double calcularSalarioBruto() {

        double salario;

        if (horasTrabajadas <= 40) {

            salario =
                    horasTrabajadas * tarifaHora;

        } else {

            int extras =
                    horasTrabajadas - 40;

            salario =
                    (40 * tarifaHora)
                            + (extras * tarifaHora * 1.5);
        }

        if (fondoAhorro && aniosEmpresa > 1) {
            salario += salario * 0.02;
        }

        return salario;
    }
}