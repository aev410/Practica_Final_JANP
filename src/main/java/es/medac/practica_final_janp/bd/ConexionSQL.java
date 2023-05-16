/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.practica_final_janp.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pipoa
 */
public class ConexionSQL {
    protected Connection conexion;
    private final String URL = "jdbc:mysql://localhost/proyectoentornos";
    private final String USUARIO = "root";
    private final String PASSWORD = "";

    /**
     *
     */
    public ConexionSQL() {
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            //System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println("Error al abrir la conexion "+e);
        }
    }

        public Connection getConexion() {
        return conexion;
    }

    public void cerrar() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
               // System.out.println("Se ha cerrado la conexión a la BD.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion "+e);
        }
    }
}
