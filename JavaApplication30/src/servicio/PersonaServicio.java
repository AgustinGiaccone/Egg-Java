package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;





public class PersonaServicio {
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");       
        Persona perX= new Persona();
        Date fechaActual = new Date();
    
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre: ");
        perX.setNombre(leer.nextLine());
        System.out.println("dia de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("mes de nacimineto: ");
        int mes = leer.nextInt();
        System.out.println("año de nacimineto: ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio, mes-1, dia);
        perX.setfechaDeNacimiento(fecha);
        return perX;    
    }
     
    public int calcularEdad(Persona perX, Date fechaActual){
            int edad = fechaActual.getYear()-perX.getfechaDeNacimiento().getYear()+1900;
            System.out.println("tiene "+edad+" años");
            return edad;
    }
    
   public boolean menorQue(Persona perX) {
        System.out.println("ingrese otra edad:");
        int edadAux = leer.nextInt();    
        return edadAux < calcularEdad(perX, fechaActual);
    }
   
   public void mostrarPersona(Persona perX){
       System.out.println("fecha de nacimiento "+ perX.getfechaDeNacimiento().getDate()+ "/" + (perX.getfechaDeNacimiento().getMonth()+1)+"/"+perX.getfechaDeNacimiento().getYear());
       System.out.println("Nombre:" +perX.getNombre());
   }
                    
         
}
