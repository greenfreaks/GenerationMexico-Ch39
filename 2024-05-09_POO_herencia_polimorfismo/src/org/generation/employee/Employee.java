package org.generation.employee;

public class Employee {
	//Nombre, apellido, idEmpleado, salario, puesto, 
	private long idEmpleado;
	private String nombre;
	private String apellido;
	private double salario;
	private String puesto;
	
	//Constructor
	public Employee(long idEmpleado, String nombre, String apellido, double salario, String puesto) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.puesto = puesto;
	}
	
	
	//Métodos de comportamiento
	
	// Métodos de comportamiento
	public void trabajar() {
	System.out.println(this.nombre + " " + this.apellido + " está trabajando");
	}

	public void calcularSalario() {
	System.out.println("El salario de " + this.nombre + " " + this.apellido + " es de $" + this.salario);
	}

	public void informacion() {
	System.out.println("Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", número de empleado: " + this.idEmpleado + ", puesto: " + this.puesto);
	}
	
	//Getters y setters
	
	public long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	@Override
	public String toString() {
		return "Employee [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", salario="
				+ salario + ", puesto=" + puesto + "]";
	}
	
	
	
	
	
	
}
