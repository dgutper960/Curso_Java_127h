package ManejoDeErrores.EnProyectoRepositorioCRUD.repositorio;

import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.AccesoDatosException;
import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.EscrituraDatosException;
import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.LecturaDatosException;

import java.util.List;

public interface CrudRepositorio<T>{

    /** MARCAMOS LOS PROTOCOLOS DE LA INTERFACE **/

    // 1. Listar de clientes
    List<T> listarClientes();

    // 2. Obtener cliente mediante id
    T mostrarClientePorID(Integer id) throws AccesoDatosException;

    // 3. Insertar objeto
    void insertarCliente(T objeto) throws AccesoDatosException;

    // 4. Editar objeto
    void editarCliente(T objeto) throws AccesoDatosException;


    // 5. Eliminar cliente
    void eliminarClientePorID(Integer id) throws AccesoDatosException;

    int contar();
}
