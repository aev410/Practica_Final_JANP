/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.practica_final_janp.Interfaces;

<<<<<<< HEAD
import es.medac.practica_final_janp.bd.InsertarDatos;
import es.medac.practica_final_janp.clases.Cliente;
import es.medac.practica_final_janp.clases.Vehiculo;
=======
import es.medac.practica_final_janp.bd.BorrarDatos;
>>>>>>> 3d4f8430b4453337736e1ec4ce397be8db504ecc

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
        jLabel2 = new javax.swing.JLabel();
        JBinsertar = new javax.swing.JButton();
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
        panel = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("PRUEBA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        JBinsertar.setText("Insert");
        JBinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBinsertarActionPerformed(evt);
            }
        });
        jPanel1.add(JBinsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Insertar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 24));

        jB_menu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jB_menu2.setText("Menu");
        jB_menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_menu2ActionPerformed(evt);
            }
        });
        jPanel1.add(jB_menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 160, 60));

        jCB_Tablas.setBackground(new java.awt.Color(255, 255, 204));
        jCB_Tablas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCB_Tablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Vehiculo", "Reparacion" }));
        jCB_Tablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_TablasActionPerformed(evt);
            }
        });
        jPanel1.add(jCB_Tablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 40));

        jLCliente_dni.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLCliente_dni.setText("DNI");
        jPanel1.add(jLCliente_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jTCliente_dni.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTCliente_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 100, 40));

        jTCliente_nombre.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTCliente_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 110, 40));

        jLCliente_nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLCliente_nombre.setText("nombre");
        jPanel1.add(jLCliente_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLCliente_apellido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLCliente_apellido.setText("Apellidos");
        jPanel1.add(jLCliente_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jTCliente_apellido.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTCliente_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, 40));

        jLCliente_edad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLCliente_edad.setText("edad");
        jPanel1.add(jLCliente_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        jTCliente_edad.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTCliente_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 80, 40));

        jTvehiculo_matricula.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTvehiculo_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 110, 40));

        jLVehiculo_matricula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLVehiculo_matricula.setText("Matricula");
        jPanel1.add(jLVehiculo_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLvehiculo_marca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLvehiculo_marca.setText("marca");
        jPanel1.add(jLvehiculo_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jTvehiculo_marca.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTvehiculo_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 90, 40));

        jLvehiculo_modelo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLvehiculo_modelo.setText("modelo");
        jPanel1.add(jLvehiculo_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jTvehiculo_modelo.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTvehiculo_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 90, 40));

        jLvehiculo_año.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLvehiculo_año.setText("año");
        jPanel1.add(jLvehiculo_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 50, -1));

        jTvehiculo_año.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTvehiculo_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 100, 40));

        jTVehiculo_color.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTVehiculo_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 90, 40));

        jLVehiculo_color.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLVehiculo_color.setText("Color");
        jPanel1.add(jLVehiculo_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jLReparacion_descripcion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLReparacion_descripcion.setText("Descripcion");
        jPanel1.add(jLReparacion_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jTReparacion_descripcion.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTReparacion_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, 40));

        jLReparacion_idcliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLReparacion_idcliente.setText("IDCliente");
        jPanel1.add(jLReparacion_idcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jTReparacion_idcliente.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTReparacion_idcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 80, 40));

        jLReparacion_idvehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLReparacion_idvehiculo.setText("IDVehiculo");
        jPanel1.add(jLReparacion_idvehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jTReparacion_idvehiculo.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTReparacion_idvehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 90, 40));

        jLReparacion_fecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLReparacion_fecha.setText("Fecha");
        jPanel1.add(jLReparacion_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jTReparacion_fecha.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTReparacion_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 60, 40));

        jLReparacion_tiempo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLReparacion_tiempo.setText("Tiempo");
        jPanel1.add(jLReparacion_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jTReparacion_tiempo.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTReparacion_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 80, 40));

        jLReparacion_total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLReparacion_total.setText("TotalReparacioin");
        jPanel1.add(jLReparacion_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jTReparacion_total.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jTReparacion_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 120, 40));

        panel.setColumns(20);
        panel.setRows(5);
        jScrollPane1.setViewportView(panel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 340, 160));

        jTextField1.setBackground(new java.awt.Color(0, 153, 255));
        jTextField1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 230));

        jTextField2.setBackground(new java.awt.Color(0, 102, 204));
        jTextField2.setText("jTextField2");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 310));

        jTextField3.setBackground(new java.awt.Color(0, 102, 153));
        jTextField3.setText("jTextField3");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        jTextField4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_menu2ActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_jB_menu2ActionPerformed

    private void JBinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBinsertarActionPerformed
        // TODO add your handling code here:
        InsertarDatos i = new InsertarDatos();
        if (jCB_Tablas.getSelectedItem().equals("Cliente")) {
            String dni = "";
            String nombre = "";
            String apellido = "";
            int edad = 0;
            try {
                dni = jTCliente_dni.getText();
                nombre = jTCliente_nombre.getText();
                apellido = jTCliente_apellido.getText();
                edad = Integer.parseInt(jTCliente_edad.getText());
                Cliente c = new Cliente(0, nombre, apellido, edad, dni);
                panel.setText(i.insertarCliente(c));
            } catch (Exception e) {
                panel.setText("Error " + e);
            }
        } else if (jCB_Tablas.getSelectedItem().equals("Vehiculo")) {
            String matricula = "";
            String marca = "";
            String modelo = "";
            int año = o;
            String color = "";
            try {
                matricula = jTvehiculo_matricula.getText();
                marca = jTvehiculo_marca.getText();
                modelo = jTvehiculo_modelo.getText();
                anio = Integer.parseInt(jTvehiculo_año.getText());
                color = jTVehiculo_color.getText();
                Vehiculo v = new Vehiculo(0, matricula, marca, modelo, año, color);
                panel.setText(i.insertarVehiculo(v));
            } catch (Exception e) {
                panel.setText("Error " + e);
            }
        } else if (jCB_Tablas.getSelectedItem().equals("Reparacion")) {

<<<<<<< HEAD
        }
    }//GEN-LAST:event_JBinsertarActionPerformed

    private void jCB_TablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_TablasActionPerformed
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_jCB_TablasActionPerformed

    public void mostrar() {
=======
    private void jTvehiculo_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTvehiculo_matriculaActionPerformed
      
    }//GEN-LAST:event_jTvehiculo_matriculaActionPerformed

    private void jTReparacion_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTReparacion_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTReparacion_descripcionActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCB_TablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_TablasActionPerformed
       
    }//GEN-LAST:event_jCB_TablasActionPerformed

    private void JBinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBinsertarActionPerformed
        BorrarDatos b = new BorrarDatos();
        if (jCB_Tablas.getSelectedItem().equals("Cliente")) {
    }
    
    }//GEN-LAST:event_JBinsertarActionPerformed

    public void mostrar(){
>>>>>>> 3d4f8430b4453337736e1ec4ce397be8db504ecc
        if (jCB_Tablas.getSelectedItem().equals("Cliente")) {
            jLCliente_nombre.setVisible(true);
            jTCliente_nombre.setVisible(true);
            jLCliente_dni.setVisible(true);
            jTCliente_dni.setVisible(true);
            jLCliente_apellido.setVisible(true);
            jTCliente_apellido.setVisible(true);
            jTCliente_edad.setVisible(true);
            jLCliente_edad.setVisible(true);

            jLVehiculo_color.setVisible(false);
            jTVehiculo_color.setVisible(false);
            jLVehiculo_matricula.setVisible(false);
            jTvehiculo_matricula.setVisible(false);
            jTvehiculo_marca.setVisible(false);
            jLvehiculo_marca.setVisible(false);
            jTvehiculo_modelo.setVisible(false);
            jLvehiculo_modelo.setVisible(false);
            jTvehiculo_año.setVisible(false);
            jLvehiculo_año.setVisible(false);

            jLReparacion_descripcion.setVisible(false);
            jTReparacion_descripcion.setVisible(false);
            jLReparacion_fecha.setVisible(false);
            jTReparacion_fecha.setVisible(false);
            jTReparacion_idcliente.setVisible(false);
            jLReparacion_idcliente.setVisible(false);
            jTReparacion_idvehiculo.setVisible(false);
            jLReparacion_idvehiculo.setVisible(false);
            jTReparacion_tiempo.setVisible(false);
            jLReparacion_tiempo.setVisible(false);
            jTReparacion_total.setVisible(false);
            jLReparacion_total.setVisible(false);
        } else if (jCB_Tablas.getSelectedItem().equals("Vehiculo")) {
            jLCliente_nombre.setVisible(false);
            jTCliente_nombre.setVisible(false);
            jLCliente_dni.setVisible(false);
            jTCliente_dni.setVisible(false);
            jLCliente_apellido.setVisible(false);
            jTCliente_apellido.setVisible(false);
            jTCliente_edad.setVisible(false);
            jLCliente_edad.setVisible(false);

            jLVehiculo_color.setVisible(true);
            jTVehiculo_color.setVisible(true);
            jLVehiculo_matricula.setVisible(true);
            jTvehiculo_matricula.setVisible(true);
            jTvehiculo_marca.setVisible(true);
            jLvehiculo_marca.setVisible(true);
            jTvehiculo_modelo.setVisible(true);
            jLvehiculo_modelo.setVisible(true);
            jTvehiculo_año.setVisible(true);
            jLvehiculo_año.setVisible(true);

            jLReparacion_descripcion.setVisible(false);
            jTReparacion_descripcion.setVisible(false);
            jLReparacion_fecha.setVisible(false);
            jTReparacion_fecha.setVisible(false);
            jTReparacion_idcliente.setVisible(false);
            jLReparacion_idcliente.setVisible(false);
            jTReparacion_idvehiculo.setVisible(false);
            jLReparacion_idvehiculo.setVisible(false);
            jTReparacion_tiempo.setVisible(false);
            jLReparacion_tiempo.setVisible(false);
            jTReparacion_total.setVisible(false);
            jLReparacion_total.setVisible(false);
        } else if (jCB_Tablas.getSelectedItem().equals("Reparacion")) {
            jLCliente_nombre.setVisible(false);
            jTCliente_nombre.setVisible(false);
            jLCliente_dni.setVisible(false);
            jTCliente_dni.setVisible(false);
            jLCliente_apellido.setVisible(false);
            jTCliente_apellido.setVisible(false);
            jTCliente_edad.setVisible(false);
            jLCliente_edad.setVisible(false);

            jLVehiculo_color.setVisible(false);
            jTVehiculo_color.setVisible(false);
            jLVehiculo_matricula.setVisible(false);
            jTvehiculo_matricula.setVisible(false);
            jTvehiculo_marca.setVisible(false);
            jLvehiculo_marca.setVisible(false);
            jTvehiculo_modelo.setVisible(false);
            jLvehiculo_modelo.setVisible(false);
            jTvehiculo_año.setVisible(false);
            jLvehiculo_año.setVisible(false);

            jLReparacion_descripcion.setVisible(true);
            jTReparacion_descripcion.setVisible(true);
            jLReparacion_fecha.setVisible(true);
            jTReparacion_fecha.setVisible(true);
            jTReparacion_idcliente.setVisible(true);
            jLReparacion_idcliente.setVisible(true);
            jTReparacion_idvehiculo.setVisible(true);
            jLReparacion_idvehiculo.setVisible(true);
            jTReparacion_tiempo.setVisible(true);
            jLReparacion_tiempo.setVisible(true);
            jTReparacion_total.setVisible(true);
            jLReparacion_total.setVisible(true);
        }
    }

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
    private javax.swing.JButton JBinsertar;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTvehiculo_año;
    private javax.swing.JTextField jTvehiculo_marca;
    private javax.swing.JTextField jTvehiculo_matricula;
    private javax.swing.JTextField jTvehiculo_modelo;
    private javax.swing.JTextArea panel;
    // End of variables declaration//GEN-END:variables
}
