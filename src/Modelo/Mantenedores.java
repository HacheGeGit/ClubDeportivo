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
public class Mantenedores extends Personal {
    boolean fijo;
    int sueldo;
    int plus_fijo;
    private Date fecha_nacimiento;

    public Mantenedores(boolean fijo, int sueldo,  String nombre, String dni, String telefono, String direccion, int partidos_ganados, Date fecha_nacimiento) {
        super(nombre, dni, telefono, direccion, partidos_ganados);
        this.fijo = fijo;
        this.sueldo = sueldo;
        this.plus_fijo = 100;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Mantenedores(String nombre, String dni, String telefono, String direccion, int partidos_ganados) {
        super(nombre, dni, telefono, direccion, partidos_ganados);
    }
    
    public boolean isFijo() {
        return fijo;
    }

    public void setFijo(boolean fijo) {
        this.fijo = true;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getPlus_fijo() {
        return plus_fijo;
    }

    public void setPlus_fijo(int plus_fijo) {
        this.plus_fijo = plus_fijo;
    }

    @Override
    public String toString() {
        return "Mantenedores{" + "fijo=" + fijo + ", sueldo=" + sueldo + ", plus_fijo=" + plus_fijo + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }

    public int calcularSueldoFinal(int sueldoFinal){
        return sueldoFinal = sueldo + plus_fijo;
    }
    
}
