
package javaguia3.extraguia3;

import java.util.Scanner;

public class G3_EXTRA9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num1, num2;
        do {
            System.out.println("Ingresá dos números mayor a uno");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        } while (num1 < 1 || num2 < 1);
        int cociente = 0;
        while (num1 > num2) {
            num1 -= num2;
            cociente++;
        }
        System.out.println("Dado que " + num1 + " es menor que " + num2 + " entonces el residuo es " + num1 + " y el cociente es " + cociente);
    }
}
