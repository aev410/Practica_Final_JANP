/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.practica_final_janp.clases;

/**
 * 
 * @author Invitao
 */
public class Vehiculo {
    /**
     * Se crean las variables de la clase
     * Vehiculo con sus atributos
     */
    private int idVehiculo;
    private String matricula;
    private String marca;
    private String modelo;
    private String año;
    private String color;
/**
 * Creamos el constructor con parametros
 * @param idVehiculo
 * @param matricula
 * @param marca
 * @param modelo
 * @param año
 * @param color 
 */
    public Vehiculo(int idVehiculo, String matricula, String marca, String modelo, String año, String color) {
        super();
        this.idVehiculo = idVehiculo;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }
/**
 * Se crea el constructor vacio
 */
    public Vehiculo() {
        super();
    }
/**
 * Se crean los getters y setters
 */
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAño() {
        return año;
    }

    public String getColor() {
        return color;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void setColor(String color) {
        this.color = color;
    }
/**
 * Creamos el metodo toString que lo que hace es mostrarnos un resumen
 * de los atributos de la clase
 * @return resumen de atributos de la clase
 */
    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", color=" + color + '}';
    } 
}
