
package javaguia5.ejercicios;
//Realice un programa que compruebe si una matriz dada es antisimétrica.
//Se dice que una matriz A es antisimétrica cuando ésta es igual
//a su propia traspuesta, pero cambiada de signo. Es decir, 
//A es antisimétrica si A = -AT. La matriz traspuesta de una 
//matriz A se denota por AT y se obtiene cambiando sus filas por 
//columnas (o viceversa).
public class ej5 {
// i siendo la columna   | | |
// j siendo la fila      - - -
    public static void main(String[] args) {
        //crea la matriz a con numeros random
        int [][] matrizA = new int [3][3];
        for (int i= 0; i<3;i++){
            for (int j =0; j<3; j++){
                matrizA[i][j]=(int)(Math.random()*10);
            }
        }
        //muestra la matriz a
        System.out.println("matriz A");
        for (int i= 0; i<3;i++){
            for (int j =0; j<3; j++){
                System.out.print(matrizA[i][j]+" ");
            }
            System.out.println();
        }
        
        // crea la matriz b
        int [][] matrizB=new int[3][3];
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
            //con los valores de la matriz a en negativo y cambiandolos de fila
                matrizB[j][i]=-matrizA[i][j];
            }
        }
        //mostramos la matriz b
        System.out.println("matriz B  transpuesta con signos cambiados");
        for (int i= 0; i<3;i++){
            for (int j =0; j<3; j++){
                System.out.print(matrizB[i][j]+" ");
            }
            System.out.println();
            
               
     }
  }
}




