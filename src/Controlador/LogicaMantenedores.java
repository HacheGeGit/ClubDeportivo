/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Mantenedores;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hg_fr
 */
public class LogicaMantenedores {
    private ArrayList<Mantenedores> listaMantenedores;
    
    public LogicaMantenedores(){
        listaMantenedores = new ArrayList<>();
    }
    
    public void altaMantenedor(Mantenedores mantenedor){
        listaMantenedores.add(mantenedor);
    }
    
    public Mantenedores getMantenedores(int dato){
        return listaMantenedores.get(dato);
    }
    
    public void setMantenedor(Mantenedores mantenedor){
        for (int i = 0; i < listaMantenedores.size(); i++) {
            if (mantenedor == listaMantenedores.get(i)) {
                listaMantenedores.set(i, mantenedor);
            }
        }
    }
    
    public ArrayList<Mantenedores> getListaJugadores(){
        return listaMantenedores;
    }
    
     public void borrarMantenedor(int dato){
        Iterator<Mantenedores> it= listaMantenedores.iterator();
        
        while (it.hasNext()) {
            Mantenedores m = it.next();
            if (m.getNombre().equals(dato)) {
                it.remove();
            }
            
        }
    }
}
