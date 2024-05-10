package org.generation.employee;

public class EmployeeMain {

    public static void main(String[] args) {
        // Instanciar en metodo main
        Employee daniel1 = new Employee("Daniel", "Maldonado", 37, 2000d, "Instructor");
        Employee erick = new Employee("Daniel", "Maldonado", 37, 2000d, "Instructor");
        Employee javier = new Employee("Daniel", "Maldonado", 37, 2000d, "Instructor");
        Employee lizeth = new Employee("Daniel", "Maldonado", 37, 2000d, "Instructor");

        System.out.println( daniel1);
        System.out.println(erick);
        System.out.println(javier);
        System.out.println(lizeth);

        //Invocando los métodos definidos
        erick.trabajar();
        javier.informacion();
        lizeth.calcularSalario();

        // Utilizar información de los objetos (getters)
        System.out.println(daniel1.getNombre() + " " + daniel1.getApellido() + " trabaja como " + daniel1.getPuesto());
        System.out.println(daniel1.getNombre() + " " + javier.getApellido() + " y tiene un salario de " + daniel1.salario);

        javier.salario = javier.getSalario() + 2000;

        System.out.println(javier.getSalario());
    }


}
