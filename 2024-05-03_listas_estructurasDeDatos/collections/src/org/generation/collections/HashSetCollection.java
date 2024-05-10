package org.generation.collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetCollection {
    public static void main(String[] args) {
        /*HashSet*/
        //En los HashSets cada elemento es único, no existen elementos duplicados, si un elemeento se repite, HashSet lo ignora
        HashSet<String> animalitos = new HashSet<String>();
        //Este método para llenar arrays igual funciona con ArrayList
        animalitos.addAll(Arrays.asList("Perrito", "Gatito", "Conejito", "Pingüino", "Capibara", "Gatito"));
        System.out.println(animalitos);

        //Una tabla Hash busca coincidencias sin tomar un orden específico, no se guía mediante algún lgoritmo
        //Si la tabla Hash encunetra un elemento repetido lo elimina sin seguir orden algino
        //Es más rápido al recorrer su arreglo e identificar elementos justamente porque no se detiene a seguir reglas, sólo elimina el repetido que encuentra y ya

        //Utilizando la tabla Hash, recorre todos los elementos y muestra elementos únicos
        HashSet<Character> caracteres = new HashSet<Character>();
        caracteres.addAll(Arrays.asList('a', 'b', 'c','b', 'b', 'b','a', 'b', 'c', 'a', 'd', 'd','a', 'b', 'c'));
        System.out.println(caracteres);

        //Método para conocer si un elemento se encuentra en el Set
        System.out.println(animalitos.contains("Gatito")); // Arorja TRUE o FALSE

        //Aplicando size para conocer la longitud del set
        System.out.println(animalitos.size());

        //Eliminando elementos
        caracteres.remove('a');
        System.out.println(caracteres);
        System.out.println(caracteres.size()); //Output: 2

        //Método para limpiar
        animalitos.clear();
        System.out.println(animalitos); //Output: []
    }
}
