package TiposGenericos.InterfacesCRUB.repositorio;

import TiposGenericos.InterfacesCRUB.modelo.Cliente;

import java.util.List;

public interface PaginarClientes {
    List<Cliente> listarClientes(int desde, int hasta);
}
