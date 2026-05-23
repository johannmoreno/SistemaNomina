package com.nomina;

import com.nomina.model.*;
import com.nomina.service.NominaService;

public class Main {

    public static void main(String[] args) {

        NominaService service =
                new NominaService();

        Empleado empleado1 =
                new EmpleadoAsalariado(
                        "Carlos",
                        5000000,
                        6);

        Empleado empleado2 =
                new EmpleadoPorHoras(
                        "Ana",
                        50000,
                        45,
                        true,
                        2);

        Empleado empleado3 =
                new EmpleadoComision(
                        "Luis",
                        3000000,
                        25000000,
                        0.10);

        Empleado empleado4 =
                new EmpleadoTemporal(
                        "Marta",
                        2500000);

        service.mostrarInformacion(empleado1);

        service.mostrarInformacion(empleado2);

        service.mostrarInformacion(empleado3);

        service.mostrarInformacion(empleado4);
    }
}