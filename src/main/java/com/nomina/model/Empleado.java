package com.nomina.model;

import com.nomina.interfaces.Calculable;
import com.nomina.utils.CalculadoraDeducciones;
import com.nomina.exception.SalarioNegativoException;

public abstract class Empleado
        implements Calculable {

    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre,
                    double salarioBase) {

        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    @Override
    public abstract double calcularSalarioBruto();

    @Override
    public double calcularSalarioNeto() {

        double bruto = calcularSalarioBruto();

        double deducciones =
                CalculadoraDeducciones
                        .calcularSaludYPension(bruto);

        double arl =
                CalculadoraDeducciones
                        .calcularARL(bruto);

        double neto = bruto - deducciones - arl;

        if (neto < 0) {
            throw new SalarioNegativoException(
                    "El salario neto no puede ser negativo");
        }

        return neto;
    }

    public String getNombre() {
        return nombre;
    }
}