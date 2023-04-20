
package main;

import servicio.CuentaBancariaServicio;

public class main {

    public static void main(String[] args) {
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        servicio.crearCuenta();
        servicio.consultarDatos();
        
        System.out.println("Saldo actual: " + servicio.consultarSaldo());
        servicio.ingresar(500);
        System.out.println("Saldo actual luego de depositar 500: " + servicio.consultarSaldo());
        servicio.retirar(300);
        System.out.println("Saldo actual luego de retirar 300: " + servicio.consultarSaldo());
        servicio.extraccionRapida();
        System.out.println("Saldo actual luego de realizar extracción rápida: " + servicio.consultarSaldo());
    
    }
    
}
