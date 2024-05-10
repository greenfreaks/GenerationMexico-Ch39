package org.generation.cajeroBancario;
/* Lógica del programa
   *Trabajar con POO (atributos, métodos específicos, método del objeto, etc., encapsulamiento)
*/

import org.generation.exceptions.FondosInsuficientesExc;

public class CuentaBancaria {
    //Atributos
    private double saldo;
    private int idCuenta;

    //Método constructor
    public CuentaBancaria(int idCuenta) {
        //this.saldo = saldo; //No se debe de meter un valor que no está inicializado
        this.idCuenta = idCuenta;
    }

    //Método para ingresar dinero
    public void depositar(double monto){
        saldo+=monto;
    }
    //Método para retirar dinero
    public void retirar(double monto) throws FondosInsuficientesExc {
        if (monto <= saldo){
            saldo-=monto;
        }else{
            double faltante = monto - saldo; //El cajero te dirá cuanto dinero te hace falta para retirar esa cantidad
            throw new FondosInsuficientesExc(faltante);
        }
    }
    // Método para consultar saldo
    public void consultar(){
        this.saldo = saldo; //Ya podemos usar this, porque para este punto saldo ya tiene un valor
        System.out.println("Tu saldo es de $" + this.saldo);
    }
    //Métodos getters y setteres

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }
}
