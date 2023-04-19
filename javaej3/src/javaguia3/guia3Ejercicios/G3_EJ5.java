
package javaguia3.guia3Ejercicios;

import java.util.Scanner;

public class G3_EJ5 {
    
    public static void main(String[] args) {
        System.out.println("escribir un program en el cual se ingrese"
+ " un valor limite positivo, y a continuacion solicite numeros al usuario"
+ " hasta que la suma de los numeros introducidos supere el limite inicial.");
        Scanner leer = new Scanner(System.in);
        int limite, suma=0, contador=0, numero;
         System.out.println("");
        System.out.println("ingese el limite:");
        
        limite = leer.nextInt();
        
        System.out.println("ingrese numeros hasta que l suma de esos numeros supere el limite ingresado");
        
        while (suma <= limite){
            contador ++;
            System.out.print("numero:"+contador+"=");
            numero = leer.nextInt();
            suma+= numero;
        }System.out.println(suma+" es superior al limite");
    }
    
}
