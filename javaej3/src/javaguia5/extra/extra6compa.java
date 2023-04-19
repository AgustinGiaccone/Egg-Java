
package javaguia5.extra;

import java.util.Random;
import java.util.Scanner;

public class extra6compa {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        // Leer 5 palabras del usuario
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Ingrese la palabra #%d: ", i + 1);
            palabras[i] = sc.next();
            // Validar que la palabra tenga entre 3 y 5 caracteres
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres");
                System.out.printf("Ingrese la palabra #%d: ", i + 1);
                palabras[i] = sc.next();
            }
        }

        // Crear la sopa de letras
        int[][] sopa = new int[20][20];
        int fila = rnd.nextInt(20); // seleccionar una fila aleatoria para poner las palabras
        int col = 0; // comenzar en la primera columna
        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length(); i++) {
                sopa[fila][col + i] = palabra.charAt(i);
            }
            col += palabra.length() + 1; // avanzar a la siguiente columna
        }

        // Rellenar los espacios no utilizados con números aleatorios del 0 al 9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == 0) { // si la celda está vacía
                    sopa[i][j] = (int) (rnd.nextInt(10) + '0'); // asignar un número aleatorio
                }
            }
        }

        // Imprimir la sopa de letras
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print((char)sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
