/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.libro;

/**
 *
 * @author agust
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        libro libro1= new libro(1231231,"maze runner","lautaro martinez", 576);
        libro libro2= new libro();
        
        libro2.cargarLibro();
        libro2.mostrarLibro();
        libro1.mostrarLibro();
    }
    
}
