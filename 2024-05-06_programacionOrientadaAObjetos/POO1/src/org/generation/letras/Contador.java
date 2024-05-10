package org.generation.letras;

public class Contador {
    //Aquí vive la lógica de mi programa: determinar si es vocal, consonante, etc ...
    //Vamos a tener 2 grupos de métodos
    //Grupo 1 -> Métodos de tipo boobleanos para determinar a qué tipo de caracteres responde
    //Grupo 2 -> Métodos int para contar el número de cada tipo

    //Grupo 1:
    public boolean esVocal(char caracter){
        return (caracter == "a")
    }

    public boolean esConsonante(char caracter){}

    public booblean esNumero(char caracter){}

    public boolean esSimbolo(char caracter){
        return !(esVocal(caracter) && esConsonante(caracter) && esNumero(caracter));
    }
}

