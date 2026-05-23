package com.nomina.service;

import com.nomina.model.Empleado;

public class NominaService {

    public void mostrarInformacion(
            Empleado empleado) {

        System.out.println("Empleado: "
                + empleado.getNombre());

        System.out.println("Salario Neto: "
                + empleado.calcularSalarioNeto());

        System.out.println("-------------------");
    }
}