package TiposGenericos.InterfacesCRUB.Clase_Generica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T>{
    /** TORNAMOS LA CLASE CAMIÓN A GENÉRICA
     * --> Pasamos una letra mayúscula al nombre de la Clase
     * --> Cambiamos todos los tipos a esa letra
     * --> Debemos indicar el tipo a Iterable **/
    private List<T> objetos;
    private int maxElementos;

    //constructor

    public Camion(int maxElementos) {
        this.maxElementos = maxElementos;
        this.objetos = new ArrayList<>(); // inicializamos la lista
    }

    //método add
    public void addObjeto(T objeto){
        if (this.objetos.size() <= maxElementos){
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("El objeto no pudo entrar, el camión está lleno");
        }
    }

    // El List también implementa Iterable
    // implementamos iterator a objetos
    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
