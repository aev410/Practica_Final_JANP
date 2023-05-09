/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.practica_final_janp.clases;

/**
 *
 * @author naimg
 */
public class Reparacion {
    
    private String Descripcion;
    private String fecha;
    private String Tiempo;
    private double totalReparacion;
    private Cliente c;
    private vehiculo v;

    public Reparacion(String Descripcion, String fecha, String Tiempo, double totalReparacion, Cliente c, vehiculo v) {
        this.Descripcion = Descripcion;
        this.fecha = fecha;
        this.Tiempo = Tiempo;
        this.totalReparacion = totalReparacion;
        this.c = c;
        this.v = v;
    }

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

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public vehiculo getV() {
        return v;
    }

    public void setV(vehiculo v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Reparacion{" + "Descripcion=" + Descripcion + ", fecha=" + fecha + ", Tiempo=" + Tiempo + ", totalReparacion=" + totalReparacion + ", c=" + c + ", v=" + v + '}';
    }

}
