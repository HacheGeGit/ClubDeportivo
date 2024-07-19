/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class Personal {
    private String nombre;
    private String dni;
    private String telefono;
    private String direccion;
    int partidos_ganados;

    public Personal(String nombre, String dni, String telefono, String direccion, int partidos_ganados) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.partidos_ganados = partidos_ganados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPartidos_ganados() {
        return partidos_ganados;
    }

    public void setPartidos_ganados(int partidos_ganados) {
        this.partidos_ganados = partidos_ganados;
    }

    @Override
    public String toString() {
        return "Personal{" + "nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", direccion=" + direccion + ", partidos_ganados=" + partidos_ganados + '}';
    }
 
}
