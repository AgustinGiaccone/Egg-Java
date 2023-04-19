/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia2;

import java.util.Scanner;

public class guia2encuentro3ejercicio5 {
    public static void main(String[] args) {
       Scanner dato=new Scanner(System.in);
       System.out.println("ingrese un numero entero: ");
       int n1= dato.nextInt();
       int cuadrado = n1*2;
       System.out.println("el doble de su numero es: "+cuadrado);
       int triple = n1*3;
       System.out.println("el trtiple del numero es:"+triple);
       Double raiz= Math.sqrt(n1);
       System.out.println("la raiz del numero es:" + raiz);
    }
    
}
