package ManejoDeErrores.EnProyectoRepositorioCRUD;

import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.AccesoDatosException;
import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.EscrituraDatosException;
import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.LecturaDatosException;
import ManejoDeErrores.EnProyectoRepositorioCRUD.listas.ClienteListRepositorio;
import ManejoDeErrores.EnProyectoRepositorioCRUD.modelo.Cliente;
import ManejoDeErrores.EnProyectoRepositorioCRUD.repositorio.Orden;
import ManejoDeErrores.EnProyectoRepositorioCRUD.repositorio.Unificable;

import java.util.List;

public class PrincipalCliente {
    public static void main(String[] args) {

        try{
            /** Creamos una instancia de ClienteListRepositorio con su tipo más genérico posible (CrudRepositorio) **/
            Unificable<Cliente> repositorio = new ClienteListRepositorio();
            // añadimos clientes a la lista
            repositorio.insertarCliente(new Cliente("David", "Gutiérrez")); // CON DOS APELLIDOS, NO ORDENA BIEN
            repositorio.insertarCliente(new Cliente("María Jesús", "Batista"));
            repositorio.insertarCliente(new Cliente("Monica", "Naranjo"));
            repositorio.insertarCliente(new Cliente("Wes", "Anderson"));

            /** EL método listarClientes retorna una List<Cliente> lo usamos con expresión LAMBDA */
            System.out.println("===== Lista Clientes =====");
            List<Cliente> clientes = repositorio.listarClientes();
            clientes.forEach(System.out::println);

            /** Paginamos (desde, hasta)*/
            System.out.println("===== Subconjunto Paginable =====");
            List<Cliente> paginar = repositorio.listarClientes(2, 3); // tiene en cuenta el índice, último no inclusive
            paginar.forEach(System.out::println);

            /** Ordenamos asc por apellido */ // CON DOS APELLIDOS, NO ORDENA BIEN
            System.out.println("===== Lista Orden Asc =====");
            List<Cliente> ordenAsc = repositorio.listarClientes("apellidos", Orden.ASC);
            ordenAsc.forEach(System.out::println);

            /** Ordenamos desc por apellido */ // CON DOS APELLIDOS, NO ORDENA BIEN
            System.out.println("===== Lista Orden Desc =====");
            List<Cliente> ordenDesc = repositorio.listarClientes("apellidos", Orden.DESC);
            ordenDesc.forEach(System.out::println);

            /** Si queremos editar MUY IMPORTANTE EDITAR EL ID con set
             * Buscamos por id  **/
            System.out.println("===== Buscar por id =====");
            Cliente id3 = repositorio.mostrarClientePorID(3);
            System.out.println("id3.getNombre() = " + id3.getNombre()+" "+id3.getApellidos());

            /** Editamos cliente con id 3. FUNDAMENTAL restaurar el id con set **/
            System.out.println("===== Editamos Cliente =====");
            id3 = new Cliente("Luis", "Amstrong");
            id3.setId(3);
            repositorio.editarCliente(id3); // DATO DE ENTRADA ID
            // LISTAMOS TODOS LOS CLIENTES PARA VER SI LO HEMOS HECHO BIEN
            clientes.forEach(System.out::println);
    //        ** CORREGIDO EN EL CÓDIGO -->// VEMOS QUE ESTÁN DESORDENADOS
    //        System.out.println("===== Lista Orden Asc por id =====");
    //        List<Cliente> ordenAsc2 = ((OrdenableRepositorio)repositorio).listarClientes("id", Orden.ASC);
    //        ordenAsc2.forEach(System.out::println);

            /** BORRAMOS A LOS FAMOSOS */
            System.out.println("===== Borramos los Clientes con id 3 y 4 =====");
            repositorio.eliminarClientePorID(4);
            repositorio.eliminarClientePorID(3);
            clientes.forEach(System.out::println);

            /** USAMOS EL MÉTODO DE CONTABLE **/
            System.out.println("===== Obtenemos el Total de Clientes =====");
            System.out.println(repositorio.contar());

            /** Buscamos por id */
            System.out.println("===== Obtenemos Cliente por id =====");
            System.out.println(repositorio.mostrarClientePorID(2));

        }catch (LecturaDatosException e){ // 1º DEBEMOS MANEJAR DESDE EL MÁS ESPECÍFICO, AL MÁS GENÉRICO
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (EscrituraDatosException e) { // nº DEBEMOS MANEJAR DESDE EL MÁS ESPECÍFICO, AL MÁS GENÉRICO
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (AccesoDatosException e){ // nº DEBEMOS IR DEL MÁS ESPECÍFICO AL MÁS GENÉRICO
            System.out.println(e.getMessage());
            e.printStackTrace();
        }




    }
}
