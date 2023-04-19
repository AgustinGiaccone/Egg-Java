
package javaguia4.ejercicios;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un monto a convertir");
        double monto = leer.nextDouble();
        System.out.println("MENU\n"
                + "1. Peso\n"
                + "2. Dolar\n"
                + "3. Yen\n"
                + "4. Libra");
        String opcion = leer.next();
        convertir(monto, opcion);

    }

    public static void convertir(double monto, String opcion) {
        double d;
        switch (opcion) {
            case "1":
                d = monto * 209;
                System.out.println(" equivale a " + d + " pesos ");
                break;
            case "2":
                d = monto * 1.28;
                System.out.println("equivale a " + d + " dolar ");
                break;
            case "3":
                d = monto * 144.87;
                System.out.println("equivale a " + d + " yanes ");
                break;
            case "4":
                d = monto * 0.86;
                System.out.println("equivale a" + d + "libras");
                break;

        }
    }
}
