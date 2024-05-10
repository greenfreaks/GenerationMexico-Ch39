package org.generation.exceptions;

public class FondosInsuficientesExc extends Exception{
    private static final long serialVersionUID = 1L; //ID para tabla de errores, generamos uno por default

    //Atributos
    private double monto;

    public FondosInsuficientesExc(double monto) {
        this.monto = monto;
    }

    //Getters y setters


    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
