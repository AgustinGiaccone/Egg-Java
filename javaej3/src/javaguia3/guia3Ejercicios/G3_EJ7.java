
package javaguia3.guia3Ejercicios;

import java.util.Scanner;


public class G3_EJ7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Realizar un programa que simule el funcionamiento"
+ " de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por"
 + " el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser"
+ " de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X"
+ " y el último tiene que ser una O.\n" +
"Las secuencias leídas que respeten el formato se consideran correctas,"
+ "la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),"
+ " y toda secuencia distinta de FDE, que no respete el formato se considera"
+ " incorrecta.\n" +
"Al finalizar el proceso, se imprime un informe indicando la cantidad de "
+ "lecturas correctas e incorrectas recibidas. Para resolver el ejercicio "
+ "deberá investigar cómo se utilizan las siguientes funciones de Java"
+ " Substring(), Length(), equals().");
        String cadena;
        int contadorVerdadero=0;
        int contadorFalso=0;
        boolean b;
        do{
            System.out.print("ingrese una cadena de texto: ");
            cadena=leer.next();
            b= cadena.length()<=5 && cadena.startsWith("X")&& cadena.endsWith("O");
            if (b){
                contadorVerdadero++;
            } else{
                contadorFalso++;
            }
        }while(!"&&&&&".equals(cadena));
        System.out.println("se leyeron "+contadorVerdadero+ " cadenas correctas");
        System.out.println("se leyeron "+contadorFalso+ " cadenas incorrectas");
    }
    
}
      