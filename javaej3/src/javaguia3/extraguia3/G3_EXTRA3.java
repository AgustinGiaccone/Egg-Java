/*Elaborar un algoritmo en el cuál se ingrese una letra y se 
detecte si se trata de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.
*/
package javaguia3.extraguia3;

import java.util.Scanner;

public class G3_EXTRA3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un letra.");
        String letra = leer.next();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") 
        || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
        || letra.equalsIgnoreCase("u")){
            System.out.println("la letra ingresada es una vocal.");
        }else{
            System.out.println("la letra ingresada es una consonante o un numero");
        }
        
    }
    
}
