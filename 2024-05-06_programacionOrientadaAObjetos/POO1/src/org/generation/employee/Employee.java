package org.generation.employee;

public class Employee {
    // 1. Declarar Atribtos
    String nombre;
    String apellido;
    int edad;
    private double salario;
    String puesto;

    // 2. Método contructor, no retorna nada, recibe argumentos que corresponder a los atributos y estos se guardan con la palabra resercada <this>
    Employee(String nombre, String apellido, int edad, double salario, String puesto){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this. salario = salario;
        this.puesto = puesto;
    }

    //03. Métodos de comportamiento
    public void trabajar(){
        System.out.println("Estoy trabajando");
    }

    public void calcularSalario(){
        System.out.println("El salario es de: $" + this.salario);
    }

    public void informacion(){
        System.out.println("Nombre " + this.nombre + ", Apellido " + this.apellido + ", edad " + this.edad + ", puesto " + this.puesto);
    }
    //3. Método para acceder y modificar el objeto: GETTERS Y SETTERS (se pueden modificar valores y no retorna nada)

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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


    // 4. Método para leer el objeto

    @Override
    public String toString() {
        return "Employee{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", puesto='" + puesto + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
