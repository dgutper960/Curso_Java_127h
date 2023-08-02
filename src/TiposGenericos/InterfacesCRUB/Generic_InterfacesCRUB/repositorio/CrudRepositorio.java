package TiposGenericos.InterfacesCRUB.Generic_InterfacesCRUB.repositorio;

import TiposGenericos.InterfacesCRUB.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio<T>{

    /** MARCAMOS LOS PROTOCOLOS DE LA INTERFACE **/

    // 1. Listar de clientes
    List<T> listarClientes();

    // 2. Obtener cliente mediante id
    T mostrarClientePorID(Integer id);

    // 3. Insertar cliente
    void insertarCliente(T cliente);

    // 4. Editar cliente
    void editarCliente(T cliente);

    // 5. Eliminar cliente
    void eliminarClientePorID(Integer id);

    int contar();
}
