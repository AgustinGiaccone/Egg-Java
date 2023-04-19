/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author agust
 */
public class persona {
    String nombre;
    long DNI;
    int edad;
    
    
    public persona(){
        
    }

    public persona(String nombreParametro, long DNIParametro, int edadParametro) {
        this.nombre = nombreParametro;
        this.DNI = DNIParametro;
        this.edad = edadParametro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
