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
public class Jugadores extends Personal {
    private String posicion;
    private int numero_goles;
    private int sueldo;
    private Date fecha_nacimiento;
    private int plus_goles;
    private int plus_partido_ganado;
    

    public Jugadores(String posicion, int numero_goles, int sueldo, String nombre, String dni, String telefono, String direccion, int partidos_ganados,  Date fecha_nacimiento) {
        super(nombre, dni, telefono, direccion, partidos_ganados);
        this.posicion = posicion;
        this.numero_goles = numero_goles;
        this.sueldo = sueldo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.plus_goles = 200;
        this.plus_partido_ganado = 100;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero_goles() {
        return numero_goles;
    }

    public void setNumero_goles(int numero_goles) {
        this.numero_goles = numero_goles;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public float getPlus_goles() {
        return plus_goles;
    }

    public void setPlus_goles(int plus_goles) {
        this.plus_goles = plus_goles;
    }

    public float getPlus_partido_ganado() {
        return plus_partido_ganado;
    }

    public void setPlus_partido_ganado(int plus_partido_ganado) {
        this.plus_partido_ganado = plus_partido_ganado;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "posicion=" + posicion + ", numero_goles=" + numero_goles + ", sueldo=" + sueldo + ", fecha_nacimiento=" + fecha_nacimiento + ", plus_goles=" + plus_goles + ", plus_partido_ganado=" + plus_partido_ganado + '}';
    }

    public int calcularSueldoFinal(int sueldoFinal){
        return sueldoFinal = sueldo + (plus_goles * numero_goles) + (plus_partido_ganado * partidos_ganados);
    }
}
