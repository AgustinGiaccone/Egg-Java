
package javaguia4.ejercicios;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número para validar si es primo!");
        int num = leer.nextInt();
        System.out.println(esPrimo(num));
    }

    public static boolean esPrimo(int num) {
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
            if (contador > 2) {
                break;
            }
        }
        return contador <= 2;
    }
}
