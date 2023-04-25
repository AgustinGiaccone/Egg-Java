
package main;
import entidad.Persona;
import servicio.PersonaServicio;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
         PersonaServicio ps = new PersonaServicio();
         int mayores = 0;
         int menores=0;
         int sobrepeso=0;
         int ideal=0;
         int delgado =0;
         
         
         Persona p1 = ps.crearPersona();
         System.out.println("es mayor de edad?? "+ ps.esMayorEdad(p1));
         
         if (ps.esMayorEdad(p1)==true) {
            mayores ++;
        }else{
             menores ++;
         }
         
         ps.calcularIMC(p1);
         if(ps.calcularIMC(p1) ==-1){
        delgado ++;
    }else if (ps.calcularIMC(p1)==0){
        ideal++;
    }else if(ps.calcularIMC(p1)==1){
        sobrepeso++;
    }
         
         
         
         
         Persona p2 = ps.crearPersona();
         System.out.println("es mayor de edad?? "+ ps.esMayorEdad(p2));
         
         if (ps.esMayorEdad(p1)==true) {
            mayores ++;
        }else{
             menores ++;
         }
         
         ps.calcularIMC(p2);
         if(ps.calcularIMC(p2) ==-1){
        delgado ++;
    }else if (ps.calcularIMC(p2)==0){
        ideal++;
    }else if(ps.calcularIMC(p2)==1){
        sobrepeso++;
    }
         
         
         
         
         Persona p3 = ps.crearPersona();
         System.out.println("es mayor de edad?? "+ ps.esMayorEdad(p3));
         
         if (ps.esMayorEdad(p1)==true) {
            mayores ++;
        }else{
             menores ++;
         }
         
         ps.calcularIMC(p3);
         if(ps.calcularIMC(p3) ==-1){
        delgado ++;
    }else if (ps.calcularIMC(p3)==0){
        ideal++;
    }else if(ps.calcularIMC(p3)==1){
        sobrepeso++;
    }
         
         
         
         
         Persona p4 = ps.crearPersona();
         System.out.println("es mayor de edad?? "+ ps.esMayorEdad(p4));
         
         if (ps.esMayorEdad(p1)==true) {
            mayores ++;
        }else{
             menores ++;
         }
         
         ps.calcularIMC(p4);
         if(ps.calcularIMC(p4) ==-1){
        delgado ++;
    }else if (ps.calcularIMC(p4)==0){
        ideal++;
    }else if(ps.calcularIMC(p4)==1){
        sobrepeso++;
    }
         
         
        System.out.println("el porcentaje de personas con sobre peso es "+ sobrepeso/4*100) ; 
        System.out.println("el porcentaje de personas en su peso ideal es  "+ ideal/4*100) ;
        System.out.println("el porcentaje de personas delgadas es  "+ delgado/4*100) ;
        
        System.out.println("el porcentajes de menores es " + menores/4*100);
        System.out.println("el porcentajes de mayores es " + mayores/4*100); 
    }
    
}
