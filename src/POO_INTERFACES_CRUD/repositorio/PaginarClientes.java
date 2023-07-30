package POO_INTERFACES_CRUD.repositorio;

import POO_INTERFACES_CRUD.modelo.Cliente;

import java.util.List;

public interface PaginarClientes {
    List<Cliente> listarClientes(int desde, int hasta);
}
