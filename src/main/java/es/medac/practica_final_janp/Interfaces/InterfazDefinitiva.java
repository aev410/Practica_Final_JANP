/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.medac.practica_final_janp.Interfaces;

import es.medac.practica_final_janp.bd.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import es.medac.practica_final_janp.clases.*;

/**
 *
 * @author Usuario
 */
public class InterfazDefinitiva extends javax.swing.JFrame {

    /**
     * Creates new form InterfazDefinitiva
     */
    public InterfazDefinitiva() {
        initComponents();
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
        Boton_BorrarVehiculo = new javax.swing.JButton();
        Boton_EliminarCliente = new javax.swing.JButton();
        Select_ClienteDNI = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_BorrarVehiculo.setText("ELIMINAR VEHICULO");
        Boton_BorrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BorrarVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_BorrarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        Boton_EliminarCliente.setText("ELIMINAR CLIENTE");
        Boton_EliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EliminarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(Boton_EliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 140, -1));

        Select_ClienteDNI.setText("jButton1");
        Select_ClienteDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_ClienteDNIActionPerformed(evt);
            }
        });
        jPanel1.add(Select_ClienteDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 130, -1));

        jTextField1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 749, 458));

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

    private void Boton_BorrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BorrarVehiculoActionPerformed
      int idVehiculo = 1;
        ConexionSQL conexion = new ConexionSQL(); // Creo la conexión a la BD
    String consulta = "DELETE FROM vehiculo WHERE idVehiculo = "+idVehiculo;

    try {
        PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);

        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            System.out.println("Vehículo eliminado correctamente");
        } else {
            System.out.println("No se encontró el vehículo o no se pudo eliminar");
        }

        ps.close();
        conexion.cerrar();
    } catch (SQLException e) {
        System.out.println("Error al eliminar el vehículo: " + e.getMessage());
    }
    }//GEN-LAST:event_Boton_BorrarVehiculoActionPerformed

    private void Boton_EliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EliminarClienteActionPerformed
       int idCliente = 1;
        ConexionSQL conexion = new ConexionSQL(); // Creo la conexión a la BD
        String consulta = "DELETE FROM cliente WHERE idCliente = "+idCliente;
//Hacemos que idCliente entre por parámetro y sería el que eliminamos
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
           

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Cliente eliminado correctamente");
            } else {
                System.out.println("No se encontró el cliente o no se pudo eliminar");
            }

            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el cliente: " + e.getMessage());
        }
    }//GEN-LAST:event_Boton_EliminarClienteActionPerformed

    private void Select_ClienteDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_ClienteDNIActionPerformed
      
    }//GEN-LAST:event_Select_ClienteDNIActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazDefinitiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazDefinitiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazDefinitiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazDefinitiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazDefinitiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_BorrarVehiculo;
    private javax.swing.JButton Boton_EliminarCliente;
    private javax.swing.JButton Select_ClienteDNI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
