package org.generation.loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        // Crear un prrograma que soicute al usuario un número final que se utilizará para contar del 1 al N, donde N es el numero que ingresó el usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número final para la cuenta");

        int numInicio = 1;
        int numFinal = sc.nextInt();

        while(numInicio < numFinal){
            System.out.println(numInicio);
            numInicio++;
        }

        // 2. Crear un programa que solicite al usuario un número entre 1 y 999, para determinar cuántos dígitos tiene dicho número. El programa se ejecuta sin terminar hasta que el usuario ingrese el número 0
        int numero;

        do {
            System.out.println("Ingresa un número para conocer cuántos dígitos tiene.\nAl ingresar el 0 se termina el programa.");
            numero = sc.nextInt();

            if (numero >= 100) {
                System.out.println("Su número tiene 3 o más digitos");
            } else if (numero >= 10 && numero <= 99) {
                System.out.println("Su número tiene 2 dígitos");
            } else {
                System.out.println("Su número tiene un dígito");
            }
        } while ( numero != 0 );
        System.out.println("\u001B[33mEl programa ha finalizado");

    }
}
