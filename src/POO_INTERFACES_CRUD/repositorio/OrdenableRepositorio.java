package POO_INTERFACES_CRUD.repositorio;

import POO_INTERFACES_CRUD.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    /** Sobrecargamos el método listarClientes **/
    List<Cliente> listarClientes(String campo, Orden orden);
}
