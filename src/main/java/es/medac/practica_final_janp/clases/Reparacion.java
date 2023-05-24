/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.practica_final_janp.clases;

/**
 * Se crean las variables de la clase
 * reparacion
 * @author naimg
 */
public class Reparacion {
    private String Descripcion;
    private String fecha;
    private String Tiempo;
    private double totalReparacion;
    private int idCliente;
    private int idVehiculo;
    /**
     * Se crea el constructor con parametros
     * @param idReparacion
     * @param Descripcion
     * @param fecha
     * @param Tiempo
     * @param totalReparacion
     * @param idCliente
     * @param idVehiculo 
     */
    public Reparacion(int idReparacion, String Descripcion, String fecha, String Tiempo, 
            double totalReparacion, int idCliente, int idVehiculo) {
        this.Descripcion = Descripcion;
        this.fecha = fecha;
        this.Tiempo = Tiempo;
        this.totalReparacion = totalReparacion;
        this.idCliente = idCliente;
        this.idVehiculo = idVehiculo;
    }
    /**
     * Se crea el constructor vacio
     */
    public Reparacion(){
        super();
    }
    /**
     * Se crean los getters y setters
     */
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String Tiempo) {
        this.Tiempo = Tiempo;
    }

    public double getTotalReparacion() {
        return totalReparacion;
    }

    public void setTotalReparacion(double totalReparacion) {
        this.totalReparacion = totalReparacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    /**
     * Se crea el metodo toString que nos muestra un resumen de la clase con sus atributos
     * @return resumen de la clase
     */
    @Override
    public String toString() {
        return "Reparacion{" + "Descripcion=" + Descripcion + ", fecha=" + fecha + ", Tiempo=" + Tiempo + ", totalReparacion=" + totalReparacion + ", idCliente=" + idCliente + ", idVehiculo=" + idVehiculo + '}';
    }
}
