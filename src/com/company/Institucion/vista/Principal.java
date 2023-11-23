package com.company.Institucion.vista;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        RegistrarEstudiante = new javax.swing.JMenuItem();
        RegistrarPagos = new javax.swing.JMenuItem();
        ConsultarPagos = new javax.swing.JMenuItem();
        ConsultarPansion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU DE LA INSTITUCION EVANGELICA EBENEZER");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ebenezer.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Wide Latin", 3, 12)); // NOI18N
        jLabel2.setText("INSTITUCION EDUCATIVA EVANGELICA EBENEZER");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100))))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("MENU");

        RegistrarEstudiante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        RegistrarEstudiante.setText("Registrar Estudiante");
        RegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEstudianteActionPerformed(evt);
            }
        });
        jMenu1.add(RegistrarEstudiante);

        RegistrarPagos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        RegistrarPagos.setText("Registrar Pagos");
        RegistrarPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarPagosActionPerformed(evt);
            }
        });
        jMenu1.add(RegistrarPagos);

        ConsultarPagos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ConsultarPagos.setText("Consultar Pagos");
        ConsultarPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarPagosActionPerformed(evt);
            }
        });
        jMenu1.add(ConsultarPagos);

        ConsultarPansion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ConsultarPansion.setText("Consultar Pension");
        ConsultarPansion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarPansionActionPerformed(evt);
            }
        });
        jMenu1.add(ConsultarPansion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEstudianteActionPerformed
        RegistrarEstudiante verventana = new RegistrarEstudiante();
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_RegistrarEstudianteActionPerformed

    private void RegistrarPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarPagosActionPerformed
        RegistrarPago verventana = new RegistrarPago();
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_RegistrarPagosActionPerformed

    private void ConsultarPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarPagosActionPerformed
        ConsultarPago verventana = new ConsultarPago();
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_ConsultarPagosActionPerformed
 
    private void ConsultarPansionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarPansionActionPerformed
ConsultarPension verventana = new ConsultarPension();
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_ConsultarPansionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ConsultarPagos;
    private javax.swing.JMenuItem ConsultarPansion;
    private javax.swing.JMenuItem RegistrarEstudiante;
    private javax.swing.JMenuItem RegistrarPagos;
    private javax.swing.JPanel escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
