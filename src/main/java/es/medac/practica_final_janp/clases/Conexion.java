/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.practica_final_janp.clases;

import es.medac.practica_final_janp.Interfaces.Menu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Conexion {
     protected Connection conexion;
    String URL = "jdbc:mysql://localhost:3306/PROYECTOENTORNOS";
    String usuario = "root";
    String contraseña = "1234";
    PreparedStatement ps; 
    ResultSet rs; 

    public Connection getConnection() {  //Esto hay que ponserlo siempre

        try {
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contraseña);
            JOptionPane.showMessageDialog(null,"Conexión a la base de datos establecida con éxito ");
            Menu menu = new Menu();
            menu.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);

        }
        return conexion;
    }
}
