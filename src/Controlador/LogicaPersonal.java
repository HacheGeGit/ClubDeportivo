/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Personal;
import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class LogicaPersonal {
    
    private ArrayList<Personal> listaPersonal;
    
    public LogicaPersonal(){
        listaPersonal = new ArrayList<Personal>();
    }
    
    public void altapersonal(Personal personal){
        listaPersonal.add(personal);
    }
    
    public void setPersonal(Personal personal){
        for (int i = 0; i < listaPersonal.size(); i++) {
            if (personal == listaPersonal.get(i)) {
                listaPersonal.set(i, personal);
            }
        }
    }
    
    public Personal getPersonal(int dato){
        return listaPersonal.get(dato);
    }
}
