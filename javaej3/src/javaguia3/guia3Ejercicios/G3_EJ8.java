
package javaguia3.guia3Ejercicios;

import java.util.Scanner;

public class G3_EJ8 {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("Dibujar un cuadrado de N elementos por lado"
+ " utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos"
+ " por lado se deberá dibujar lo siguiente:\n" +
" * * * * " +
" *     * " +
" *     * " +
" * * * * ");
        System.out.println("");
        System.out.println("ingrese el tamaño que desea su cuadrado: ");
        int tamaño = leer.nextInt();
        for ( int i = 0; i < tamaño; i++){
            for(int j = 0; j < tamaño; j++){
                if ( i == 0 || i == tamaño - 1 ||j== 0|| j == tamaño -1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }  
    }  
}
