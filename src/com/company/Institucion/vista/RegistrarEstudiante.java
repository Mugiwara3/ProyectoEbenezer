package com.company.Institucion.vista;

import com.company.Institucion.entidades.Estudiante;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class RegistrarEstudiante extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;

    public RegistrarEstudiante() {
        initComponents();
        // Inicialización del modelo y configuración de la tabla
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("EDAD");
        modelo.addColumn("CURSO");
        tabla1.setModel(modelo);

        // ABRIMOS EL FORMULARIO 2
        RegistrarPago tabla2 = new RegistrarPago();
        tabla2.setVisible(true);

        // Agregar escuchadores de eventos de teclado para validar entrada
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!validarLetras(String.valueOf(c))) {
                    evt.consume();
                }
            }
        });

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!validarLetras(String.valueOf(c))) {
                    evt.consume();
                }
            }
        });

        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!validarNumeros(String.valueOf(c))) {
                    evt.consume();
                }
            }
        });

        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!validarNumeros(String.valueOf(c))) {
                    evt.consume();
                }
            }
        });

        txtcurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!validarNumeros(String.valueOf(c))) {
                    evt.consume();
                }
            }
        });
    }

    public boolean validarLetras(String texto) {
        return texto.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+");
    }

    public boolean validarNumeros(String texto) {
        return texto.matches("\\d+");
    }

    public void nuevaTabla() {
        //Pasamos los datos y se limpia la primera tabla
        modelo = new DefaultTableModel();
        tabla1.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtcurso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("REGISTRAR ESTUDIANTE");

        jLabel1.setText("ID");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("APELLIDO");

        jLabel4.setText("EDAD");

        jLabel5.setText("CURSO");

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Registro.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtid)
                            .addComponent(txtnombre)
                            .addComponent(txtapellido)
                            .addComponent(txtedad)
                            .addComponent(txtcurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Obtener los datos ingresados por el usuario
        String id = txtid.getText();
        String nombre = txtnombre.getText();
        String apellido = txtapellido.getText();
        String edad = txtedad.getText();
        String curso = txtcurso.getText();

        // Verificar que se hayan ingresado todos los datos
        if (id.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || edad.isEmpty() || curso.isEmpty()) {
            // Mostrar un mensaje de advertencia o realizar alguna acción adecuada
            // (por ejemplo, mostrar un JOptionPane)
            return;
        }

        // Verificar si la identificación ya está registrada
        if (esIdRegistrada(id)) {
            JOptionPane.showMessageDialog(this, "La identificación ya está registrada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear un objeto Estudiante con los datos ingresados
        Estudiante estudiante = new Estudiante(id, nombre, apellido, edad, curso);

        // Agregar el objeto Estudiante al modelo de la tabla de estudiantes
        agregarEstudianteATabla(estudiante);
        // Guardar los datos en el archivo de texto
        guardarEnArchivo(id, nombre, apellido, edad, curso);

        // Limpiar los campos después de guardar
        limpiarCampos();


    }//GEN-LAST:event_jButton1ActionPerformed
    private boolean esIdRegistrada(String id) {
        // Recorrer las filas existentes para verificar si la identificación ya está registrada
        for (int i = 0; i < modelo.getRowCount(); i++) {
            if (modelo.getValueAt(i, 0).equals(id)) {
                return true; // La identificación ya está registrada
            }
        }
        return false; // La identificación no está registrada  
    }

    private void agregarEstudianteATabla(Estudiante estudiante) {
        // Agregar los datos del estudiante al modelo de la tabla
        Object[] filaEstudiante = {estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(), estudiante.getEdad(), estudiante.getCurso()};
        modelo.addRow(filaEstudiante);
    }

    private void guardarEnArchivo(String id, String nombre, String apellido, String edad, String curso) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos_estudiantes.txt", true))) {
            // Escribir los datos en el archivo
            writer.write(id + "," + nombre + "," + apellido + "," + edad + "," + curso);
            writer.newLine(); // Agregar nueva línea para el próximo conjunto de datos
        } catch (IOException e) {
            e.printStackTrace(); // Manejar la excepción apropiadamente en tu aplicación
        }
    }

    private void limpiarCampos() {
        txtid.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtedad.setText("");
        txtcurso.setText("");
        txtid.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcurso;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
