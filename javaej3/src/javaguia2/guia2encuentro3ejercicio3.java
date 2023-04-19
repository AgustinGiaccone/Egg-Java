package javaguia2;

import java.util.Scanner;

public class guia2encuentro3ejercicio3 {
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados : ");
        double grado= leer.nextDouble();
        
        Double grado2= 32+(9*grado/5);
        System.out.println("los grados ingreados corresponden en grados farenheit a : "+ grado2);
    }
    
}
