/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.practica_final_janp.Interfaces;

/**
 *
 * @author pipoa
 */
public class InterfazInsertar extends javax.swing.JFrame {

    /**
     * Creates new form InterfazInsertar
     */
    public InterfazInsertar() {
        initComponents();
        
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jB_menu2 = new javax.swing.JButton();
        jCB_Tablas = new javax.swing.JComboBox<>();
        jLCliente_dni = new javax.swing.JLabel();
        jTCliente_dni = new javax.swing.JTextField();
        jTCliente_nombre = new javax.swing.JTextField();
        jLCliente_nombre = new javax.swing.JLabel();
        jLCliente_apellido = new javax.swing.JLabel();
        jTCliente_apellido = new javax.swing.JTextField();
        jLCliente_edad = new javax.swing.JLabel();
        jTCliente_edad = new javax.swing.JTextField();
        jTvehiculo_matricula = new javax.swing.JTextField();
        jLVehiculo_matricula = new javax.swing.JLabel();
        jLvehiculo_marca = new javax.swing.JLabel();
        jTvehiculo_marca = new javax.swing.JTextField();
        jLvehiculo_modelo = new javax.swing.JLabel();
        jTvehiculo_modelo = new javax.swing.JTextField();
        jLvehiculo_año = new javax.swing.JLabel();
        jTvehiculo_año = new javax.swing.JTextField();
        jTVehiculo_color = new javax.swing.JTextField();
        jLVehiculo_color = new javax.swing.JLabel();
        jLReparacion_descripcion = new javax.swing.JLabel();
        jTReparacion_descripcion = new javax.swing.JTextField();
        jLReparacion_idcliente = new javax.swing.JLabel();
        jTReparacion_idcliente = new javax.swing.JTextField();
        jLReparacion_idvehiculo = new javax.swing.JLabel();
        jTReparacion_idvehiculo = new javax.swing.JTextField();
        jLReparacion_fecha = new javax.swing.JLabel();
        jTReparacion_fecha = new javax.swing.JTextField();
        jLReparacion_tiempo = new javax.swing.JLabel();
        jTReparacion_tiempo = new javax.swing.JTextField();
        jLReparacion_total = new javax.swing.JLabel();
        jTReparacion_total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setText("Insertar");

        jB_menu2.setText("Menu");
        jB_menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_menu2ActionPerformed(evt);
            }
        });

        jCB_Tablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Vehiculo", "Reparacion" }));

        jLCliente_dni.setText("DNI");

        jTCliente_dni.setText("dni");
        jTCliente_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCliente_dniActionPerformed(evt);
            }
        });

        jTCliente_nombre.setText("nombre");

        jLCliente_nombre.setText("nombre");

        jLCliente_apellido.setText("Apellidos");

        jTCliente_apellido.setText("Apellido");

        jLCliente_edad.setText("edad");

        jTCliente_edad.setText("edad");

        jTvehiculo_matricula.setText("Matricula");
        jTvehiculo_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTvehiculo_matriculaActionPerformed(evt);
            }
        });

        jLVehiculo_matricula.setText("Matricula");

        jLvehiculo_marca.setText("marca");

        jTvehiculo_marca.setText("marca");

        jLvehiculo_modelo.setText("modelo");

        jTvehiculo_modelo.setText("modelo");

        jLvehiculo_año.setText("año");

        jTvehiculo_año.setText("año");

        jTVehiculo_color.setText("color");

        jLVehiculo_color.setText("Color");

        jLReparacion_descripcion.setText("Descripcion");

        jTReparacion_descripcion.setText("descripcion");
        jTReparacion_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTReparacion_descripcionActionPerformed(evt);
            }
        });

        jLReparacion_idcliente.setText("IDCliente");

        jTReparacion_idcliente.setText("IDCliente");

        jLReparacion_idvehiculo.setText("IDVehiculo");

        jTReparacion_idvehiculo.setText("IDVehiculo");

        jLReparacion_fecha.setText("Fecha");

        jTReparacion_fecha.setText("fecha");

        jLReparacion_tiempo.setText("Tiempo");

        jTReparacion_tiempo.setText("tiempo");

        jLReparacion_total.setText("TotalReparacioin");

        jTReparacion_total.setText("total reparacion");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_menu2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLReparacion_descripcion)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLReparacion_idcliente)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLReparacion_idvehiculo)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLReparacion_fecha))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTReparacion_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTReparacion_idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTReparacion_idvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTReparacion_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTReparacion_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLReparacion_tiempo)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLVehiculo_matricula)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLvehiculo_marca)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLvehiculo_modelo)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLvehiculo_año))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jTvehiculo_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTvehiculo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTvehiculo_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTvehiculo_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jCB_Tablas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLCliente_dni)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLCliente_nombre)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLCliente_apellido)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLCliente_edad))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTCliente_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTCliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTCliente_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTCliente_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTVehiculo_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLVehiculo_color))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLReparacion_total)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jTReparacion_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCliente_dni)
                    .addComponent(jLCliente_nombre)
                    .addComponent(jLCliente_apellido)
                    .addComponent(jLCliente_edad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB_Tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCliente_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCliente_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCliente_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLVehiculo_matricula)
                    .addComponent(jLvehiculo_marca)
                    .addComponent(jLvehiculo_modelo)
                    .addComponent(jLvehiculo_año)
                    .addComponent(jLVehiculo_color))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTvehiculo_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTvehiculo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTvehiculo_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTvehiculo_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTVehiculo_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLReparacion_descripcion)
                            .addComponent(jLReparacion_idcliente)
                            .addComponent(jLReparacion_idvehiculo)
                            .addComponent(jLReparacion_fecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTReparacion_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTReparacion_idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTReparacion_idvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTReparacion_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLReparacion_tiempo)
                            .addComponent(jLReparacion_total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTReparacion_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTReparacion_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jB_menu2)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_menu2ActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_jB_menu2ActionPerformed

    private void jTCliente_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCliente_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCliente_dniActionPerformed

    private void jTvehiculo_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTvehiculo_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTvehiculo_matriculaActionPerformed

    private void jTReparacion_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTReparacion_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTReparacion_descripcionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazInsertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_menu2;
    private javax.swing.JComboBox<String> jCB_Tablas;
    private javax.swing.JLabel jLCliente_apellido;
    private javax.swing.JLabel jLCliente_dni;
    private javax.swing.JLabel jLCliente_edad;
    private javax.swing.JLabel jLCliente_nombre;
    private javax.swing.JLabel jLReparacion_descripcion;
    private javax.swing.JLabel jLReparacion_fecha;
    private javax.swing.JLabel jLReparacion_idcliente;
    private javax.swing.JLabel jLReparacion_idvehiculo;
    private javax.swing.JLabel jLReparacion_tiempo;
    private javax.swing.JLabel jLReparacion_total;
    private javax.swing.JLabel jLVehiculo_color;
    private javax.swing.JLabel jLVehiculo_matricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLvehiculo_año;
    private javax.swing.JLabel jLvehiculo_marca;
    private javax.swing.JLabel jLvehiculo_modelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCliente_apellido;
    private javax.swing.JTextField jTCliente_dni;
    private javax.swing.JTextField jTCliente_edad;
    private javax.swing.JTextField jTCliente_nombre;
    private javax.swing.JTextField jTReparacion_descripcion;
    private javax.swing.JTextField jTReparacion_fecha;
    private javax.swing.JTextField jTReparacion_idcliente;
    private javax.swing.JTextField jTReparacion_idvehiculo;
    private javax.swing.JTextField jTReparacion_tiempo;
    private javax.swing.JTextField jTReparacion_total;
    private javax.swing.JTextField jTVehiculo_color;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTvehiculo_año;
    private javax.swing.JTextField jTvehiculo_marca;
    private javax.swing.JTextField jTvehiculo_matricula;
    private javax.swing.JTextField jTvehiculo_modelo;
    // End of variables declaration//GEN-END:variables
}
