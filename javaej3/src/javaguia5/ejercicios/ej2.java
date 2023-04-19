
package javaguia5.ejercicios;

//import java.util.Random;
import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la dimencion de su vector:");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        for (int i =0; i < vector.length; i++){

            
            vector[i]= (int)(Math.random()*20);
        }
        
        for (int i = 0; i <vector.length;i++){
            System.out.print(vector[i]+" - ");
        }
        System.out.println("");
        System.out.println("que numero desea buscar");
        
        int valor = leer.nextInt();
        
        for (int i =0;i<vector.length;i++){
            if (valor == vector[i]){
                System.out.println("el valor: "+ valor+ " se encuentra en la posicion/es: "+i);
            }
        }
    }
    
}
