/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.Scanner;


public class operacion {
    private int num1;
    private int num2;
    
    //// (a) MÃ©todo constructor con todos los atributos pasados por parÃ¡metro.

    public operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    /// (b) MÃ©todo constructor sin los atributos pasados por parÃ¡metro.
    public operacion() {
    }
    
    //// (c) MÃ©todos get y set.

    ///getters
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    
    ///setters
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
    /// (d) MÃ©todo para crearOperacion(): que le pide al usuario los dos nÃºmeros y los guarda en los atributos del objeto.
    
    public void crearOperacion(){
       Scanner sc = new Scanner(System.in); 
        System.out.println("Ingresa el numero 1");
       this.num1 = sc.nextInt();
        System.out.println("Ingresa el numero 2");
       this.num2 = sc.nextInt();
    }
    
    ///(e) MÃ©todo sumar(): calcular la sumade los nÃºmeros y devolver el resultado al main
    public int sumar(){
        int suma;
        suma = this.num1 + this.num2;
        return suma;
    }
    
    
    ///(f) MÃ©todo restar(): calcular la resta de los nÃºmeros y devolver el resultado al main
     public int restar(){
        int resta;
        resta = this.num1 - this.num2;
        return resta;
    }
    
   
       public int multiplicar(){
        int multiplicacion;
        
        if (this.num1 == 0 || this.num2 == 0 ){
            System.out.println("ERROR: numero 0");
            multiplicacion = 0;
            return multiplicacion;
        }else{
           multiplicacion = this.num1 * this.num2;
        return multiplicacion; 
        }
        }
       
    
       
      public int dividir(){
        int division;
        
        if (this.num2 == 0 ){
            System.out.println("ERROR: numero 0");
            division = 0;
            return division;
        }else{
           division = this.num1 / this.num2;
        return division; 
        }    
       } 
      
      
      
      
        public void despedir(){
            System.out.println("Â¡Hasta Luego!");
        }
    }

