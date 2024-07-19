/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Jugadores;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Alumno
 */

// Todas las lógicas del paquete Controlador funcionan igual, así que solo comentaré esta.
// Se declara la lista en la que se van a guardar los objetos desde la Vista.
// Se crea el contructor para poder instanciar el objeto en la Vista y el método para añadir
// objetos al la lista. Se crea un getter de la lista y un setter.
// Por último se crea un método que itera la lista con un int que hace las veces de índice.
// Si encuentra el dato, lo borra de la lista.

public class LogicaJugadores {
    private ArrayList<Jugadores> listaJgadores;
    
    public LogicaJugadores(){
        listaJgadores = new ArrayList<>();
    }
    
    public void altaJugador(Jugadores jugador){
        listaJgadores.add(jugador);
    }
    
    public Jugadores getJugadores(int dato){
        return listaJgadores.get(dato);
    }
    
    public void setJgador(Jugadores jugador){
        for (int i = 0; i < listaJgadores.size(); i++) {
            if (jugador == listaJgadores.get(i)) {
                listaJgadores.set(i, jugador);
            }
        }
    }
    
    public ArrayList<Jugadores> getListaJugadores(){
        return listaJgadores;
    }
    
     public void borrarJugador(int dato){
        Iterator<Jugadores> it= listaJgadores.iterator();
        
        while (it.hasNext()) {
            Jugadores j = it.next();
            if (j.getNombre().equals(dato)) {
                it.remove();
            }
            
        }
    }
}
