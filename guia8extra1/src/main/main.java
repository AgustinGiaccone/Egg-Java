
package main;

import servicio.RaicesServicio;

public class main {

    public static void main(String[] args) {
        RaicesServicio raices = new RaicesServicio();
        
        raices.pedirValores();
        raices.calcular();
    }
    
}
