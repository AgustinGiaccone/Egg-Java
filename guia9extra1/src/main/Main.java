package main;

import entidad.MesSecreto;
import   servicio.Servicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        MesSecreto juego1 = new MesSecreto();
        Servicio js = new Servicio();
        js.adivinarMes(juego1);
    }
}
