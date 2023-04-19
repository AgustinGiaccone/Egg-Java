
package javaguia3.guia3Ejercicios;

import java.util.Scanner;


public class G3_EJ6 {

   
    public static void main(String[] args) {
        System.out.println("Realizar un programa que pida dos números enteros"
+ " positivos por teclado y muestre por pantalla el siguiente menú:El usuario "
+ "deberá elegir una opción y el programa deberá mostrar el resultado por pantalla"
+ " y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5."
+ " Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir"
+ " del programa directamente, se debe mostrar el siguiente mensaje de confirmación:"
+ " ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona"
+ " el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.");
        System.out.println("");
        Scanner leer = new Scanner (System.in);
        
        int num1,num2;
        String opcion;
        do{
            System.out.println("ingrese numeros positivos");
            num1 =leer.nextInt();
            num2=leer.nextInt();
            
            
            System.out.println("MENU");
            System.out.println("1=sumar");
            System.out.println("2=restar");
            System.out.println("3=mutiplicar");
            System.out.println("4=dividir");
            System.out.println("5=salir");
            System.out.print("elija la opcion: ");
            opcion =leer.next();
            
            switch (opcion) {
                case "1":System.out.println("la suma es: "+ (num1+num2));
                    break;
                case "2":System.out.println("la resta es: "+(num1-num2));
                    break;
                case "3":System.out.println("la multiplicacion es: "+(num1*num2));
                    break;
                case "4":System.out.println("la divicion es: "+(num1/num2));
                    break;
                case "5":System.out.println("seguro que desea salir: ");
                    opcion=leer.next();
            }
        } while (!"S". equalsIgnoreCase(opcion));
    }
    
}
