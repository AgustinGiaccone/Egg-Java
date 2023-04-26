
package main;
import entidad.Persona;
import servicio.PersonaServicio;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
         PersonaServicio ps = new PersonaServicio();
          double mayores=0;
        double menores=0;
        double sobrepeso=0;
        double ideal=0;
        double delgado=0;
        
        System.out.println("");
        System.out.println("PERSONA 1");
        
        Persona p1 = ps.crearPersona();
        System.out.println("¿Mayor de edad?: "+ ps.esMayorEdad(p1));
        
        if(ps.esMayorEdad(p1) == true){
            mayores++;
        }else{
            menores++;
        }
        
        ps.mostratIMC(p1);
                
        if(ps.calcularIMC(p1) == -1){
            delgado++;
        }else if(ps.calcularIMC(p1) == 0){
            ideal++;
        }else if(ps.calcularIMC(p1) == 1){
            sobrepeso++;
        }
        
        
    ////////////////////////////////////////////////////
        System.out.println("");
        System.out.println("PERSONA 2");
        
        Persona p2 = ps.crearPersona();
        System.out.println("¿Mayor de edad?: "+ ps.esMayorEdad(p2));
        
        if(ps.esMayorEdad(p2) == true){
            mayores++;
        }else{
            menores++;
        }
        
        ps.mostratIMC(p2);
        
        if(ps.calcularIMC(p2) == -1){
            delgado++;
        }else if(ps.calcularIMC(p2) == 0){
            ideal++;
        }else if(ps.calcularIMC(p2) == 1){
            sobrepeso++;
        }
        
        
    ////////////////////////////////////////////////////
        System.out.println("");
        System.out.println("PERSONA 3");
        
        Persona p3 = ps.crearPersona();
       System.out.println("¿Mayor de edad?: "+ ps.esMayorEdad(p3));
       
       if(ps.esMayorEdad(p3) == true){
            mayores++;
        }else{
            menores++;
        }
       //mostratIMC
       //mostrarIMC
       ps.mostratIMC(p3);
        if(ps.calcularIMC(p3) == -1){
            delgado++;
        }else if(ps.calcularIMC(p3) == 0){
            ideal++;
        }else if(ps.calcularIMC(p3) == 1){
            sobrepeso++;
        }
       
    ////////////////////////////////////////////////////
        System.out.println("");
        System.out.println("PERSONA 4");
        
        Persona p4 = ps.crearPersona();
        System.out.println("¿Mayor de edad?: "+ ps.esMayorEdad(p4));
        
        if(ps.esMayorEdad(p4) == true){
            mayores++;
        }else{
            menores++;
        }
        
        ps.mostratIMC(p4);
        if(ps.calcularIMC(p4) == -1){
            delgado++;
        }else if(ps.calcularIMC(p4) == 0){
            ideal++;
        }else if(ps.calcularIMC(p4) == 1){
            sobrepeso++;
        }
        
        
     /////////////////////////////////////////////////////////
        System.out.println("==========================================");
        System.out.println("El porcentaje de personas con sobrepeso es: " + (sobrepeso/4)*100 + "%");
        System.out.println("El porcentaje de personas en su peso ideal es: " + (ideal/4)*100 + "%");
        System.out.println("El porcentaje de personas debajo de su peso ideal es: " + (delgado/4)*100 + "%");
        
        System.out.println("==========================================");
        
        System.out.println("El porcentaje de menores de edad es: " +  (menores/4)*100 + "%");
        System.out.println("El porcentaje de mayores de edad es: " +  (mayores/4)*100 + "%");
        System.out.println("==========================================");
        
    } 
}
