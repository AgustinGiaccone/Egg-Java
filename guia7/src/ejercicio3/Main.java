/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
//import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        operacion op1 = new operacion();
        
        op1.crearOperacion();
        System.out.println("La suma es : "+ op1.sumar());
        System.out.println("La resta es : "+ op1.restar());
        System.out.println("La multiplicacion es: "+ op1.multiplicar());
        System.out.println("La division es: " +op1.dividir());
        
        System.out.println("===================");
        
/////////////////////////////
        
    operacion op2 = new operacion();
        
        op2.crearOperacion();
        System.out.println("La suma es : "+ op2.sumar());
        System.out.println("La resta es : "+ op2.restar());
        System.out.println("La multiplicacion es: "+ op2.multiplicar());
        System.out.println("La division es: " +op2.dividir());
        
        op2.despedir();
    }
 
}

