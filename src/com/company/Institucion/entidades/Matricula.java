package com.company.Institucion.entidades;

public class Matricula extends Pago {

    public Matricula(Estudiante estudiante) {
        super(estudiante);
    }

    @Override
    public String getTipoPago() {
        return "Matricula";
    }

}
