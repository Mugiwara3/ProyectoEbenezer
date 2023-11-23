package com.company.Institucion.vista;

import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ConsultarPago extends javax.swing.JInternalFrame {

    public ConsultarPago() {
        initComponents();
        configurarTabla();
        cargarDatosDesdeArchivo();

    }

    private void configurarTabla() {
        DefaultTableModel modelo3 = new DefaultTableModel();
        modelo3.addColumn("ID");
        modelo3.addColumn("NOMBRE");
        modelo3.addColumn("APELLIDO");
        modelo3.addColumn("EDAD");
        modelo3.addColumn("CURSO");
        modelo3.addColumn("MATRICULA");
        modelo3.addColumn("PENSION");
        modelo3.addColumn("TOTAL");
        modelo3.addColumn("FECHA");

        tabla3.setModel(modelo3);
    }

    private void cargarDatosDesdeArchivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos_estudiantes.txt"))) {
            String line;
            DefaultTableModel modelo3 = (DefaultTableModel) tabla3.getModel();

            while ((line = reader.readLine()) != null) {
                // Separar los datos por coma (ajusta esto según el formato que hayas elegido)
                String[] datos = line.split(",");
                modelo3.addRow(datos);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejar la excepción apropiadamente en tu aplicación
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        buscarIdentificacion = new javax.swing.JTextField();

        setClosable(true);

        tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla3);

        jLabel1.setText("IDENTIFICACION");

        buscarIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIdentificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(buscarIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscarIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIdentificacionActionPerformed

        String idABuscar = buscarIdentificacion.getText();

        if (idABuscar.isEmpty()) {
            // Restaurar el filtro si no hay texto para buscar
            DefaultTableModel modelo3 = (DefaultTableModel) tabla3.getModel();
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo3);
            tabla3.setRowSorter(sorter);
        } else {
            try {
                // Convertir el texto de búsqueda a un número largo
                long id = Long.parseLong(idABuscar);

                // Crear un filtro para buscar por ID
                RowFilter<DefaultTableModel, Object> filter = RowFilter.regexFilter(String.valueOf(id), 0);

                // Aplicar el filtro a la tabla
                DefaultTableModel modelo3 = (DefaultTableModel) tabla3.getModel();
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo3);
                sorter.setRowFilter(filter);
                tabla3.setRowSorter(sorter);
            } catch (NumberFormatException e) {
                // Manejar la excepción si la entrada no es un número largo
                System.err.println("Error de formato en la identificación: " + e.getMessage());
            }
        }


    }//GEN-LAST:event_buscarIdentificacionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarIdentificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla3;
    // End of variables declaration//GEN-END:variables
}
