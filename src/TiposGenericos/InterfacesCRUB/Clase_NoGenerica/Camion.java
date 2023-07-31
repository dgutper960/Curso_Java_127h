package TiposGenericos.InterfacesCRUB.Clase_NoGenerica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable{
    /** IMPLEMENTAMOS LA CLASE CAMIÓN QUE NO ES GENÉRICA **/
    private List objetos;
    private int maxElementos;

    //constructor

    public Camion(int maxElementos) {
        this.maxElementos = maxElementos;
        this.objetos = new ArrayList<>(); // inicializamos la lista
    }

    //método add
    public Camion addObjeto(Object objeto){
        if (this.objetos.size() <= maxElementos){
            this.objetos.add(objeto);
            return this;
        } else {
            throw new RuntimeException("El objeto no pudo entrar, el camión está lleno");
        }

    }

    // El List también implementa Iterable
    // implementamos iterator a objetos
    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
