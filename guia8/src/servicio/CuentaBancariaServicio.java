
package servicio;

import entidad.CeuntaBancaria;
import java.util.Random;
import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Random random = new Random();
    private CeuntaBancaria cuenta;
    //crear cuenta
    public void crearCuenta(){
        System.out.print("su cuenta sera:");
        int numeroCuenta = random.nextInt(100000);
        System.out.println(numeroCuenta);
        System.out.println("");
        System.out.print("Ingrese el DNI del cliente: ");
        long dniCliente = sc.nextLong();
        
        System.out.print("Ingrese el saldo actual: ");
        double saldoActual = sc.nextDouble();
        
        cuenta = new CeuntaBancaria(numeroCuenta,dniCliente,saldoActual);
    }
    //ingresar
    public void ingresar(double cantidad){
        cuenta.setSaldoActual(cuenta.getSaldoActual()+ cantidad);
    }
    //retirar
    public void retirar(double cantidad){
        if(cantidad>cuenta.getSaldoActual()){
            System.out.println("la cuenta no tiene saldo suficiente para retirar"
                    + " $"+cantidad);
        }
        else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()-cantidad);
        }
    }
    //extraccion rapida
    public void extraccionRapida(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        double saldoActual = cuenta.getSaldoActual();
        double limite = saldoActual*0.2;
        String respuesta;
        System.out.println("quiere realizar una extraccion rapida??(S/N)");
        respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("S")) {
            cuenta.setSaldoActual(saldoActual-limite);
            System.out.println("se ha retirado $"+limite+" de su cuenta");
        }else{
            System.out.println("no se ha realizado ninguna extraccion");
        }
    }
    //consultar saldo
    public double consultarSaldo(){
        return cuenta.getSaldoActual();
    }
    //consultar datos
    public void consultarDatos(){
        System.out.println("numero de cuenta: "+cuenta.getNumeroCuenta());
        System.out.println("DNI: "+cuenta.getDniCliente());
        System.out.println("Saldo: "+cuenta.getSaldoActual());
    }
}
