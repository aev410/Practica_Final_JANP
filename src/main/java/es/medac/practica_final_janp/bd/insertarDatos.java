/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.practica_final_janp.bd;

import com.mysql.cj.xdevapi.PreparableStatement;
import es.medac.practica_final_janp.clases.*;
import java.sql.*;


/**
 *
 * @author naimg
 */
public class insertarDatos {
    
    public int ultimoId(String tabla, String idtabla){
        int id = 0;
        ConexionSQL conexion = new ConexionSQL();
        String consulta = "SELECT "+ idtabla +" FROM "+ tabla +" ORDER BY "+ idtabla +" DESC LIMIT 1";
        
        try {
            PreparedStatement ps = conexion.getConexion().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = Integer.parseInt(rs.getString(idtabla));
            }
            
            System.out.println("El ultimo id es: "+ id);
            ps.close();
            conexion.cerrar();
            
        } catch (SQLException e) {
            System.out.println("Error consulta ultimo id "+e.getMessage());
        }
        return id;
    }
    
    public String insertarCliente(Cliente c){
        Cliente c1 = c;
        int filasAfectadas = -1;
        int id = ultimoId("Cliente", "idCliente")+1;
        ConexionSQL con = new ConexionSQL();
        String resultado = "";
        String consulta = "insert into cliente(IDCliente, DNI, nombre, Apellidos, Edad) values('"
                +id+"', '"+c1.getDni()+"', '"+c1.getNombre()+"', '"+c1.getApellidos()+"', '"+c1.getEdad()+"')";
        try{
            PreparedStatement ps = con.getConexion().prepareStatement(consulta);
            filasAfectadas = ps.executeUpdate(consulta);
            resultado = "REGISTRO INSERTADO "+ id+ ", "+c1.toString();
        }catch(SQLException e){
            resultado = "ERROR INSERTAR CLIENTE "+e.getMessage();
        }
        return resultado;
    }
    public String insertarVehiculo(Vehiculo v){
        Vehiculo v1 = v;
        int filasAfectadas = -1;
        int id = ultimoId("Vehiculo", "idVehiculo")+1;
        ConexionSQL con = new ConexionSQL();
        String resultado = "";
        String consulta = "insert into vehiculo(IDVehiculo, matricula, marca, modelo, año, color) values('"
                +id+"', '"+v1.getMatricula()+"', '"+v1.getMarca()+"', '"+v1.getModelo()+"', '"+v1.getAño()+"', '"+v1.getColor()+"')";
        try{
            PreparedStatement ps = con.getConexion().prepareStatement(consulta);
            filasAfectadas = ps.executeUpdate(consulta);
            resultado = "REGISTRO INSERTADO "+ id+ ", "+v1.toString();
        }catch(SQLException e){
            resultado = "ERROR INSERTAR VEHICULO : "+e.getMessage();
        }
        return resultado;
    }
    public String insertarReparacion(Reparacion r){
        Reparacion r1 = r;
        int filasAfectadas = -1;
        ConexionSQL con = new ConexionSQL();
        String resultado = "";
        String consulta ="insert into Reparacion(Descripcion, IDVehiculo, IDCliente, Fecha, Tiempo, totalReparacion) values('"
                +r1.getDescripcion()+ ", "+r1.getIdVehiculo()+ ", "+r1.getIdCliente()+ ", "+r1.getFecha()+ ", "
                +r1.getTiempo()+ ", "+r1.getTotalReparacion();
        try{
            PreparedStatement ps = con.getConexion().prepareStatement(consulta);
            filasAfectadas = ps.executeUpdate(consulta);
            resultado = "REGISTRO INSERTADO: "+r1.toString();
        }catch(SQLException e){
            resultado = "ERROR INSERTAR REPARACION: "+e.getMessage();
        }
        return resultado;
    }
}
