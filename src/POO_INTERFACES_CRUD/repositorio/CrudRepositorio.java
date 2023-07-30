package POO_INTERFACES_CRUD.repositorio;

import POO.ProyectoFacturas.org.david.appfacturas.modelo.Cilente;
import POO_INTERFACES_CRUD.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public interface CrudRepositorio {

    /** MARCAMOS LOS PROTOCOLOS DE LA INTERFACE **/

    // 1. Listar de clientes
    List<Cliente> listarClientes();

    // 2. Obtener cliente mediante id
    Cliente mostrarClientePorID(Integer id);

    // 3. Insertar cliente
    void insertarCliente(Cliente cliente);

    // 4. Editar cliente
    void editarCliente(Cliente cliente);

    // 5. Eliminar cliente
    void eliminarClientePorID(Integer id);

    int contar();
}
