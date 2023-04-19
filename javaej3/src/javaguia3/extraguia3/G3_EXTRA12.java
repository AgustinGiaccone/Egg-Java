
package javaguia3.extraguia3;

import java.util.Scanner;

public class G3_EXTRA12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String digito1 = (i == 3) ? "E" : Integer.toString(i);
                    String digito2 = (j == 3) ? "E" : Integer.toString(j);
                    String digito3 = (k == 3) ? "E" : Integer.toString(k);
                    System.out.println(digito1 + "-" + digito2 + "-" + digito3);
                }
            }
        }
    }
}