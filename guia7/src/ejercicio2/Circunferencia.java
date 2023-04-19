
package ejercicio2;

import java.util.Scanner;

public class Circunferencia {
    
    
    //como atributo privado el radio de tipo real.
    private double radio;

    
    public Circunferencia() {  //CONSTRUCTOR
    }

    
    //Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    
    
    //Métodos get y set para el atributo radio de la clase Circunferencia.
    
    //METODO GET
    
    public double getRadio() {
        return radio;
    }
    
    
    //METODO SET
    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    //Método para crearCircunferencia(): que le pide el radio y 
    //lo guarda  en el atributo del objeto.
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el radio del objeto");
        this.radio=(leer.nextDouble());
        
    }
    
    
    //Método area(): para calcular 
    //el área de la circunferencia (Area=〖π*radio〗^2).  
    public void area(){
        double area;
        area = Math.PI*Math.pow(this.radio,2);
        System.out.println("El area del circulo es: "+area);
    }
    
    
    /*
    Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
    */
    public void perimetro(){
        double perimetro;
        perimetro= 2*Math.PI*this.radio;
        System.out.println("El perimetro del circulo es: "+perimetro);
    }
}
