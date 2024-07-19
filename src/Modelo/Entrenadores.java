/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author hg_fr
 */
public class Entrenadores extends Personal{
    private int sueldo;
    private int plus_ganado;
    private Date fecha_nacimiento;

    public Entrenadores(int sueldo, String nombre, String dni, String telefono, String direccion, int partidos_ganados, Date fecha_nacimiento) {
        super(nombre, dni, telefono, direccion, partidos_ganados);
        this.sueldo = sueldo;
        this.plus_ganado = 100;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Entrenadores(String nombre, String dni, String telefono, String direccion, int partidos_ganados) {
        super(nombre, dni, telefono, direccion, partidos_ganados);
    }
    
    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getPlus_ganado() {
        return plus_ganado;
    }

    public void setPlus_ganado(int plus_ganado) {
        this.plus_ganado = plus_ganado;
    }

    @Override
    public String toString() {
        return "Entrenadores{" + "sueldo=" + sueldo + ", plus_ganado=" + plus_ganado + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
   
    public int calcularSueldoFinal(int sueldoFinal){
        return sueldoFinal = sueldo + (partidos_ganados * plus_ganado);
    }
}
