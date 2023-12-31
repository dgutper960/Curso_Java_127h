package ManejoDeErrores.EnProyectoRepositorioCRUD.listas;

import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.LecturaDatosException;
import ManejoDeErrores.EnProyectoRepositorioCRUD.modelo.Cliente;
import ManejoDeErrores.EnProyectoRepositorioCRUD.repositorio.AbstractListRepositorio;
import ManejoDeErrores.EnProyectoRepositorioCRUD.repositorio.Orden;

import java.util.ArrayList;
import java.util.List;

/** Esta clase implementa CrudRepositorio, OrdenableRepositorio y PaginarClientes
 * --> Damos forma a sus métodos **/
public class ClienteListRepositorio extends AbstractListRepositorio<Cliente> {


     // Tiramos de sort() e implementamos al vuelo, usamos expresión LAMBDA
    @Override
    public List<Cliente> listarClientes(String campo, Orden orden) {
        // PARA QUE AL ORDENAR NO SE MODIFIQUE EL ORIGINAL CREAMOS UN NUEVO ArrayList
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
                int resultado = 0;
                if (orden == Orden.ASC){
                    switch (campo){
                        case "id" ->
                                resultado = a.getId().compareTo(b.getId());
                        case "nombre" ->
                                resultado = a.getNombre().compareToIgnoreCase(b.getNombre());
                        case "apellidos" ->
                                resultado = a.getApellidos().compareToIgnoreCase(b.getApellidos());
                    }
                }else if (orden == Orden.DESC){
                    switch (campo){
                        case "id" ->
                                resultado = b.getId().compareTo(a.getId());
                        case "nombre" ->
                                resultado = b.getNombre().compareToIgnoreCase(a.getNombre());
                        case "apellidos" ->
                                resultado = b.getApellidos().compareToIgnoreCase(a.getApellidos());
                    }
                }
                return resultado;
            });
        return listaOrdenada; // EVITAMOS QUE SE MODIFIQUE EL ORIGINAL AL EMPLEAR ESTE MÉTODO
    } //TODO ESTE MÉTODO SE PUEDE OPTIMIZAR (clase 219)

    // Iteramos y comparamos id
//    @Override
//    public Cliente mostrarClientePorID(Integer id) throws LecturaDatosException {
//        if (id == null || id <= 0){
//            throw new LecturaDatosException("El id debe ser mayor de 0");
//        }
//        Cliente buscado = null;
//        for (Cliente cliente: dataSource){
//            // validamos que algún id no sea null y que id sean iguales
//            if (cliente.getId()!=null && cliente.getId().equals(id)){
//                buscado = cliente;
//                break;
//            }
//        }
//        if (buscado == null){
//            throw new LecturaDatosException("El id buscado '"+id+"' no existe");
//        }
//        return buscado;
//    }
    // Usamos el método .add() de ArrayList
//    @Override
//    public void insertarCliente(Cliente c) {
//        this.dataSource.add(c);
//    }

    // Modificamos mediante set
    @Override
    public void editarCliente(Cliente objeto) throws LecturaDatosException {
        Cliente c = this.mostrarClientePorID(objeto.getId());
        c.setNombre(objeto.getNombre());
        c.setApellidos(objeto.getApellidos());
    }

}
