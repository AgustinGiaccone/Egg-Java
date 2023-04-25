/*
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c

Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.

Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.

Método obtenerRaices(): llama a tieneRaíces() y si devolvió́  true, imprime las 2 posibles soluciones.

Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́  true imprime una única raíz. Es en el caso en que se tenga una única solución posible.

Método calcular(): esté método llamará  tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() 
o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
*/
package servicio;

import entidad.Raices;
import java.util.Scanner;

public class RaicesServicio {
    Raices rai = new Raices ();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void pedirValores(){
        System.out.println("Ingrese el valor de A");
        rai.setA(leer.nextDouble());
        
        System.out.println("Ingrese el valor de B");
        rai.setB(leer.nextDouble());
        
        System.out.println("Ingrese el valor de C");
        rai.setC(leer.nextDouble());
    }
    
    public double getDiscriminante(){
        double discriminante;
        discriminante = ((rai.getB()*rai.getB())-4*rai.getA()*rai.getC());
        System.out.println("el valor obtenido del discriminante es "+ discriminante);
        return discriminante;
    }
    
    public boolean tieneRaices(){
        boolean n=false;
        if (getDiscriminante()>0) {
            n=true;
            System.out.println("la ecuancion tiene dos raices? " + n);
        }
        return n;
    }
    
    public boolean tieneRaiz(){
        boolean raiz=false;
        if (getDiscriminante()==0) {
            raiz = true;
            System.out.println("la ecuancion tiene 1 raiz? " + raiz);
        }
        return raiz;
    }
    
    
    public void obtenerRaices(){
        double raiz1, raiz2;
        //(-b±√((b^2)-(4*a*c)))/(2*a)
       
        if (tieneRaices()==true) {
            raiz1 =(-rai.getB()+(Math.sqrt(getDiscriminante()))/(2*rai.getA()));
            System.out.println("el valor de la raiz1: " + raiz1);
            raiz2 =(-rai.getB()-(Math.sqrt(getDiscriminante()))/(2*rai.getA()));
            System.out.println("el valor de la raiz2: " + raiz2);
        }      
    }
    
    public void obtenerRaiz(){
        double raiz;
        if (tieneRaiz()==true) {
            raiz=(-rai.getB()+(Math.sqrt(getDiscriminante()))/(2*rai.getA()));
            System.out.println("el valor de la riaz es: "+raiz);
        }
    }
    
    /*
Método calcular(): esté método llamará  tieneRaices() y a tieneRaíz(), y mostrará  por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() 
o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
    */
    public void calcular(){
        if (tieneRaices()== false && tieneRaiz()==false) {
            System.out.println("no tiene solucion");
        }else{
        System.out.println(" metodo tieneRaices() = "+ tieneRaices());
        System.out.println("metodo tieneRaíz() = "+tieneRaiz());
        obtenerRaices();
        obtenerRaiz();
        }
    }
}
