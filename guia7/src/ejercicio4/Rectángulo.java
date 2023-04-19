
package ejercicio4;

import java.util.Scanner;


//ATRIBUTOS NECESARIOS
public class Rectángulo {
    private int base;
    private int altura;

    public Rectángulo() {//CONSTRUCTOR
    }

    public Rectángulo(int base, int altura) { //CONSTRUCTOR CON LOS PARAMETROS 
        this.base = base;                     //CORRESPONDIENTES
        this.altura = altura;
    }
    
    //GETTER Y SETTER
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    //METODO CREAR RECTANGULO CON LOS DATOS DEL USUARIO
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa la base del rectangulo:");
        this.base=leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura=leer.nextInt();
    }
    
    //CALCULA LA SUPERFICIE
    public void superficie(){
        int superficie;
        superficie = this.altura * this.base;
        System.out.println("la superficie es: "+ superficie);
    }
    //CALCULA EL PERIMETRO
    public void perimetro(){
        int perimetro;
        perimetro=(this.base+this.altura)*2;
        System.out.println("el perimetro del rectangulo es: "+perimetro);
    }
    //DIBUJA EL RECTANGULO
    public void dibujo(){
        
        for (int i = 0; i< this.base; i++){
            System.out.print(" * ");
            
        }
        System.out.println();
        for (int i = 0; i < this.altura-2; i++) {
            System.out.print(" * ");
            for (int j = 0; j < this.altura-2; j++) {
                System.out.print("  ");
                
            }
            System.out.println("*");
        }
        for (int i = 0; i < this.base; i++) {
            System.out.print(" * ");
            
        }System.out.println("");
    }
}



