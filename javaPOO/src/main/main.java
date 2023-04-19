package main;

import entidad.persona;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        persona persona1= new persona("agustin",43190284,21);//de esta forma se llama a la clasee, en este caso a la clase persona
        //de esta forma se utiliza la funcion get
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getDNI());
        System.out.println(persona1.getEdad());
        System.out.println("----------------------");
        persona persona2= new persona();//de esta forma se utiliza la forma set
        System.out.println("ingresa el nombre de la persona");
        String  nombre=leer.next();
        persona2.setNombre(nombre);
        System.out.println("ingrese el DNI");
        int dni = leer.nextInt();
        persona2.setDNI(dni); 
        System.out.println("ingrese la edad");
        int edad = leer.nextInt();
        persona2.setEdad(edad);
        
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getDNI());
        System.out.println(persona2.getEdad());
    }
    
}
