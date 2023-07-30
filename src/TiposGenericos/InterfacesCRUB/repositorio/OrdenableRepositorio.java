package TiposGenericos.InterfacesCRUB.repositorio;

import TiposGenericos.InterfacesCRUB.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    /** Sobrecargamos el método listarClientes **/
    List<Cliente> listarClientes(String campo, Orden orden);
}
