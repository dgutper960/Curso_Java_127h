package POO.ProyectoFacturas.org.david.appfacturas;
/***
 * OBSERVAMOS QUE ESTA CLASE ESTÁ EN LA RAÍZ
 * DE appfacturas
 * POSTERIORMENTE ESTÁ modelo QUE CONTIENE EL CÓDIGO QUE MANEJA LOS DATOS DE LA APP
 * Como vamos a acceder a clases que están en otro paquete,
 * debemos importar el paquete
 * **/
import POO.ProyectoFacturas.org.david.appfacturas.modelo.*;

import java.util.Scanner;

public class EntradaAppFacturas {
    public static void main(String[] args) {

        //CREAMOS UNA CLASE SCANNER PARA QUE LA FACTURA SEA DINÁMICA
        Scanner input = new Scanner(System.in);
        Cilente cliente = new Cilente();

        System.out.println("BIENVENID@ AL GENERADOR DE FACTURAS\n" +
                "Ingrese la descripción de su pedido");
        String desc = input.nextLine();
        System.out.println("Ingrese su nombre de cliente");
        String nomCliente = input.nextLine();
        System.out.println("Ingrese su DNI");
        String nifCliente = input.nextLine();

        cliente.setNombre(nomCliente);
        cliente.setNif(nifCliente);

        System.out.println("Ingrese la cantidad de artículos comprados");
        int num = input.nextInt();

        Factura factura = new Factura(desc, cliente);

        Producto producto;

        for (int i =1; i<=num; i++){
            producto = new Producto();

            System.out.println("Ingrese el nombre del producto "+producto.getCodigo()+":");
            producto.setNombre(input.next());

            System.out.print("Ingrese el precio del producto ");
            producto.setPrecio(input.nextFloat());

            System.out.print("Ingrese la cantidad adquirida ");
            //CREAMOS NUEVA LINEA CON LOS DATOS RECIBIDOS
//          LineasFactura linea = new LineasFactura(input.nextInt(), producto); --> Creado directamente en el argumento de la función
            //ASIGNAMOS LA LÍNEA A LA FACTURA
            factura.addLineaFactura(new LineasFactura(input.nextInt(), producto));

            System.out.println("---------------------");
            input.nextLine();
        } // UNA VEZ TERMINADO EL FOR, MOSTRAMOS LOS DETALLES DE LA FACTURA

        System.out.println(factura);

    }
}
