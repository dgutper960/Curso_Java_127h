package POO_INTERFACES_CRUD.repositorio;

import POO_INTERFACES_CRUD.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/** Esta clase implementa CrudRepositorio, OrdenableRepositorio y PaginarClientes
 * --> Damos forma a sus métodos **/
public class ClientesListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginarClientes{

    /** Creamos un atributo List<Cliente> para almacenar y operar con los datos */
    private List<Cliente> dataSource;

    /** Inicializamos el ArrayList en un constructor vacío */
    ClientesListRepositorio(){
        this.dataSource = new ArrayList<>();
    }

    /** Damos implementación a los métodos */
    // retornamos el dataSource
    @Override
    public List<Cliente> listarClientes() {
        return this.dataSource;
    }

    // Tiramos de sort() e implementamos al vuelo, usamos expresión LAMBDA
    @Override
    public List<Cliente> listarClientes(String campo, Orden orden) {
        dataSource.sort((a, b) -> {
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
        return dataSource;
    }

    // Tiramos del método subList()
    @Override
    public List<Cliente> listarClientes(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    // Iteramos y comparamos id
    @Override
    public Cliente mostrarClientePorID(Integer id) {
        Cliente buscado = null;
        for (Cliente cliente: dataSource){
            if (cliente.getId().equals(id)){
                buscado = cliente;
                break;
            }
        }
        return buscado;
    }

    // Usamos el método .add() de ArrayList
    @Override
    public void insertarCliente(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    // Modificamos mediante set
    @Override
    public void editarCliente(Cliente cliente) {
        Cliente c = this.mostrarClientePorID(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellidos(cliente.getApellidos());
    }


    // Para este método vamos a necesitar .equals implementado en Cliente
    @Override
    public void eliminarClientePorID(Integer id) {
        dataSource.remove(this.mostrarClientePorID(id));
    }

}
