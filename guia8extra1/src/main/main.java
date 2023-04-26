
package main;

import servicio.RaicesServicio;

public class main {

    public static void main(String[] args) {
        RaicesServicio raices = new RaicesServicio();
        
        raices.pedirValores();
        raices.calcular();
         System.out.println("==============================");
        long numeroLargo = 123456789012345L;
        int numeroEntero = (int) numeroLargo;
        System.out.println(numeroEntero);
    }
    
}
