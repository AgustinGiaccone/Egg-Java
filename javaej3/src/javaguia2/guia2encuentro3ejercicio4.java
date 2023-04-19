
package javaguia2;

import java.util.Scanner;

public class guia2encuentro3ejercicio4 {

    
    public static void main(String[] args) {
    
        
        float gradosCentigrados;
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese una temperatura en C° y lo convertiremos a F°");
    
    gradosCentigrados = leer.nextFloat();
    
    System.out.println(gradosCentigrados + "°C es igual a " + (convertirFahrenheit(gradosCentigrados)) + "°F");
    }

    private static float convertirFahrenheit(float gradosCentigrados) {
       float Fahrenheit = 32 + (9 * gradosCentigrados / 5);
        return Fahrenheit ;
    }
    
}
