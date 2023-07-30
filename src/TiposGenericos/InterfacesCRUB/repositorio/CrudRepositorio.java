package TiposGenericos.InterfacesCRUB.repositorio;

import TiposGenericos.InterfacesCRUB.modelo.Cliente;

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
