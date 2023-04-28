/*
Método mostrarValores que muestra cuáles son los dos números guardados.

Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor

Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores.

Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

*/
package servicio;

import entidad.ParDeNumeros;

public class ParDeNumerosServicio {
    ParDeNumeros pdn = new ParDeNumeros();
    
    public void MostrarValores(){
        double n1;
        double n2;
        n1=pdn.getNum1();
        System.out.println(" Numero 1: "+n1);
        n2=pdn.getNum2();
        System.out.println(" Numero 2: "+n2);
        
    }
    
    public double DevolverMayor(){
        double n1;
        double n2;
        
        
        n1=pdn.getNum1();
        n2=pdn.getNum2();
        if (n1 > n2) {
            System.out.print(" numero 1 es mas grande: ");
            return   (this.pdn.getNum1());
        }else if (n1<n2){
            System.out.print(" n2 es mas grande: ");
            return this.pdn.getNum2();
        }else {
            System.out.println("los numeros son iguales");
        }
        return n1+n2;
    }
    /*
    Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores.
    */
    public double calcularPotencia(){
        double n1;
        double n2;
        double potencia=0;
        
        n1=Math.round(pdn.getNum1());
        n2=Math.round(pdn.getNum2());
        if (n1 > n2) {
            potencia = (Math.pow(n1,n2));
            
            return   potencia;
        }else{
            potencia = (Math.pow(n2,n1));
            return potencia;
        }
        
    }
    /*
    Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    public  double calculaRaiz(){
        double raiz=0;
        double n1;
        double n2;
        
        n1=Math.abs(pdn.getNum1());
        n2=Math.abs(pdn.getNum2());
        
        if (n1>n2) {
            raiz = Math.sqrt(n2);
            return raiz;
            
        }else if (n1<n2){
            raiz = Math.sqrt(n1);
            return raiz;
        }else {
            System.out.println("NULL");
        }
        
        return raiz*0;
    }
}
