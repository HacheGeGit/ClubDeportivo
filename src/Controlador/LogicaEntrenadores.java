/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Entrenadores;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hg_fr
 */
public class LogicaEntrenadores {
    private ArrayList<Entrenadores> listaEntrenadores;
    
    public LogicaEntrenadores(){
        listaEntrenadores = new ArrayList<Entrenadores>();
    }
    
    public void altaEntrenador(Entrenadores entrenador){
        listaEntrenadores.add(entrenador);
    }
    
    public void setEntrenador(Entrenadores entrenador){
        for (int i = 0; i < listaEntrenadores.size(); i++) {
            if (entrenador == listaEntrenadores.get(i)) {
                listaEntrenadores.set(i, entrenador);
            }
        }
    }
    
    public Entrenadores getEntrenador(int dato){
        return listaEntrenadores.get(dato);
    }
    
     public void borrarDirectivo(int dato){
        Iterator<Entrenadores> it= listaEntrenadores.iterator();
        
        while (it.hasNext()) {
            Entrenadores e = it.next();
            if (e.getNombre().equals(dato)) {
                it.remove();
            }
            
        }
    }
}
