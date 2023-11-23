package com.company.Institucion.vista;

import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class ConsultarPension extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo4;
    private Map<String, Integer> pagosPorEstudiante;

    public ConsultarPension() {
        initComponents();
        initComponents();
        configurarTabla();
        cargarDatosDesdeArchivo();
    }

    private void configurarTabla() {
        DefaultTableModel modelo4 = new DefaultTableModel();
        modelo4.addColumn("ID");
        modelo4.addColumn("PENSION");
        modelo4.addColumn("TOTAL");
        modelo4.addColumn("FECHA");

        tabla4.setModel(modelo4);
    }

    private void cargarDatosDesdeArchivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos_estudiantes.txt"))) {
            String line;
            DefaultTableModel modelo4 = (DefaultTableModel) tabla4.getModel();

            while ((line = reader.readLine()) != null) {
                // Separar los datos por coma (ajusta esto según el formato que hayas elegido)
                String[] datos = line.split(",");

                // Obtener el valor de la "PENSION"
                String pension = datos[6];

                // Añadir solo la "PENSION" en la columna "TOTAL"
                Object[] fila = {datos[0], pension, pension, datos[8]};
                modelo4.addRow(fila);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejar la excepción apropiadamente en tu aplicación
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla4 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("CONSULTAR PENSION");

        tabla4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla4;
    // End of variables declaration//GEN-END:variables

}
