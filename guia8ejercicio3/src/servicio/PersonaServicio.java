
package servicio;
import entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public PersonaServicio(){
        
    }
    
    public Persona crearPersona(){
        Persona  p1 = new Persona();
        String sex;
        
        System.out.println("ingrese el nombre");
        p1.setNombre(leer.next());
        
        System.out.println("ingrese la edad");
        p1.setEdad(leer.nextInt());
        
        System.out.println("altura");
        p1.setAltura(leer.nextDouble());
        
        System.out.println("peso");
        p1.setPeso(leer.nextInt());
        
        do {
             
           System.out.println("ingrese el sexo(M,H,O)");
            sex = leer.next();
        } while (!sex.equalsIgnoreCase("m") && !sex.equalsIgnoreCase("h") && !sex.equalsIgnoreCase("o"));
        
        p1.setSexo(sex);
        
        return new Persona();
    }
    
    public boolean esMayorEdad(Persona persona){
        boolean mayor;
        if (persona.getEdad()>= 18) {
            mayor=true;
        }else{
            mayor=false;
        }
        return mayor;
    }
    
    public int calcularIMC(Persona persona){
        double IMC = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        
        if (IMC < 20) {
            
            return -1;
        } else if (IMC >= 20 && IMC <= 25){
            
            return 0;
        } else {
            
            return 1;
        }
    }
    
    public void mostratIMC (Persona persona){
        double IMC = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        if (IMC < 20) {
            System.out.println("esta por debajo de su peso ideal");
            
        } else if (IMC >= 20 && IMC <= 25){
            System.out.println("esta en su peso ideal");
            
        } else {
            System.out.println("tiene sobrepeso");
            
        }
    }
}   
