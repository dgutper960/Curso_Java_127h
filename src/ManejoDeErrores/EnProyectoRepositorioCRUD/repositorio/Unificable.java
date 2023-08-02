package ManejoDeErrores.EnProyectoRepositorioCRUD.repositorio;

public interface Unificable<T> extends CrudRepositorio<T>, OrdenableRepositorio<T>, PaginarClientes<T>, ContableRepositorio {
}
