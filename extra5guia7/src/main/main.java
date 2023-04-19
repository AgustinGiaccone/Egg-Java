
package main;

import entidad.Empleado;

public class main {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.cargarEmpleado();
        System.out.println(empleado1.calcular_aumento());
    }
}