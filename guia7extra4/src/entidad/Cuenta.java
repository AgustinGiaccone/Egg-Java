/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author agust
 */
public class Cuenta {
     private  String titular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     public void retirarSaldo(int valor){
        if(saldo-valor>0) {
            saldo = saldo-valor;
            setSaldo(saldo);
        }
        else {
            System.out.println("SALDO INSUFICIENTE");
        }
     }
}
