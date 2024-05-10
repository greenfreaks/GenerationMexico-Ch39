package org.generation.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterableMain {
    public static void main (String[] args){
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.addAll(Arrays.asList("Mario", "Juan", "Julia", "Jessica"));
        System.out.println(nombres);

        //1. Iterar mediante ciclo for each
        for(String nombre : nombres){
            System.out.print(nombre + " | ");
        }

        //2. Iterar mediante Itereator.
        ArrayList<Double> salarios = new ArrayList<Double>();
        salarios.addAll(Arrays.asList(22136.22d, 8766.3d, 12455.12d));
        System.out.println(salarios);
        //Mandamos a llamar la interfaz Iterator y la importamos (java.util), le asignamos un nombre y le definimos el ArrayList spbre el cual va a iterar utilizando el método iterator();
        Iterator<Double> IteradorSalarios = salarios.iterator();
        System.out.println(IteradorSalarios); // No me muestra la lista. Output: java.util.ArrayList$Itr@119d7047

        //3. Utilizar el Iterator en un ciclo while para que los elementos se muestren en forma de lista, utilizando el método hasNext() que será TRUE, siempre que encuentre más elementos en el iterado. Estos elementos se guardan en una variable que pueda imprimirse
        while (IteradorSalarios.hasNext()){
            Double elemento = IteradorSalarios.next();
            System.out.println(elemento);
        }

        //4. Iterar medinte funciones lambda-forEach
        ArrayList<String> posiciones = new ArrayList<String>();
        posiciones.addAll(Arrays.asList("Fronted", "Backedn", "Devops", "Tester", "Scrum Master", "Fullstack"));

        posiciones.forEach((posicion)->{
            System.out.println(posicion);
        });

    }
}
