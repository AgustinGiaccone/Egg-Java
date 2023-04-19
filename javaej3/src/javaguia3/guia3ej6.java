package javaguia3;

import java.util.Scanner;


public class guia3ej6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        int num1, num2;
        System.out.println(""+ 
"Implementar un programa que le pida dos números \n" +
"enteros al usuario y determine si ambos o alguno de ellos\n" +
"es mayor a 25.");
        System.out.println(" ");
        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();
        
        System.out.println("Ingrese el segun numero: ");
        num2 = input.nextInt();
        
        if (num1>= 25 && num2>= 25){
            System.out.println("Los 2 numeros son mayores que 25");
        } else if (num1>=25 && num2<25){
            System.out.println("El primer numero es mayor que 25");
        }else if (num1<25 && num2>=25){
            System.out.println("El segundo numero es mayor que 25");
        }else{
            System.out.println("Ninguno es mayor que 25 ");
        }
    }
    
}
