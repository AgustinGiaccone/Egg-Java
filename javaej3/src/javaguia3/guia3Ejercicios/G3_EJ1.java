package javaguia3.guia3Ejercicios;

import java.util.Scanner;

public class G3_EJ1 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Crear un programa que dado un número "
+ "determine si es par o impar.");
        
        int num;
        System.out.println("");
        System.out.println("ingrese un numero para identificarlo si es par o inpar");
        
        num = leer.nextInt();
        
        if(num%2 == 0){
            System.out.println("el numero es par");
        }else
            System.out.println("el numero es impar");
    }
    
}
