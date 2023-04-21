
package main;

import servicio.CafeteraServicio;

public class Main {

    public static void main(String[] args) {
        CafeteraServicio cafe = new CafeteraServicio();
        
        cafe.capacidaMaxima();
        cafe.llenarCafetera();
        cafe.servirTaza();
        //cafe.vaciarCafetera();
      cafe.agregarCafe();
    }
    
}
