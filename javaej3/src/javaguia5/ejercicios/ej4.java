//Realizar un programa que rellene un matriz de 4 x 4 de valores
//aleatorios y muestre la traspuesta de la matriz.
//La matriz traspuesta de una matriz A se denota por B y se obtiene
//cambiando sus filas por columnas (o viceversa).
package javaguia5.ejercicios;

public class ej4 {

    public static void main(String[] args) {
        //creamos la matriz
        int [][] matriz= new int [4][4];
        String aux = " ";
        
        for (int f = 0; f<4; f++){
        for(int c = 0; c<4; c++){
            matriz[f][c]= (int) (Math.random()*10);
        }
    }
     //primera matriz   
      for (int[]fila : matriz)  
      {
          aux="";
          for(int elementos:fila){
              aux += ""+ elementos;
              
          }
          System.out.println("|"+aux+"|");
          
      }
      System.out.println("");
      //segunda matriz
    for (int c =0; c<4; c++){
        aux="";
        for ( int f=0;f<4;f++){
        aux+=""+matriz[f][c];
    }
        System.out.println("|"+aux+"|");
    }
    }
    
}
