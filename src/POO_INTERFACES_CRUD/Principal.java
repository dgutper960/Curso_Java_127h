package POO_INTERFACES_CRUD;

import POO_INTERFACES_CRUD.repositorio.ClientesListRepositorio;
import POO_INTERFACES_CRUD.repositorio.CrudRepositorio;

public class Principal {
    public static void main(String[] args) {

        /** Creamos una instancia de ClienteListRepositorio con su tipo más genérico posible (CrudRepositorio) **/
        CrudRepositorio repositorio = new ClientesListRepositorio();
    }
}
