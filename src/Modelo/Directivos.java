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
public class Directivos extends Personal {
    private String cargo;
    private int sueldo;
    private boolean activo;
    private Date fecha_nacimiento;

    public Directivos(String cargo, int sueldo, boolean activo, String nombre, String dni, String telefono, String direccion, int partidos_ganados, Date fecha_nacimiento) {
        super(nombre, dni, telefono, direccion, partidos_ganados);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.activo = activo;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = true;
    }

    @Override
    public String toString() {
        return "Directivos{" + "cargo=" + cargo + ", sueldo=" + sueldo + ", activo=" + activo + '}';
    }
    
}
