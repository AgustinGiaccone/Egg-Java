
package javaguia3.guia3Ejercicios;

import java.util.Scanner;

public class G3_EJ2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Crear un programa que pida una frase"
+ " y si esa frase es igual a “eureka” el programa "
+ "pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto."
+ " Nota: investigar la función equals() en Java.");
        System.out.println("");
        String palabra;
        System.out.println("ingrese la contraseña:");
        palabra = leer.next();
        
        if ("eureka".equals(palabra)){
            System.out.println("correcto");
        }else
            System.out.println("incorrecto");
    }
}
