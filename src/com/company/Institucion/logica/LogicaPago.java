package com.company.Institucion.logica;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LogicaPago {

    public static void realizarPago(DefaultTableModel modelo, int filaSeleccionada, String valorPago,
            String tipoPago, String fecha) {
        // Verificar si es MATRICULA y el valor es menor que 450,000 o mayor o igual a 451,000
        if (tipoPago.equals("MATRICULA")) {
            double valorMatricula = Double.parseDouble(valorPago);
            if (valorMatricula < 450.000 || valorMatricula >= 451.000) {
                JOptionPane.showMessageDialog(null, "El valor de la matrícula debe ser exactamente 450,000 pesos.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Verificar si es PENSION y el valor es menor o igual a 250,000
        if (tipoPago.equals("PENSION")) {
            double valorPension = Double.parseDouble(valorPago);
            double limitePension = 250.000;

            if (valorPension > limitePension) {
                JOptionPane.showMessageDialog(null, "El valor de la pensión no puede superar los 250,000 pesos.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                double faltaPagar = limitePension - valorPension;
                JOptionPane.showMessageDialog(null, "Falta pagar " + faltaPagar
                        + " pesos para alcanzar el límite de la pensión.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        // Agregar el valor de pago a la fila correspondiente en la columna adecuada
        int columnaPago = tipoPago.equals("MATRICULA") ? 5 : 6; // Ajusta esto según la posición real de la columna
        modelo.setValueAt(valorPago, filaSeleccionada, columnaPago);

        // Verificar si la fecha tiene el formato correcto
        if (!validarFormatoFecha(fecha)) {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Utiliza el formato dd/mm/yyyy.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Agregar la fecha a la columna correspondiente
        modelo.setValueAt(fecha, filaSeleccionada, 7); // Ajusta esto según la posición real de la columna

        // Calcular el total sumando los valores de MATRICULA y PENSION
        try {
            double totalMatricula = Double.parseDouble(modelo.getValueAt(filaSeleccionada, 5).toString());
            double totalPension = Double.parseDouble(modelo.getValueAt(filaSeleccionada, 6).toString());
            double total = totalMatricula + totalPension;

            // Agregar el total a la columna correspondiente
            modelo.setValueAt(total, filaSeleccionada, 8); // Ajusta esto según la posición real de la columna
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al calcular el total. Verifica los valores ingresados.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static boolean validarFormatoFecha(String fecha) {
        // Utilizar una expresión regular para validar el formato dd/mm/yyyy
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d\\d$";
        return fecha.matches(regex);
    }
}


