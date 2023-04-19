
package javaguia4.ejercicios;

import java.util.Scanner;

public class coma2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String respuesta;
          boolean n;
        
         // respuesta = false;
      // String nombre = "";
       //int edad = 0 ;
       int cantidad ;
       
       do {
            
       
         
    System.out.print("Ingrese un su nombre ");
          String   nombre = input.next();
          
    //input.nextLine();
   
    //input.close();
    System.out.print("Ingrese tu edad ");
     int edad  = input.nextInt();
     
       if (edad >= 18){
           
            System.out.println( nombre + " sos mayor de edad y tenes " + edad);
       } else {
           System.out.println(nombre + "sos menor y tenes " + edad );
           
         }
        System.out.println("Deseas ingresar mas personas? S/N");
       respuesta = input.next();
                        //if (respuesta.equalsIgnoreCase("S")){
                          //   n = true;
               } while (!respuesta.equalsIgnoreCase("n") );               
       }
           
    }
