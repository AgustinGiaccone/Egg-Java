
package javaguia5.extra;
//Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
//de tamaño N, con los valores ingresados por el usuario.

import java.util.Scanner;


public class extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] vector = new int[10];
        int suma=0;
        for (int i = 0; i < 10; i++) {
            System.out.print("ingrese los numeros:");
            vector[i] = leer.nextInt();
            suma= suma+vector[i];
            
          
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("["+vector[i]+"]" +" ");
            
        }
        
        System.out.print("la suma total es: "+ suma);
        System.out.println(" ");
    }
    
}
