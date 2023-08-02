package TiposGenericos.InterfacesCRUB.Generic_InterfacesCRUB.repositorio.listas;

import TiposGenericos.InterfacesCRUB.Generic_InterfacesCRUB.modelo.Cliente;
import TiposGenericos.InterfacesCRUB.Generic_InterfacesCRUB.modelo.Producto;
import TiposGenericos.InterfacesCRUB.Generic_InterfacesCRUB.repositorio.AbstractListRepositorio;
import TiposGenericos.InterfacesCRUB.Generic_InterfacesCRUB.repositorio.Orden;

import java.util.ArrayList;
import java.util.List;

public class ProductosListaRepositorio extends AbstractListRepositorio<Producto> {
    @Override
    public void editarCliente(Producto objeto) {
        Producto p = this.mostrarClientePorID(objeto.getId());
        p.setDescripcion(p.getDescripcion());
        p.setPrecio(p.getPrecio());
    }

    @Override
    public List<Producto> listarClientes(String campo, Orden orden) {
        // PARA QUE AL ORDENAR NO SE MODIFIQUE EL ORIGINAL CREAMOS UN NUEVO ArrayList
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (orden == Orden.ASC){
                switch (campo){
                    case "id" ->
                            resultado = a.getId().compareTo(b.getId());
                    case "descripcion" ->
                            resultado = a.getDescripcion().compareToIgnoreCase(b.getDescripcion());
                    case "precio" ->
                            resultado = a.getPrecio().compareTo(b.getPrecio());
                }
            }else if (orden == Orden.DESC){
                switch (campo){
                    case "id" ->
                            resultado = b.getId().compareTo(a.getId());
                    case "nombre" ->
                            resultado = b.getDescripcion().compareToIgnoreCase(a.getDescripcion());
                    case "precio" ->
                            resultado = b.getPrecio().compareTo(a.getPrecio());
                }
            }
            return resultado;
        });
        return listaOrdenada; // EVITAMOS QUE SE MODIFIQUE EL ORIGINAL AL EMPLEAR ESTE MÉTODO
    } //TODO ESTE MÉTODO SE PUEDE OPTIMIZAR (clase 219)
}
