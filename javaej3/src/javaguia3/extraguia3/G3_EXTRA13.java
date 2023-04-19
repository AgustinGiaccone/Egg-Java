
package javaguia3.extraguia3;

import java.util.Scanner;

public class G3_EXTRA13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la altura de la escalera");
        int altura = leer.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1));
            }
            System.out.println();
        }
    }
}
