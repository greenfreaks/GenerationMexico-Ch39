package org.generation.employee.manager;

public class ManagerMain {
	public static void main(String[] args) {
		Manager andrea = new Manager(10236, "Andrea", "Garibaldi", 40000, "Manager", 37, 23541.90);
		Manager daniel = new Manager(10236, "Danel", "Maldonado", 50000, "Manager", 10, 10000);
		
		andrea.informacion(); //Método de la superclase
		andrea.calcularSalario(); //Método de la superclase
		andrea.salarioManager(); // Método de la subclase
		daniel.supervisar(); // Método de la subclase
		
	}
}
