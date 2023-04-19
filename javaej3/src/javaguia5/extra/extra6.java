
package javaguia5.extra;
/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para 
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en 
orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no 
utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
*/
import java.util.Random;
import java.util.Scanner;

public class extra6 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char[][] matriz = new char[20][20];
        Random random = new Random();
        String palabra;

        for (int f = 0; f < 5; f++) {
            int aleatorio = random.nextInt(20);
            do {
                System.out.println("Escriba una palabra: ");
                palabra = leer.nextLine();
            } while (palabra.length() > 5 || palabra.length() < 3);
            for (int c = 0; c < palabra.length(); c++) {
                matriz[aleatorio][c] = palabra.charAt(c);
            }
        }

        for (int f = 0; f < 20; f++) {
            for (int c = 0; c < 20; c++) {
                if (matriz[f][c] == '\u0000') {
                    matriz[f][c] = (char) ('0' + random.nextInt(10));
                }
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}
