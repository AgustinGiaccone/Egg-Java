
package javaguia3.guia3Ejercicios;

import java.util.Scanner;

public class G3_EJ3 {

    public static void main(String[] args) {
        System.out.println("Realizar un programa que solo permita"
+ " introducir solo frases o palabras de 8 de largo."
+ " Si el usuario ingresa una frase o palabra de 8 de largo"
+ " se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,"
+ " en caso contrario, se deberá imprimir “INCORRECTO”."
+ " Nota: investigar la función Lenght() en Java.");
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("ingrese una palabra de 8 letras:");
        frase = leer.next();
        int longitud = frase.length();
        
        if (longitud == 8){
            System.out.println("CORRECTO");
        }else
            System.out.println("INCORRECTO");
    }
    
}
