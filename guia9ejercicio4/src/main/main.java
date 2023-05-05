/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Date;
import java.util.Scanner;
import servicio.FechaService;

/**
 *
 * @author agust
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fecha = new FechaService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("dia:");
        int dia = leer.nextInt();
        System.out.println("mes");
        int mes = leer.nextInt();
        System.out.println("año:");
        int anio = leer.nextInt();
        Date fecha1 = fecha.fechaNacimiento(dia, mes, anio);
       
        System.out.println("FECHA DE CUMPLEAÑOS "+fecha.fechaNacimiento(dia, mes, anio));
        
        Date fechaActual =fecha.fechaActual();
        System.out.println(""+fechaActual);
        System.out.println("edad "+fecha.diferencia(fecha1, fechaActual));
        
        
    }
    
}
