
package javaguia3.extraguia3;

import java.util.Scanner;

public class G3_EXTRA10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int random = (int) (Math.random() * 10 * Math.random() * 10);
        int num;
        boolean adivino = false;
        do {
            System.out.println("Ingresá un número para adivinar");
            num = leer.nextInt();
            if (num == random) {
                adivino = true;
            } else {
                int diferencia = Math.abs(num - random);
                if (diferencia <= 2) {
                    System.out.println("Caliente!");
                } else if (diferencia <= 5) {
                    System.out.println("Tibio");
                } else {
                    System.out.println("Frío :c");
                }
            }
        } while (!adivino);
    }
}
