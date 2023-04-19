/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50%
de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% 
de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos
sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio,
y luego un valor real que represente el costo del tratamiento 
(previo al descuento) y determine el importe en efectivo a pagar
por dicho socio.

 */
package javaguia3.extraguia3;

import java.util.Scanner;

public class G3_EXTRA5 {

    public static void main(String[] args) {
      Scanner leer =new Scanner(System.in);
      System.out.println("ingrese ue nivel de socio tiene(A,B,C): ");
      String clase = leer.next();
      System.out.println("ingrese el costo de su tratamiento: ");
      int costo = leer.nextInt();
      
     clase = clase.toUpperCase();
      
        switch (clase) {
            case "A":System.out.println("su costo se reducira a la mitad: $"+costo/2);
                break;
             case "B":System.out.println("su costo se reducira un 35%: $"+(35*costo/100));
                break;
            case "C":System.out.println("este tipo de socio no reciben descuentos.");
                break;
            default:
                System.out.println("tipo de soci no valido");
        }
    }
    
}
