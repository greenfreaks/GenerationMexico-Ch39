package org.generation.expections;

public class DivisionMain {
    //Método para dividir 2 enteros
    public static int divisionEnteros(int a, int b){
        return a / b;
    }
    public static void main(String[] args) {
        //1. SI el método divisionEnteros no es static, tengo que instanciar un objeto
        //DivisionMain division = new DivisionMain();
        //System.out.println(division.divisionEnteros(5, 10));

        //2. Si no quiero instanciar objetos, tengo que declarar el método divisionEnteros como método propio de la clase (static)
        System.out.println(divisionEnteros(50, 10));

        //-------Manejando excepciones -----------
        try {
            int resultado = divisionEnteros(50, 100);
            System.out.println("El resultado de la división es " + resultado);
        }catch(ArithmeticException e){
            System.out.println("No puedes dividir entre 0");
        }finally {
            System.out.println("\u001B[0mPrograma finalizado\u001B[0m");
        }
    }
}
