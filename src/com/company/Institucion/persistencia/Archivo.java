package com.company.Institucion.persistencia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

    public static void guardarPago(String informacionPago) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos_estudiantes.txt", true))) {
            writer.write(informacionPago);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
