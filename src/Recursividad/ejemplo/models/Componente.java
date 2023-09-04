package Recursividad.ejemplo.models;

import java.util.ArrayList;
import java.util.List;

/** Vamos a ver la recursividad entendida como una clase que está compuesta de otras clases */

public class Componente {

    private String nombre;
    private List<Componente> hijos;

    /** creamos el constructor e inicializamos la lista */
    public Componente(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<>(); // inicializamos la lista
    }

    /** getters and setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Componente> getHijos() {
        return hijos;
    }

    public void setHijos(List<Componente> hijos) {
        this.hijos = hijos;
    }

    /** método add para agregar hijos **/
    public Componente addComponente(Componente c){
        this.hijos.add(c);
        return this; // para encadenar
    }

    /** preguntamos si tiene hijos **/
    public boolean tieneHijos(){
        return !this.hijos.isEmpty(); // la expresión está negada
    }
}
