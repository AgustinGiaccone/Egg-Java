
package javaguia3.extraguia3;

import java.util.Scanner;

public class G3_EXTRA11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        int contador = 0;
        while (numero > 0) {
            numero /= 10;
            contador++;
        }
        System.out.println("Se introdujeron " + contador + " digitos");
    }
}