package ManejoDeErrores.EnProyectoRepositorioCRUD.repositorio;

import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.AccesoDatoException;
import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.LecturaAccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T>{

    /** MARCAMOS LOS PROTOCOLOS DE LA INTERFACE **/

    // 1. Listar de clientes
    List<T> listarClientes();

    // 2. Obtener cliente mediante id
    T mostrarClientePorID(Integer id) throws AccesoDatoException; /** EN LA INTERFACE USAMOS EL MÉTODO MÁS GENÉRICO POSIBLE **/

    // 3. Insertar objeto
    void insertarCliente(T objeto);

    // 4. Editar objeto
    void editarCliente(T objeto) throws LecturaAccesoDatoException;


    // 5. Eliminar cliente
    void eliminarClientePorID(Integer id) throws LecturaAccesoDatoException;

    int contar();
}
