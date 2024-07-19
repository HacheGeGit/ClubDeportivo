/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Directivos;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hg_fr
 */
public class LogicaDirectivos {
    private ArrayList<Directivos> listaDirectivos;
    
    public LogicaDirectivos(){
        listaDirectivos = new ArrayList<Directivos>();
    }
    
    public void altaDirectivo(Directivos directivo){
        listaDirectivos.add(directivo);
    }
    
    public void setDirectivo(Directivos directivo){
        for (int i = 0; i < listaDirectivos.size(); i++) {
            if (directivo == listaDirectivos.get(i)) {
                listaDirectivos.set(i, directivo);
            }
        }
    }
    
    public Directivos getPersonal(int dato){
        return listaDirectivos.get(dato);
    }
    
    public void borrarDirectivo(int dato){
        Iterator<Directivos> it= listaDirectivos.iterator();
        
        while (it.hasNext()) {
            Directivos d = it.next();
            if (d.getNombre().equals(dato)) {
                it.remove();
            }
            
        }
    }
}
