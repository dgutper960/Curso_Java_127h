package ManejoDeErrores.EnProyectoRepositorioCRUD.repositorio;

import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.EscrituraDatosException;
import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.LecturaDatosException;
import ManejoDeErrores.EnProyectoRepositorioCRUD.modelo.BaseEntity;

import java.util.ArrayList;
import java.util.List;
/** Esta clase implementa CrudRepositorio, OrdenableRepositorio y PaginarClientes
 * --> Damos forma a sus métodos **/
public abstract class AbstractListRepositorio<T extends BaseEntity> implements Unificable<T> {

    /** Creamos un atributo List<Cliente> para almacenar y operar con los datos */
    protected List<T> dataSource;

    /** Inicializamos el ArrayList en un constructor vacío */
    public AbstractListRepositorio(){
        this.dataSource = new ArrayList<>();
    }


    /** Damos implementación a los métodos */
    // retornamos el dataSource
    @Override
    public List<T> listarClientes() {
        return this.dataSource;
    }

    // Tiramos de sort() e implementamos al vuelo, usamos expresión LAMBDA
//    @Override
//    public List<T> listarClientes(String campo, Orden orden) {
//        // PARA QUE AL ORDENAR NO SE MODIFIQUE EL ORIGINAL CREAMOS UN NUEVO ArrayList
//        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
//        listaOrdenada.sort((a, b) -> {
//                int resultado = 0;
//                if (orden == Orden.ASC){
//                    switch (campo){
//                        case "id" ->
//                                resultado = a.getId().compareTo(b.getId());
//                        case "nombre" ->
//                                resultado = a.getNombre().compareToIgnoreCase(b.getNombre());
//                        case "apellidos" ->
//                                resultado = a.getApellidos().compareToIgnoreCase(b.getApellidos());
//                    }
//                }else if (orden == Orden.DESC){
//                    switch (campo){
//                        case "id" ->
//                                resultado = b.getId().compareTo(a.getId());
//                        case "nombre" ->
//                                resultado = b.getNombre().compareToIgnoreCase(a.getNombre());
//                        case "apellidos" ->
//                                resultado = b.getApellidos().compareToIgnoreCase(a.getApellidos());
//                    }
//                }
//                return resultado;
//            });
//        return listaOrdenada; // EVITAMOS QUE SE MODIFIQUE EL ORIGINAL AL EMPLEAR ESTE MÉTODO
//    } //TODO ESTE MÉTODO SE PUEDE OPTIMIZAR (clase 219)

    // Tiramos del método subList()
    @Override
    public List<T> listarClientes(int desde, int hasta) {
        return dataSource.subList(desde, hasta); // TOMA EL ÍNDICE COMO VALOR
    }

    // Iteramos y comparamos id

    /*** Gracias a la jerarquía de herencia entre la clase Abstracta, Cliente y BaseEntity
     * Podemos usar los getters de Cliente en este método con salida de tipo genérico ***/
    @Override
    public T mostrarClientePorID(Integer id) throws LecturaDatosException{
        if (id == null || id <= 0){
            throw new LecturaDatosException("El id debe ser mayor de 0");
        }
        T buscado = null;
        for (T cliente: dataSource){
            // validamos que algún id no sea null y que id sean iguales
            if (cliente.getId()!=null && cliente.getId().equals(id)){
                buscado = cliente;
                break;
            }
        }
        if (buscado == null){
            throw new LecturaDatosException("El id buscado '"+id+"' no existe");
        }
        return buscado;
    }

    // Usamos el método .add() de ArrayList
    @Override
    public void insertarCliente(T t) throws EscrituraDatosException {
        if (t == null){
            throw new EscrituraDatosException("No se puede añadir con id null");
        }
        if (this.dataSource.contains(t)){
            throw new EscrituraDatosException("OPERACIÓN NO PERMITIDA.\nEl cliente que intenta insertar ya existe"+
                    "\nid "+t.getId()+" no puede ser duplicado");
        }
        this.dataSource.add(t);
    }

    // Modificamos mediante set
//    @Override
//    public void editarCliente(T t) {
//        Cliente c = this.mostrarClientePorID(cliente.getId());
//        c.setNombre(cliente.getNombre());
//        c.setApellidos(cliente.getApellidos());
//    }


    // Para este método vamos a necesitar .equals implementado en Cliente
    @Override
    public void eliminarClientePorID(Integer id) throws LecturaDatosException {
        dataSource.remove(this.mostrarClientePorID(id));
    }

    @Override
    public int contar() {
        return this.dataSource.size();
    }
}
