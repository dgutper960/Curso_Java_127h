package ManejoDeErrores.EnProyectoRepositorioCRUD.repositorio;

import java.util.List;

public interface OrdenableRepositorio<T> {
    /** Sobrecargamos el método listarClientes **/
    List<T> listarClientes(String campo, Orden orden);
}
