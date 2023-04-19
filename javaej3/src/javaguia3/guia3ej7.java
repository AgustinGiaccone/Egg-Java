package javaguia3;

import java.util.Scanner;


public class guia3ej7 {

    
    public static void main(String[] args) {
        System.out.println("Considera que estás desarrollando una "
+ "web para una empresa que fabrica motores (suponemos que se trata "
+ "del tipo de motor de una bomba para mover fluidos). Definir una "
+ "variable tipoMotor y permitir que el usuario ingrese un valor entre"
+ " 1 y 4. El programa debe mostrar lo siguiente:\n" +
"o	Si el tipo de motor es 1, mostrar un mensaje indicando "
+ "“La bomba es una bomba de agua”.\n" +
"o	Si el tipo de motor es 2, mostrar un mensaje indicando "
+ "“La bomba es una bomba de gasolina”.\n" +
"o	Si el tipo de motor es 3, mostrar un mensaje indicando "
+ "“La bomba es una bomba de hormigón”.\n" +
"o	Si el tipo de motor es 4, mostrar un mensaje indicando "
+ "“La bomba es una bomba de pasta alimenticia”.\n" +
"o	Si no se cumple ninguno de los valores anteriores mostrar"
+ " el mensaje “No existe un valor válido para tipo de bomba”");
       Scanner motor = new Scanner(System.in);
       int tipoMotor;
       
       System.out.println("Que nivel de motor tiene: ");
       System.out.println(1+") bomb de agua");
       System.out.println(2+") bomba de gasolina ");
       System.out.println(3+") bomba de hormigon");
       System.out.println(4+") bomba de pasta alimenicia");
       
       tipoMotor = motor.nextInt();
       
       switch (tipoMotor) {
        	case 1:
           System.out.println("La bomba es una bomba de agua");
           break;

        	case 2:
           System.out.println("La bomba es una bomba de gsolina");
            break;
            
            case 3:
           System.out.println("La bomba es una bomba de hormigon");
            break;
            
            case 4:
           System.out.println("La bomba es una bomba de pasta alimenticia");
            break;

        	default:
           System.out.println("No existe un valor válido para tipo de bomba");
    	}

    }
    
}
