
package main;

import servicio.ParDeNumerosServicio;

public class main {

    public static void main(String[] args) {
        ParDeNumerosServicio spdn = new ParDeNumerosServicio();
        
        
        
        spdn.MostrarValores();
        System.out.println(""+spdn.DevolverMayor());
        System.out.println("la potencia del numero mayor potenciado al numero menor es: "+ spdn.calcularPotencia());
        System.out.println("]==============[");
        System.out.println("spdn.calculaRaiz();");
        System.out.println(spdn.calculaRaiz());
        
        
        
    }
    
}
