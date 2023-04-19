
package javaguia5.extra;

import java.util.Scanner;

public class extra7 {

    public static void main(String[] args) {
       int vector[] = new int[8];

        int num = 34;

        fibo(num, vector);

    }

    public static void fibo(int num, int vector[]) {
        int a = 0;
        int b = 1;
        int c = 0;
        int i = 0;
        while (c < num) {

            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + a);
            vector[i] = a;
            i++;
        }
        System.out.println(" ");
        System.out.println("--------------");
        for (i = 0; i < 8; i++) {
            System.out.print("[" + vector[i] + "]");
            
        }
       System.out.println(" "); 
    }
}