package javaguia3;

import java.util.Scanner;

public class guia3ej8 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Escriba un programa que valide si una nota está "
+ "entre 0 y 10, sino está entre 0 y 10 la nota se pedirá"
+ " de nuevo hasta que la nota sea correcta.");
        
        System.out.println("Ingrese la nota: ");
        int  nota;
        
        nota = leer.nextInt();
        
        while (nota <=0 | nota>= 10){
            System.out.println("nota ingresada incorrecta,ingresela nuevamente:");
            nota = leer.nextInt();
        }

    }
    
}
