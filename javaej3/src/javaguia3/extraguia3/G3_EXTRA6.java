/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia3.extraguia3;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class G3_EXTRA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double altura, alturaSub160 = 0, alturaGeneral = 0;
    int cantPersonas, contadorSub160 = 0;

    Scanner leer = new Scanner(System.in);

    System.out.print("¿Cuántas personas evaluarás? ");
    cantPersonas = leer.nextInt();

    for (int i = 0; i < cantPersonas; i++) {
      System.out.println("Altura de la persona N°" + i + " en metros:");
      altura = leer.nextDouble();

      if (altura < 1.60) {
        alturaSub160 += altura;
        contadorSub160++;
      }

      alturaGeneral += altura;
    }

    System.out.println("Personas con altura menor a 1.60: (" + contadorSub160 + "/" + cantPersonas + ")");
    System.out.println("Promedio de altura de personas menores a 1.60: " + (alturaSub160 / contadorSub160) + "m.");
    System.out.println("Promedio general de personas: " + (alturaGeneral / cantPersonas) + "m.");

    leer.close();
  }
}