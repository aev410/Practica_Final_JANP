/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.practica_final_janp.clases;


public class Cliente {
 /**
 *  Se crean las variables de la clase
 *  Cliente
 * @author naimg
 */
    private int idCliente;
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    /**
     * Se crea el constructor vacio
     */
    public Cliente(){
        super();
    }
    /**
     * Se crea el constructor con los parametros
     * @param idCliente
     * @param nombre
     * @param apellidos
     * @param edad 
     */
    public Cliente(int idCliente, String nombre, String apellidos, int edad) {
        super();
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }
    /**
     * Se crea los getters y setters
     */
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
    /**
     * Se crea el metodo toString que lo que hace es mostrarnos un resumen
     * de los atributos de la clase
     * @return resumen de la clase
     */
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
}
