package org.generation.collections;

import com.sun.source.tree.Tree;

import java.util.*;

public class SortMethod {
    public static void main(String[] args) {
        /*-----------MÉTODO SORT--------*/
        //Permite ordenar los elementos de una colección
        ArrayList<String> peliculas = new ArrayList<>();
        Set<Integer> edades = new HashSet<>();

        //Llenar el ArrayList y el HashSet
        peliculas.addAll(Arrays.asList("Glass", "Interestelar", "MadMax", "John Wick", "Oppenheimer", "Interestelar"));
        edades.addAll(Arrays.asList(18, 22, 37, 22, 27, 30, 25, 30));

        //Imprimir las colecciones
        System.out.println(peliculas);
        System.out.println(edades);

        //Método para ordenar los elementos: Collections.sort(colección); utilizando como referencia la tabla ASCII
        Collections.sort(peliculas);
        //Collections.sort(edades);

        System.out.println(peliculas);

        //Quise ordenar el Hash con el método Sort pero Eclipse me dijo que no escompatible. Dice Patricio que con TreeSet funcionaría
        TreeSet<Integer> edades1 = new TreeSet<Integer>();
        edades1.addAll(Arrays.asList(18, 22, 37, 22, 27, 30, 25, 30));
        System.out.println(edades1);

        edades = new TreeSet<>(edades);
        edades.addAll(Arrays.asList(18, 22, 37, 22, 27, 30, 25, 30));
        System.out.println(edades);

        //Una clase no puede acceder a otra clase del mismo nivel. pero una clase si puede acceder a su interdace
        //Cuando declara una colección como clase o interface? La declararemos como interface cuando necesitemos hacer un switch entre colecciones
    }

}
