package ManejoDeErrores.EnProyectoRepositorioCRUD;

import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.AccesoDatosException;
import ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones.LecturaDatosException;
import ManejoDeErrores.EnProyectoRepositorioCRUD.listas.ProductosListaRepositorio;
import ManejoDeErrores.EnProyectoRepositorioCRUD.modelo.Producto;
import ManejoDeErrores.EnProyectoRepositorioCRUD.repositorio.Orden;
import ManejoDeErrores.EnProyectoRepositorioCRUD.repositorio.Unificable;

import java.util.List;

public class PrincipalProducto {
    public static void main(String[] args) {

        try{

            /** Creamos una instancia de ClienteListRepositorio con su tipo más genérico posible (CrudRepositorio) **/
            Unificable<Producto> repositorio = new ProductosListaRepositorio();
            // añadimos clientes a la lista
            repositorio.insertarCliente(new Producto("Mochila Multiuso", 39.54)); // CON DOS APELLIDOS, NO ORDENA BIEN
            repositorio.insertarCliente(new Producto("Tienda Campaña", 487.95));
            repositorio.insertarCliente(new Producto("Lona impermeable", 25.90));
            repositorio.insertarCliente(new Producto("Kit gas", 37.80));

            /** EL método listarClientes retorna una List<Cliente> lo usamos con expresión LAMBDA */
            System.out.println("===== Lista Clientes =====");
            List<Producto> productos = repositorio.listarClientes();
            productos.forEach(System.out::println);

            /** Paginamos (desde, hasta)*/
            System.out.println("===== Subconjunto Paginable =====");
            List<Producto> paginar = repositorio.listarClientes(2, 3); // tiene en cuenta el índice, último no inclusive
            paginar.forEach(System.out::println);

            /** Ordenamos asc por apellido */ // CON DOS APELLIDOS, NO ORDENA BIEN
            System.out.println("===== Lista Orden Asc =====");
            List<Producto> ordenAsc = repositorio.listarClientes("apellidos", Orden.ASC);
            ordenAsc.forEach(System.out::println);

            /** Ordenamos desc por apellido */ // CON DOS APELLIDOS, NO ORDENA BIEN
            System.out.println("===== Lista Orden Desc =====");
            List<Producto> ordenDesc = repositorio.listarClientes("apellidos", Orden.DESC);
            ordenDesc.forEach(System.out::println);

            /** Si queremos editar MUY IMPORTANTE EDITAR EL ID con set
             * Buscamos por id  **/
            System.out.println("===== Buscar por id =====");
            Producto id4= repositorio.mostrarClientePorID(4);
            System.out.println("id3.getNombre() = " + id4.getClass()+" "+id4.getPrecio());

            /** Editamos cliente con id 3. FUNDAMENTAL restaurar el id con set **/
            System.out.println("===== Editamos Cliente =====");
            id4 = new Producto("Carpa Kit Cocina", 350.0);
            id4.setId(4);
            repositorio.editarCliente(id4); // DATO DE ENTRADA ID
            // LISTAMOS TODOS LOS CLIENTES PARA VER SI LO HEMOS HECHO BIEN
            productos.forEach(System.out::println);
    //        ** CORREGIDO EN EL CÓDIGO -->// VEMOS QUE ESTÁN DESORDENADOS
    //        System.out.println("===== Lista Orden Asc por id =====");
    //        List<Cliente> ordenAsc2 = ((OrdenableRepositorio)repositorio).listarClientes("id", Orden.ASC);
    //        ordenAsc2.forEach(System.out::println);

            /** BORRAMOS A LOS FAMOSOS */
            System.out.println("===== Borramos los Clientes con id 3 y 4 =====");
            repositorio.eliminarClientePorID(4);
            repositorio.eliminarClientePorID(3);
            productos.forEach(System.out::println);

            /** USAMOS EL MÉTODO DE CONTABLE **/
            System.out.println("===== Obtenemos el Total de Clientes =====");
            System.out.println(repositorio.contar());

        }catch (LecturaDatosException e){ // 1º DEBEMOS MANEJAR DESDE EL MÁS ESPECÍFICO, AL MÁS GENÉRICO
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (AccesoDatosException e){ // nº DEBEMOS IR DEL MÁS ESPECÍFICO AL MÁS GENÉRICO
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}