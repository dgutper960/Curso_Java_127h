package TiposGenericos.InterfacesCRUB.generics;

/**
 * HEMOS COPIADO EL MODELO DE POO_INTERFACES_CRUD
 * y vamos a trabajar con esta copia del proyecto
 * ***/

import POO.ProyectoFacturas.org.david.appfacturas.modelo.Cilente;
import TiposGenericos.InterfacesCRUB.modelo.Cliente;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * EN ESTE EJEMPLO TRABAJAREMOS CON LOS TIPOS MÁS GENÉRICOS POSIBLES
 * PARA EVITAR PROBLEMAS DE COMPILACIÓN
 * **/

public class PrincipalGenericos {
    public static void main(String[] args) {

        /** reutilizamos la clase Cliente y creamos una lista
         * Si no especificamos que tipo de dato vamos a manejar **/
        List clients= new ArrayList();
        // añadimo clientes a la lista
        clients.add(new Cliente("Alberto", "Muñoz"));
        // JAVA TÓ EL TIEMPO NOS ADVIERTE DE QUE NO SE ENCUENTRA EL TIPO DE DATO Y ASUME QUE ES Object
        /** Si queremos obtener el 1er cliente con Iterator.next() */
        // Java no sabe que tipo de objeto estamos usando, por lo que debemos hacer un cast
        Cliente verCliente = (Cliente) clients.iterator().next(); // se obtiene el 1er elemento de la lista

        /**  LA FORMA CORRECTA DE HACER LO ANTERIOR SERÍA LA SIGUIENTE  **/
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("David", "Gutiérrez"));
        System.out.println("El primer registro de clientes es "+clientes.iterator().next());

        /** Para probar el método estático, creamos un Array de Clientes **/
        Cliente[] arrayClientes = {
                new Cliente("Sonia", "Martinez"),
                new Cliente("Victor", "Nunez"),
        };
        /** y creamos arrays de lo que sea **/
        Integer[] arrayNumeros = {1,2,3,4,5,15, 20, 25};

        List<Cliente> listaClientes = genericArrayToList(arrayClientes);

        List<Integer> listaNumeros = genericArrayToList(arrayNumeros);

    }
    /**
     * IMAGINEMOS QUE LLEGADO UN PUNTO QUIERO OBTENER UNA List DE Clientes PARTIENDO DE UN Array DE CLIENTES
     * Siguiendo las necesidades del momento, implementaría el siguiente método
     * **/
    public static List<Cliente> ClientesArrayToList(Cliente[] cli){
        // Tomamos el método de Arrays para que no haga el trabajo
        return Arrays.asList(cli);
    }
    /** El problema en cuanto a reusabilidad es que este método solo funciona con Arrays de Clientes
     * Poe eso, este otro sería bastante más reutilizable */
    // la letra puede ser cualquiera, pero se suele usar la T para listas
    public static <T> List<T> genericArrayToList(T[] cli){
        return Arrays.asList(cli);
    }

}
