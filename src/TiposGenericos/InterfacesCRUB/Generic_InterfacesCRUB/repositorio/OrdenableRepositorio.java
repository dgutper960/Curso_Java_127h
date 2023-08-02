package TiposGenericos.InterfacesCRUB.Generic_InterfacesCRUB.repositorio;

import TiposGenericos.InterfacesCRUB.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {
    /** Sobrecargamos el método listarClientes **/
    List<T> listarClientes(String campo, Orden orden);
}
