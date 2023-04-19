/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Cuenta;

/**
 *
 * @author agust
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cliente1=new Cuenta("agus",9000);
        System.out.println(cliente1.getSaldo());
        cliente1.retirarSaldo(5000);
        System.out.println(cliente1.getSaldo());
        cliente1.retirarSaldo(6000);
        System.out.println(cliente1.getSaldo());
    }
    
}
