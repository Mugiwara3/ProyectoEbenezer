package com.company.Institucion.vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class RegistrarPago extends javax.swing.JInternalFrame {

    private TableRowSorter<DefaultTableModel> sorter;

    public static DefaultTableModel modelo2;

    public RegistrarPago() {

        initComponents();
        modelo2 = new DefaultTableModel();
        modelo2.addColumn("ID");
        modelo2.addColumn("NOMBRE");
        modelo2.addColumn("APELLIDO");
        modelo2.addColumn("EDAD");
        modelo2.addColumn("CURSO");
        modelo2.addColumn("MATRICULA");
        modelo2.addColumn("PENSION");
        modelo2.addColumn("TOTAL");
        modelo2.addColumn("FECHA");

        tabla2.setModel(modelo2);
        sorter = new TableRowSorter<>(modelo2);
        tabla2.setRowSorter(sorter);

        //Cargarmos los datos desde el archivo de texto al iniciar la ventana
        cargarDatosDesdeArchivo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        elegirpago = new javax.swing.JTextField();
        buscarIdentificacion = new javax.swing.JTextField();
        botonguardar = new javax.swing.JButton();
        MATRICULA = new javax.swing.JRadioButton();
        PENSION = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        datofecha = new com.toedter.calendar.JDateChooser();
        registrofecha = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("REGISTRAR PAGOS\n");

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla2);

        jLabel1.setText("ID");

        jLabel3.setText("TOTAL");

        elegirpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirpagoActionPerformed(evt);
            }
        });

        buscarIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIdentificacionActionPerformed(evt);
            }
        });

        botonguardar.setBackground(new java.awt.Color(0, 255, 0));
        botonguardar.setText("GUARDAR");
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });

        MATRICULA.setText("MATRICULA");
        MATRICULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATRICULAActionPerformed(evt);
            }
        });

        PENSION.setText("PENSION");
        PENSION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PENSIONActionPerformed(evt);
            }
        });

        jLabel2.setText("FECHA");

        registrofecha.setBackground(new java.awt.Color(0, 255, 0));
        registrofecha.setText("REGISTRAR FECHA");
        registrofecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrofechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(buscarIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(elegirpago, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(botonguardar)))
                        .addGap(0, 389, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(MATRICULA)
                .addGap(18, 18, 18)
                .addComponent(PENSION)
                .addGap(179, 179, 179)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(datofecha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registrofecha)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscarIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MATRICULA)
                            .addComponent(PENSION)
                            .addComponent(jLabel2)))
                    .addComponent(datofecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrofecha)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(elegirpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonguardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIdentificacionActionPerformed

        String idABuscar = buscarIdentificacion.getText();
        if (idABuscar.isEmpty()) {
            // Restaurar el filtro si no hay texto para buscar
            sorter.setRowFilter(null);
        } else {
            try {
                // Convertir el texto de búsqueda a un número largo
                long id = Long.parseLong(idABuscar);

                // Crear un filtro para buscar por ID
                RowFilter<DefaultTableModel, Object> filter = RowFilter.regexFilter(String.valueOf(id), 0);

                // Aplicar el filtro a la tabla
                sorter.setRowFilter(filter);
            } catch (NumberFormatException e) {
                // Manejar la excepción si la entrada no es un número largo
                System.err.println("Error de formato en la identificación: " + e.getMessage());
            }
        }


    }//GEN-LAST:event_buscarIdentificacionActionPerformed

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed

        // Obtener el valor ingresado en elegirpago
        String valorPago = elegirpago.getText();

        // Verificar si se ha seleccionado MATRICULA o PENSION
        String tipoPago = MATRICULA.isSelected() ? "MATRICULA" : "PENSION";

        // Obtener la fila seleccionada en la tabla
        int filaSeleccionada = tabla2.getSelectedRow();

        // Verificar si se ha seleccionado una fila
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila antes de guardar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();

        // Obtener el ID de la fila seleccionada
        String id = modelo.getValueAt(filaSeleccionada, 0).toString();

        // Verificar si es MATRICULA y el valor es menor que 450,000 o mayor o igual a 451,000
        if (tipoPago.equals("MATRICULA")) {
            double valorMatricula = Double.parseDouble(valorPago);
            if (valorMatricula < 450.000 || valorMatricula >= 451.000) {
                JOptionPane.showMessageDialog(this, "El valor de la matrícula debe ser exactamente 450,000 pesos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Verificar si es PENSION y el valor es menor o igual a 250,000
        if (tipoPago.equals("PENSION")) {
            double valorPension = Double.parseDouble(valorPago);
            double limitePension = 250.000;

            if (valorPension > limitePension) {
                JOptionPane.showMessageDialog(this, "El valor de la pensión no puede superar los 250,000 pesos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                double faltaPagar = limitePension - valorPension;
                JOptionPane.showMessageDialog(this, "Falta pagar " + faltaPagar + " pesos para alcanzar el límite de la pensión.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        // Agregar el valor de pago a la fila correspondiente en la columna adecuada
        int columnaPago = tipoPago.equals("MATRICULA") ? 5 : 6; // Ajusta esto según la posición real de la columna
        modelo.setValueAt(valorPago, filaSeleccionada, columnaPago);

        try {
            double totalMatricula = Double.parseDouble(modelo.getValueAt(filaSeleccionada, 5).toString());
            double totalPension = Double.parseDouble(modelo.getValueAt(filaSeleccionada, 6).toString());
            double total = totalMatricula + totalPension;

            // Redondear el total a dos decimales
            total = Math.round(total * 100.0) / 100.0;

            // Formatear el total como una cadena con tres decimales
            String totalFormateado = String.format("%.3f", total);

            // Agregar el total formateado a la columna correspondiente
            modelo.setValueAt(totalFormateado, filaSeleccionada, 7); // Ajusta esto según la posición real de la columna
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al calcular el total. Verifica los valores ingresados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        // Guardar los datos actualizados en el archivo
        guardarDatosEnArchivo();

        // Limpiar el campo elegirpago
        elegirpago.setText("");
    }//GEN-LAST:event_botonguardarActionPerformed

    private void elegirpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirpagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elegirpagoActionPerformed

    private void PENSIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PENSIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PENSIONActionPerformed

    private void MATRICULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATRICULAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MATRICULAActionPerformed

    private void registrofechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrofechaActionPerformed
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        if (datofecha.getDate() != null) {
            String date = dFormat.format(datofecha.getDate());

            // Obtener la fila seleccionada en la tabla
            int filaSeleccionada = tabla2.getSelectedRow();

            // Verificar si se ha seleccionado una fila
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione una fila antes de registrar la fecha.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Obtener el modelo de la tabla
            DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();

            // Agregar la fecha a la columna correspondiente
            modelo.setValueAt(date, filaSeleccionada, 8); // Ajusta esto según la posición real de la columna

            // Actualizar el archivo con los datos actualizados
            guardarDatosEnArchivo();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fecha antes de registrar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_registrofechaActionPerformed

    private void cargarDatosDesdeArchivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos_estudiantes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Separar los datos por coma (puedes ajustar esto según el formato que hayas elegido)
                String[] datos = line.split(",");
                modelo2.addRow(datos);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejar la excepción apropiadamente en tu aplicación
        }
    }

    private void guardarDatosEnArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos_estudiantes.txt"))) {
            // Recorrer las filas y guardar los datos en el archivo
            DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
            int filas = modelo.getRowCount();
            int columnas = modelo.getColumnCount();

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    writer.write(modelo.getValueAt(i, j).toString());
                    if (j < columnas - 1) {
                        writer.write(",");
                    }
                }
                writer.newLine(); // Agregar un salto de línea después de cada fila
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar datos en el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Manejar la excepción apropiadamente en tu aplicación
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton MATRICULA;
    private javax.swing.JRadioButton PENSION;
    private javax.swing.JButton botonguardar;
    private javax.swing.JTextField buscarIdentificacion;
    private com.toedter.calendar.JDateChooser datofecha;
    private javax.swing.JTextField elegirpago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton registrofecha;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
