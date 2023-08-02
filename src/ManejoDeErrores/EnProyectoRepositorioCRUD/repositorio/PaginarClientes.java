package ManejoDeErrores.EnProyectoRepositorioCRUD.repositorio;

import java.util.List;

public interface PaginarClientes<T> {
    List<T> listarClientes(int desde, int hasta);
}
