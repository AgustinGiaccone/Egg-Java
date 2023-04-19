/*
Declarar cuatro variables de tipo entero A, B, C y D y 
asignarle un valor diferente a cada una. A continuación, 
realizar las instrucciones necesarias para que: B tome el 
valor de C, C tome el valor de A, A tome el valor de D y D 
tome el valor de B. Mostrar los valores iniciales y los valores
finales de cada variable. Utilizar sólo una variable auxiliar.

 */
package javaguia3.extraguia3;

import java.util.Scanner;


public class G3_EXTRA2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int a,b,c,d, aux;
        a=4;
        b=6;
        c=0;
        d=3;
        System.out.println("los valores iniciales son: A="+a+", B="+b+", C="+c+", D="+d);
        
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("los valores cambiados son: A="+a+", B="+b+", C="+c+", D="+d);
             
    }
    
}
