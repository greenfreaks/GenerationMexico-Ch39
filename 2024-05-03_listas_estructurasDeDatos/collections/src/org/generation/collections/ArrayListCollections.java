package org.generation.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;

public class ArrayListCollections {
    public static void main(String[] args) {
        /*-----------ARAYS-------------*/
        /*
            *Siempre debemos de tener arrays de un solo tipo de datos
        * */
        //Inicializando array de String
        String[] nombres = {"Daniel", "Fernanda", "Gaby"};
        //Inicializando array de enteros
        int[] edades = { 37, 30, 30};

        //Imrimir valores de un Array, debemos de usar un método de arrays, por ejemplo <toString>
        System.out.println(Arrays.toString(nombres));
        System.out.println(Arrays.toString(edades));

        //Acceder a un elemento del array
        String nombre1= nombres[0];
        System.out.println(nombre1);

        //Longitud de un array
        int longitudEdades = nombres.length;
        System.out.println(longitudEdades); //Output: 3

        //Mostrar cada elemento con un forEach
        for(String nombre : nombres){ //Decimos que el <String nombre> va a recorrer el arreglo nombres
            System.out.println(nombre);
        }

        /*---------ArrayList-----------
            *Es un array que puede cambiar de tamaño y permite elementos duplicados
        */
        //1er método para inicializar un ArrayList
        ArrayList<String> peliculas = new ArrayList<String>() ; //Lo defino como clase
        List<Double> salario = new ArrayList<Double>(); //Como interface, sabemos que es una lista
        List<Integer> inventario = new ArrayList<>(); //Wrapper class

        //Agregando valores a los ArrayList
        peliculas.add("Titanic");
        peliculas.add("Frozen");
        peliculas.add("La isla siniestra");

        salario.add(17999.0d); //La letra <d> indica que es de tipo double
        salario.add(17999.0d);
        salario.add(17999.0d);

        inventario.add(20);

        System.out.println(peliculas);
        System.out.println(salario);
        System.out.println(inventario);

        //Método para acceder a un elemento del ArrayList: name.get(index)
        String pelicula2 = peliculas.get(1);
        System.out.println(pelicula2); //output: La isla siniestra

        //Método para modificar un elemento: name.set(index, newValue)
        //variable.set(position, newValue)
        int nuevoInventario = inventario.set(0, 17);
        System.out.println(inventario);
        //Trataremos de poner un valor en una posicion que no existe en el array
        //inventario.set(1, 98); //output: excepción || No se puede modificar un elmento que no existe

        salario.add(5000.0d);
        System.out.println(salario);
        int ultimoElemento = (salario.size()-1);

        //Método para eliminar un elemento
        salario.remove(ultimoElemento); //ELiminó el elemento con el índice 3
        System.out.println(salario);

        //Recorrer un ArrayList (forEach)
        for(String pelicula : peliculas){
            System.out.println(pelicula);
        }
    }


}
