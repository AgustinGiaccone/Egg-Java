

package javaguia3;

import java.util.Scanner;


public class guia3ej9 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    	System.out.println("Escriba un programa que lea 20 números. "
+ "Si el número leído es igual a cero se debe salir del bucle y mostrar"
+ " el mensaje \"Se capturó el numero cero\".  El programa deberá calcular"
+ " y mostrar el resultado de la suma de los números leídos,"
+ " pero si el número es negativo no debe sumarse."
+ " Nota: recordar el uso de la sentencia break.");
    	
        int contador=0;
        int num;
        int sumador=0;
        
        do {
            System.out.println("ingreseun numero:");
            num = leer.nextInt();
            contador =contador+1;
            
            if (num < 0){
                continue;
                
            }sumador += num;
            if (num ==0){
                System.out.println("se cpturo el 0");
                break;
            }
        } while(contador < 20);
       System.out.println(sumador);

    }
    
}