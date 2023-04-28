
package main;

import entidad.Cadena;
import java.util.Scanner;
import servicio.CadenaServicio;

public class main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena frase1 = new Cadena();
        CadenaServicio servicio = new CadenaServicio();
        
        
        frase1 = servicio.insertarFrase();
        
        servicio.mostraVocales(frase1);
        servicio.InvertirFrase(frase1);
        servicio.vecesRepetido(frase1);
        servicio.copararLonguitud(frase1);
        servicio.unirFrase(frase1);
        servicio.remplazarLetra(frase1);
        servicio.contiene(frase1);
        
        
        
    }
    
}
