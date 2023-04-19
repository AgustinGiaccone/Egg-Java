
package javaguia3.extraguia3;

import java.util.Scanner;


public class G3_EXTRA1 {

    
    public static void main(String[] args) {
        System.out.println("Dado un tiempo en minutos,"
+ " calcular su equivalente en días y horas. Por ejemplo,"
+ " si el usuario ingresa 1600 minutos, el sistema debe "
+ "calcular su equivalente: 1 día, 2 horas.");
        Scanner leer = new Scanner(System.in);
        
        int minutos = leer.nextInt();
        
        double hora = minutos/60;
        double dias = hora/24;
        
        System.out.println("los minutos que usted desea calcular corresponde a: "+hora+" horas y a: "+dias);
    }
    
}
