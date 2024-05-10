package org.generation.employee.manager;
import org.generation.employee.Employee;

public class Manager extends Employee {
	//Atributos propios de manager
	private int colaboradores;
	private double bono;
	
	//La clase manager será una subclase que heredará atributos y métodos de la super clase Employee. Para heredar definimos la herencia con la palabra extends dentro de la subclase
		//Constructor con parámetros heredados
	public Manager(long idEmpleado, String nombre, String apellido, double salario, String puesto, int colaboradores, double bono) {
		super(idEmpleado, nombre, apellido, salario, puesto);
		this.colaboradores = colaboradores;
		this.bono = bono;
	}
	
	
	
	//Métodos de comportamiento propio del Manage

	public void supervisar() {
		System.out.println("El manager" + this.getNombre() + " " + this.getApellido() + " le pregunta a sus colaboradores " + colaboradores + " ¿Cómo vas? ");	
	}
	
	public void salarioManager() {
		double salarioTotal = this.getSalario() + this.bono;
		System.out.println("El manager " + this.getNombre() + " " + this.getApellido() + " gana $ " + salarioTotal);
	}
	
	//Getters y Setters
	public int getColaboradores() {
		return colaboradores;
	}



	public void setColaboradores(int colaboradores) {
		this.colaboradores = colaboradores;
	}



	public double getBono() {
		return bono;
	}



	public void setBono(double bono) {
		this.bono = bono;
	}



	@Override
	public String toString() {
		return "Manager [colaboradores=" + colaboradores + ", bono=" + bono + "]";
	}
	
	
		
}
