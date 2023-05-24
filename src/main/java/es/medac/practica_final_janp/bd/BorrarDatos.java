/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.practica_final_janp.bd;

import java.sql.*;

/**
 *
 * @author naimg
 */
public class BorrarDatos {
    public String borrarXdni(String dni){
        int filasBorradas = -1;
        ConexionSQL con = new ConexionSQL();
        String consulta = "delete from cliente where dni '"+dni+"'";
        String resultado = "";
        try{
            PreparedStatement ps = con.getConexion().prepareStatement(consulta);
            filasBorradas = ps.executeUpdate(consulta);
                resultado = "CLIENTE ELIMINADO CON DNI: "+ dni;
        }catch(SQLException e){
            resultado = "ERROR ELIMINAR CLIENTE "+e;
        }
        return resultado;
    }
    public String borrarXmatricula(String matricula){
        String resultado = "";
        int filasBorradas = -1;
        ConexionSQL con = new ConexionSQL();
        String consulta = "Delete from Vehiculo where matricula = '"+matricula+"'";
        try{
            PreparedStatement ps = con.getConexion().prepareStatement(consulta);
            filasBorradas = ps.executeUpdate(consulta);
             resultado = "VEHICULO ELIMINADO CON MATRICULA: "+matricula;
        }catch(SQLException e){
            resultado = "ERROR ELIMINAR VEHICULO: "+e;
        }
        return resultado;
    }
    public String borrarXidVehiculo(int idVehiculo){
        String resultado="";
        int filasBorradas = -1;
        ConexionSQL cone = new ConexionSQL();
        String consulta = "delete from Reparacion where idVehiculo: '"+idVehiculo+"'";
        try{
            PreparedStatement ps = cone.getConexion().prepareStatement(consulta);
            filasBorradas = ps.executeUpdate(consulta);
            resultado = "REPARACION ELIMINADO CON ID VEHICULO= "+idVehiculo;
        }catch(SQLException e){
            resultado = "ERROR ELIMINAR REPARACION: "+e;
        }
        return resultado;
    }
}
