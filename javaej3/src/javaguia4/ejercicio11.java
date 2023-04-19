
package javaguia4;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String palabra;
        
        do {
            System.out.println("Ingrese una oracion que termine en punto.");
            palabra = leer.nextLine();
        } while (!palabra.endsWith("."));
        cambiarLetras(palabra);
    }
    
    public static void cambiarLetras(String palabra) {
        String aux = "";
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.substring(i, i + 1)) {
                case "a":
                    aux = aux.concat("@");
                    break;
                case "e":
                    aux = aux.concat("#");
                    break;
                case "i":
                    aux = aux.concat("$");
                    break;
                case "o":
                    aux = aux.concat("%");
                    break;
                case "u":
                    aux = aux.concat("*");
                    break;
                default:
                    aux = aux.concat(palabra.substring(i, i + 1));
            }
        }
        System.out.println("la palabra queda de la siguente forma" + aux);
    }
}
    

