
package javaguia2;

import java.util.Scanner;

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos
El programa deberá después mostrar el resultado de la suma*/
public class guia2encuentro3ejercicio1 {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in); 
      System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        //Definir num Como Entero;
        //Leer num;
        //inicialización.
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        
        System.out.println("La suma de los números es: " + suma);
    }
    
}
