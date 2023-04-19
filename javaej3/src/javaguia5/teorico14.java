
package javaguia5;

import java.util.Scanner;

public class teorico14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de compañeros de equipo: ");
        int cantidadDeCompaneros = scanner.nextInt();
        
        // Creamos el vector "Equipo" con la dimensión ingresada por el usuario
        String[] Equipo = new String[cantidadDeCompaneros];
        
        // Pedimos al usuario que ingrese los nombres de sus compañeros de equipo
        for(int i = 0; i < cantidadDeCompaneros; i++) {
            System.out.print("Ingrese el nombre del compañero " + (i+1) + ": ");
            Equipo[i] = scanner.next();
        }
        
        // Imprimimos los nombres de los compañeros de equipo
        System.out.println("Los nombres de tus compañeros de equipo son: ");
        for(int i = 0; i < cantidadDeCompaneros; i++) {
            System.out.println("#"+(i+1)+": "+(Equipo[i]));
        }
    }
}
