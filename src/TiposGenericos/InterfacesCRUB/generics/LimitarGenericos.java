package TiposGenericos.InterfacesCRUB.generics;

import TiposGenericos.InterfacesCRUB.modelo.Cliente;
import TiposGenericos.InterfacesCRUB.modelo.ClientePremium;

import java.util.Arrays;
import java.util.List;

public class LimitarGenericos {
    public static void main(String[] args) {
        /**
         * VEAMOS COMO LIMITAR GENÉRICOS A POR EJEMPLO, DE TIPO NUMÉRICO
         * */
        List<Integer> numeros = genericArrayToList(new Integer[]{78, 92,10, 73, 24});
        numeros.forEach(System.out::println);

        List<Cliente> clientes = genericArrayToList(new Cliente[]{
                new Cliente("Pepe", "Ramos"),
                new Cliente("Sonia", "García"),
                new Cliente("Adrián", "Martinez"),
                new Cliente("Marta", "Smith"),
                new Cliente("Nahuel", "West")
        });
        clientes.forEach(System.out::println);

        List<ClientePremium> cliPremium = genericArrayToList(
                new ClientePremium[]{
                        new ClientePremium("Monica", "Nuñez"),
                        new ClientePremium("Sofía", "Martinez"),
                        new ClientePremium("Daniel", "Alonso"),
                        new ClientePremium("Davis", "Ferguson"),
                        new ClientePremium("Ashley", "Taxon"),
                        new ClientePremium("Silvia", "Naranjo")
                });

        cliPremium.forEach(System.out::println);

        /** usamos el método de imprimir lista de clientes **/
        imprimirClientes(clientes); // con clientes no hay problema
        /** Con ClientesPremium no vamos a poder a pesar de que estos heredan de clientes
         * --> Con las listas no se consideran del mismo tipo las clases hijas */
        imprimirClientes(cliPremium); // una vez rectificado el método, ya no da error

    }
    /** Si hablamos de genéricos, sabemos que todos heredan de la clase Numbers
     * --> Se puede usar un extends en el método */
    public static <T extends Number> List<T> genericArrayToList(T[] t){

        return Arrays.asList(t);
    } /** De este modo podemos tener una sobrecarga de métodos con diferentes implementaciones
            que tomen los datos de entrada según el tipo de objeto **/

    public static <T extends Cliente> List<T> genericArrayToList(T[] t){

        return Arrays.asList(t);
    }

    //TODO REVISAR EL ERROR AL IMPLEMENTAR (public static <T extends ClientePremium & Comparable<T>> List<T> genericArrayToList(T[] c))
//    public static <T extends ClientePremium & Comparable<T>> List<T> genericArrayToList(T[] c) {
//        return Arrays.asList(c);
//    }
    /** Creamos un método que imprime listas de clientes **/
//    public static void imprimirClientes(List<Cliente> clientes){
//        clientes.forEach(System.out::println);
//    }

    /** Creamos un método que sirve para Cliente y ClientePremium */
    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    } /** Comentamos el de arriba porque la sobrecarga considera que es la misma entrada **/
}
