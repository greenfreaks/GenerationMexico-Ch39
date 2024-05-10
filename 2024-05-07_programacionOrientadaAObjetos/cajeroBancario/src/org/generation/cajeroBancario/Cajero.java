package org.generation.cajeroBancario;
/*Interacción con el usuario (requiere método main)*/
public class Cajero {
    public static void main(String[] args) {
        CuentaBancaria cuentaDaniel = new CuentaBancaria(6989);
        System.out.println("Ingresando $500");
        cuentaDaniel.depositar(500);
        cuentaDaniel.consultar();
        cuentaDaniel.depositar(1500);
        cuentaDaniel.consultar();



    }
}
