/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.practica_final_janp.clases;

/**
 *
 * @author naimg
 */
public class Cliente {
    private int idCliente;
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Cliente(){
        this.dni = "";
        this.idCliente = 0;
        this.apellidos="";
        this.nombre = "";
        this.edad = 0;
    }
    
    public Cliente(int idCliente, String nombre, String apellidos, int edad) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }
    
    public void setDni(){
        this.dni = dni;
    }
    
    public String getDni(){
        return dni;
    }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
}
