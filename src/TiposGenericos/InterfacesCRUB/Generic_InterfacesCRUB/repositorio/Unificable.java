package TiposGenericos.InterfacesCRUB.Generic_InterfacesCRUB.repositorio;

public interface Unificable<T> extends CrudRepositorio<T>, OrdenableRepositorio<T>, PaginarClientes<T>, ContableRepositorio {
}
