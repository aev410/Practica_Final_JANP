/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.practica_final_janp.bd;

import com.mysql.cj.xdevapi.PreparableStatement;
import es.medac.practica_final_janp.clases.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class EliminarDatos {
    public void eliminarCliente(int idCliente) {
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
    }
    public void eliminarVehiculo(int idVehiculo) {
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
}

    
}

