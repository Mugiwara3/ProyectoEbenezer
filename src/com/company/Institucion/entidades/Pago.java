package com.company.Institucion.entidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Pago {

    private Estudiante estudiante;

    public Pago(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void registrarPago() {

        // guarda la información en un archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos_estudiantes.txt", true))) {
            writer.write(getTipoPago() + " - " + estudiante.getId() + "," + estudiante.getNombre() + "," + estudiante.getApellido());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace(); // Manejar la excepción apropiadamente en tu aplicación
        }
        System.out.println("Pago registrado exitosamente");
    }

    public abstract String getTipoPago();
}
