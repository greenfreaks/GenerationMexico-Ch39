package org.generation.letras;

import java.util.Scanner;

public class Letras {
    /*
    * Crear un programa que le solicite al ususario una cadena de texto y determine cuántas vocales, consonantes, número y caracteres tiene dicha entrada
    * Utiliza la tabla ACSII para desarrollarlo.
    * Utiliza POO
    * Refactorización y reutilización del código
    * Datos primitivos, operadores
    */

    //En Letras vamos a crear métodos que servirán para interactuar con el ususario
    Scanner scanner = new Scanner(System.in);

    // Método para retornar el Scanner
    public String leerEntrada(){
        return scanner.nextLine();
    }

    //Método para dar contexto al usuario
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
