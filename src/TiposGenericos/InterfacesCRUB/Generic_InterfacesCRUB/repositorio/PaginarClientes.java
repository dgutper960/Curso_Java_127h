package TiposGenericos.InterfacesCRUB.Generic_InterfacesCRUB.repositorio;

import TiposGenericos.InterfacesCRUB.modelo.Cliente;

import java.util.List;

public interface PaginarClientes<T> {
    List<T> listarClientes(int desde, int hasta);
}
