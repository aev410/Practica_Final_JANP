/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.practica_final_janp.bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Invitao
 */
public class ConsultasDatos {
    
    public String SelectClienteDni(String dni) {
        ConexionSQL conexion = new ConexionSQL(); // Creo la conexion a la BD
        String consulta = "SELECT * from cliente WHERE dni = '" + dni + "'";
        String cliente = "";
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            System.out.println("******* TABLA CLIENTE *******");
            System.out.println("idCliente,dni,nombre,apellido,edad");
            while (rs.next()) {
                cliente += rs.getString("idAutor") + "," + rs.getString("dni") + "," +
                        rs.getString("nombre") + "," + rs.getString("apellido") + "," +
                        rs.getString("edad");
            }
            ps.close();
            rs.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta obtener clientes por dni " + e.getMessage());
        }
        return cliente;
    }
    
    public String SelectClienteNombre(String nombre, String apellidos) {
        ConexionSQL conexion = new ConexionSQL(); // Creo la conexion a la BD
        String consulta = "SELECT * from cliente WHERE nombre = '" + nombre + "' and apellidos = '" + apellidos + "'";
        String cliente = "";
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            System.out.println("******* TABLA CLIENTE *******");
            System.out.println("idCliente,dni,nombre,apellido,edad");
            while (rs.next()) {
                cliente += rs.getString("idAutor") + "," + rs.getString("dni") + "," +
                        rs.getString("nombre") + "," + rs.getString("apellido") + "," +
                        rs.getString("edad");
            }
            ps.close();
            rs.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta obtener clientes por nombre y apellidos" + e.getMessage());
        }
        return cliente;
    }
    
    public String SelectVehiculo(String matricula) {
        ConexionSQL conexion = new ConexionSQL(); // Creo la conexion a la BD
        String consulta = "SELECT * from vehiculo WHERE matricula = '" + matricula + "'";
        String vehiculo = "";
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            System.out.println("******* TABLA VEHICULO *******");
            System.out.println("idVehiculo,matricula,marca,modelo,año,color");
            while (rs.next()) {
                vehiculo += rs.getString("idVehiculo") + "," + rs.getString("matricula") + "," +
                        rs.getString("marca") + "," + rs.getString("modelo") + "," +
                        rs.getString("año") + "," + rs.getString("color");
            }
            ps.close();
            rs.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta obtener vehiculo por matricula" + e.getMessage());
        }
        return vehiculo;
    }
    
    public String SelectVehiculoMarcaModelo(String marca, String modelo) {
        ConexionSQL conexion = new ConexionSQL(); // Creo la conexion a la BD
        String consulta = "SELECT * from vehiculo WHERE marca = '" + marca + "' and modelo = '" + modelo + "'";
        String vehiculo = "";
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            System.out.println("******* TABLA VEHICULO *******");
            System.out.println("idVehiculo,matricula,marca,modelo,año,color");
            while (rs.next()) {
                vehiculo += rs.getString("idVehiculo") + "," + rs.getString("matricula") + "," +
                        rs.getString("marca") + "," + rs.getString("modelo") + "," +
                        rs.getString("año") + "," + rs.getString("color");
            }
            ps.close();
            rs.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta obtener vehiculo por marca y modelo" + e.getMessage());
        }
        return vehiculo;
    }
    
    public String SelectVehiculoMarcaModeloAnio(String marca, String modelo, int anio) {
        ConexionSQL conexion = new ConexionSQL(); // Creo la conexion a la BD
        String consulta = "SELECT * from vahiculo WHERE marca = '" + marca + "' and modelo = '" + 
                modelo + "' and anio = '" + anio + "'";
        String vehiculo = "";
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            System.out.println("******* TABLA VEHICULO *******");
            System.out.println("idVehiculo,matricula,marca,modelo,año,color");
            while (rs.next()) {
                vehiculo += rs.getString("idVehiculo") + "," + rs.getString("matricula") + "," +
                        rs.getString("marca") + "," + rs.getString("modelo") + "," +
                        rs.getString("año") + "," + rs.getString("color");
            }
            ps.close();
            rs.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta obtener vehiculo por marca, modelo y año" + e.getMessage());
        }
        return vehiculo;
    }
    
    public String SelectReparacionPorCliente(String dni) {
        ConexionSQL conexion = new ConexionSQL(); // Creo la conexion a la BD
        String consulta = "SELECT r.idVehiculo, r.idCliente, r.fecha, r.tiempo, r.totalReparacion from reparacion r"
                + " INNER JOIN cliente c ON r.idCliente = c.idCliente WHERE c.dni = '" + dni + "'";
        String cliente = "";
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            System.out.println("******* TABLA REPARACION *******");
            System.out.println("IdVehiculo,idCliente,fecha,tiempo,totalReparacion");
            while (rs.next()) {
                cliente += rs.getString("idVehiculo") + "," + rs.getString("idCliente") + "," +
                        rs.getString("fecha") + "," + rs.getString("tiempo") + "," +
                        rs.getString("totalReparacion");
            }
            ps.close();
            rs.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta obtener reparacion por dni " + e.getMessage());
        }
        return cliente;
    }
    
    public String SelectReparacionPorVehiculo(String matricula) {
        ConexionSQL conexion = new ConexionSQL(); // Creo la conexion a la BD
        String consulta = "SELECT r.idVehiculo, r.idCliente, r.fecha, r.tiempo, r.totalReparacion from reparacion r"
                + " INNER JOIN vehiculo v ON r.idVehiculo = c.idVehiculo WHERE v.matricula = '" + matricula + "'";
        String cliente = "";
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            System.out.println("******* TABLA REPARACION *******");
            System.out.println("IdVehiculo,idCliente,fecha,tiempo,totalReparacion");
            while (rs.next()) {
                cliente += rs.getString("idVehiculo") + "," + rs.getString("idCliente") + "," +
                        rs.getString("fecha") + "," + rs.getString("tiempo") + "," +
                        rs.getString("totalReparacion");
            }
            ps.close();
            rs.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta obtener reparacion por matricula " + e.getMessage());
        }
        return cliente;
    }
    
    public String SelectReparacionPorFecha(String fecha) {
        ConexionSQL conexion = new ConexionSQL(); // Creo la conexion a la BD
        String consulta = "SELECT * from reparacion WHERE fecha = '" + fecha + "'";
        String cliente = "";
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            System.out.println("******* TABLA REPARACION *******");
            System.out.println("IdVehiculo,idCliente,fecha,tiempo,totalReparacion");
            while (rs.next()) {
                cliente += rs.getString("idVehiculo") + "," + rs.getString("idCliente") + "," +
                        rs.getString("fecha") + "," + rs.getString("tiempo") + "," +
                        rs.getString("totalReparacion");
            }
            ps.close();
            rs.close();
            conexion.cerrar();
        } catch (SQLException e) {
            System.out.println("Error consulta obtener reparacion por fecha " + e.getMessage());
        }
        return cliente;
    }
}
