package com.company.Institucion.entidades;

public class Pension extends Pago {

    public Pension(Estudiante estudiante) {
        super(estudiante);
    }

    @Override
    public String getTipoPago() {
        return "Pension";
    }

}
