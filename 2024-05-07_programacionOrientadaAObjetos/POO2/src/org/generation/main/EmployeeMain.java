package org.generation.main;

import org.generation.employee.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee asbel = new Employee("Asbel", "Torales", 26, 1700, "Desarrolladora Front End");
        //System.out.println(asbel.puesto); //No me permite ingresar porque el atributo <puesto> tiene un modificador protected

        System.out.println(asbel.getPuesto()); // Si arrojará mi
    }
}
