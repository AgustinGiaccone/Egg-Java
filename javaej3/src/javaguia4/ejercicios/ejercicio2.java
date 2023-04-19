
package javaguia4.ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    
static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        
       int edad;
    String nombre, opcion;
    
    do {
      System.out.print("Dime tu nombre: ");
      nombre = leer.next();

      System.out.print("Dime tu edad: ");
      edad = leer.nextInt();

      
      
      if (esMayorDeEdad(edad)) {
        System.out.println(nombre + " es mayor de edad.");
      } 
      
      else {
        System.out.println(nombre + " es menor de edad.");
      }

      
      
      System.out.print("¿Desea continuar? (SI/no) ");
      opcion = leer.next();
    } 
    
    
    while (!opcion.equalsIgnoreCase("no"));

    leer.close();
  }

  public static boolean esMayorDeEdad(int edad) {
    return edad >= 18;
  }
}