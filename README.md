# Sistema de Nómina - Programación Orientada a Objetos

## Descripción del Proyecto

Este proyecto consiste en el desarrollo de un sistema de nómina para una empresa, implementado bajo el paradigma de Programación Orientada a Objetos (POO).  

El sistema permite gestionar diferentes tipos de empleados, calcular salarios, beneficios y deducciones de acuerdo con las reglas de negocio establecidas.

El proyecto fue desarrollado aplicando:

- Principios SOLID
- Código limpio (Clean Code)
- Buenas prácticas de programación
- Refactorización
- Comentarios en el código
- Pruebas unitarias
- Control de versiones con Git y GitHub

---

# Integrantes del CIPA

- Jonathan Tobon
- [Nombre Integrante 2]
- [Nombre Integrante 3]
- [Nombre Integrante 4]

---

# Tecnologías Utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Git
- GitHub
- IntelliJ IDEA
- JUnit (Pruebas Unitarias)

---

# Metodología de Desarrollo

Para el desarrollo del proyecto se utilizó una metodología incremental, realizando el sistema por módulos y funcionalidades.

Las etapas implementadas fueron:

1. Análisis de requerimientos
2. Diseño de clases y jerarquías
3. Implementación de lógica de negocio
4. Aplicación de principios SOLID
5. Refactorización del código
6. Desarrollo de pruebas unitarias
7. Control de versiones con Git y GitHub
8. Documentación del proyecto

---

# Tipos de Empleados Implementados

## Empleado Asalariado

- Salario fijo mensual.
- Bono mensual del 10% si tiene más de 5 años en la empresa.

## Empleado por Horas

- Pago por horas trabajadas.
- Horas extras superiores a 40 horas se pagan al 150%.
- No recibe bonos.

## Empleado por Comisión

- Salario base + comisión sobre ventas.
- Bono adicional del 3% si las ventas superan $20.000.000.

## Empleado Temporal

- Salario fijo mensual.
- Contrato por tiempo definido.
- No recibe bonos ni beneficios adicionales.

---

# Deducciones Aplicadas

- Seguro Social: 4%
- Pensión: 4%
- ARL

---

# Beneficios Adicionales

## Empleados Permanentes

(Aplican para empleados asalariados y por comisión)

- Bono de alimentación de $1.000.000 mensuales.

## Empleados por Horas

- Acceso a fondo de ahorro.
- Se deposita el 2% del salario mensual.
- Aplica únicamente si el empleado acepta el beneficio y tiene más de 1 año en la empresa.

---

# Validaciones del Sistema

El sistema valida que:

- El salario neto nunca sea negativo.
- Las horas trabajadas no sean negativas.
- Las ventas no sean menores a $0.

---

# Principios SOLID Aplicados

## S - Single Responsibility Principle
Cada clase tiene una única responsabilidad.

## O - Open/Closed Principle
El sistema está preparado para agregar nuevos tipos de empleados sin modificar código existente.

## L - Liskov Substitution Principle
Las clases hijas pueden sustituir correctamente a la clase padre.

## I - Interface Segregation Principle
Las interfaces fueron separadas según responsabilidades específicas.

## D - Dependency Inversion Principle
Las clases dependen de abstracciones y no de implementaciones concretas.

---

# Estructura General del Proyecto

```text
src/
│
├── empleados/
├── beneficios/
├── deducciones/
├── interfaces/
├── pruebas/
└── principal/
