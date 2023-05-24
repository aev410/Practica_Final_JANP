/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.practica_final_janp.bd;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Invitao
 */
public class Update {
  
    /**
     * Este método modifica un registro de la tabla cliente introduciendo el dni del cliente
     * 
     * @param dni
     * @param idCliente
     * @param nombre
     * @param apellidos
     * @param edad
     * @return filasModificadas
     */
    public int ModificarClientes(String dni, int idCliente, String nombre, String apellidos, int edad) {
        String consulta = "UPDATE cliente SET nombre = '" + nombre + "', apellidos = '" + apellidos + "', edad = '" + edad + "' where dni = '" + dni + "';";
        int filasModificadas = -1;
        ConexionSQL conexion = new ConexionSQL();
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            filasModificadas = ps.executeUpdate(consulta);
            
            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta modificar cliente." + e.getMessage());
        }
        return filasModificadas;
    }
    
    /**
     * Este método modifica un registro de la tabla reparacion introduciendo el idCliente y id Vehiculo
     * 
     * @param idVehiculo
     * @param idCliente
     * @param fecha
     * @param horas
     * @param totalReparacion
     * @return filasModificadas
     */
    public int ModificarReparacion(String idVehiculo, String idCliente, String fecha, String horas, int totalReparacion) {
        String consulta = "UPDATE reparacion SET fecha = '" + fecha + "', horas = '" + horas + "', totalReparacion = '"
                + totalReparacion + "' where idVehiculo = '" + idVehiculo + "' and idCliente = '" + idCliente + "';";
        int filasModificadas = -1;
        ConexionSQL conexion = new ConexionSQL();
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            filasModificadas = ps.executeUpdate(consulta);

            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta modificar reparacion." + e.getMessage());
        }
        return filasModificadas;
    }
    
    /**
     * Este método modifica un registro de la tabla vehiculo introduciendo el idVehiculo
     * 
     * @param idVehiculo
     * @param matricula
     * @param marca
     * @param modelo
     * @param año
     * @param color
     * @return filasModificadas
     */
    public int ModificarVehiculo(String idVehiculo, String matricula, String marca, String modelo, String año, String color) {
        String consulta = "UPDATE vehiculo SET marca = '" + marca + "', modelo = '" + modelo + "', año = '" 
                + año + "', color = '" + color + "' where matricula = '" + matricula +"'";
        int filasModificadas = -1;
        ConexionSQL conexion = new ConexionSQL();
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            filasModificadas = ps.executeUpdate(consulta);

            ps.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta modificar vehiculo." + e.getMessage());
        }
        return filasModificadas;
    }
    
}
