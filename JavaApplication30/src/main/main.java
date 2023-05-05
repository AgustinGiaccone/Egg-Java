
package main;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;
import servicio.PersonaServicio;

public class main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Date fechaActual = new Date();
        PersonaServicio sc = new PersonaServicio();
        Persona per1 = new Persona();
        per1 = sc.crearPersona();
        System.out.println("-------------------------");
        System.out.println(per1.toString());
        sc.calcularEdad(per1, fechaActual);
        sc.menorQue(per1);
        sc.mostrarPersona(per1);
       
    }
    
}
