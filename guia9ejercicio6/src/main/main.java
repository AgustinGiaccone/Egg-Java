
package main;

import entidad.Curso;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Curso escuela1 = new Curso();
        escuela1.crearCurso();
        escuela1.calcularGananciaSemnal();
    }
    
}
