package org.generation.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee susana = new Employee(2023101516, "Susana", "Martinez", 12000, "Java Developer");
		Employee sergio = new Employee(2022083014, "Sergio", "Cruz", 20963.33, "Scrum Master");
		Employee patricio = new Employee(20243633, "Patricio", "Piña", 19000.30, "Java FullStack");
		
		susana.trabajar();
		sergio.calcularSalario();
		patricio.informacion();
	}

}
