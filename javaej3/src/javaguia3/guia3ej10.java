package javaguia3;

import java.util.Scanner;

public class guia3ej10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Realizar un programa que lea 4 números "
+ "(comprendidos entre 1 y 20) e imprima el número ingresado seguido"
+ " de tantos asteriscos como indique su valor. Por ejemplo:" +
"5 *****" +
"3 ***" +
"11 ***********" +
"2 **");
       int cantidad = 10;
        String numCadena = "";
        for (int j = 0; j < cantidad; j++) {
            System.out.println("Ingrese un número");
            numCadena += leer.next();
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.print(Integer.valueOf(numCadena.substring(i, i + 1)));
            for (int j = 0; j < Integer.valueOf(numCadena.substring(i, i + 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
