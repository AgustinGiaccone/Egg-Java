/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" 
que permita a dos jugadores jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo.
El segundo jugador tiene un número limitado de intentos y recibe
una pista de "más alto" o "más bajo" después de cada intento. 
El juego termina cuando el segundo jugador adivina el número o
se queda sin intentos. Registra el número de intentos necesarios
para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package entidad;

import java.util.Scanner;

public class Juego {
    int numeroElejido;
    int numeroLimite;
    int numeroIngresado;

    public Juego() {
    }

    public Juego(int numeroElejido, int numeroLimite, int numeroIngresado) {
        this.numeroElejido = numeroElejido;
        this.numeroLimite = numeroLimite;
        this.numeroIngresado = numeroIngresado;
    }

    public int getNumeroElejido() {
        return numeroElejido;
    }

    public void setNumeroElejido(int numeroElejido) {
        this.numeroElejido = numeroElejido;
    }

    public int getNumeroLimite() {
        return numeroLimite;
    }

    public void setNumeroLimite(int numeroLimite) {
        this.numeroLimite = numeroLimite;
    }

    public int getNumeroIngresado() {
        return numeroIngresado;
    }

    public void setNumeroIngresado(int numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
    }
    
    public void iniciar_juego(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean respuesta=true;
        String seguir;
        int contador;
        do{
            System.out.println("ingrese la cantidad de intentos a adivinar");
            this.numeroLimite=leer.nextInt();
            System.out.println("Jugador 1: ingrese el numero que desea adivinar");
            this.numeroElejido=leer.nextInt();
            contador=1;
            do{
                System.out.println("Jugador 2: ingrese un numero");
                this.numeroIngresado=leer.nextInt();
                if (this.numeroIngresado>this.numeroElejido) {
                    System.out.println("-");
                }else if (this.numeroIngresado<this.numeroElejido) {
                    System.out.println("+");
                }
                contador++;
            }while  (contador< this.numeroLimite && this.numeroElejido != this.numeroIngresado);
            if (this.numeroElejido != this.numeroIngresado){
                System.out.println("No losgraste adivinar, el numero a adivinar es: "+this.numeroElejido);
            }else{
                System.out.println("Adivistaste el nuemro, bravooooooo!!!!");
            }
            System.out.println("Desa continuar el juego??");
            System.out.println("'SI' para continuar");
            System.out.println("'NO' para salir");
            seguir=leer.next();
            if (seguir.equalsIgnoreCase("si")) {
                respuesta=true;
                
            }else{
                respuesta=false;
            }
        }while  (respuesta);
        
        
    }
}


