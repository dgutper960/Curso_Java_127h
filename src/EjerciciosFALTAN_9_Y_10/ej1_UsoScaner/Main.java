package EjerciciosFALTAN_9_Y_10.ej1_UsoScaner;

import java.util.Scanner;

/** Se requiere desarrollar un programa que reciba datos de la factura
 * utilizando la clase Scanner */

public class Main {
    public static void main(String[] args) {

        try {
            // instanciamos objeto de Scanner
            Scanner inputDatos = new Scanner(System.in);

            // pedimos los datos por consola
            System.out.println("Introduzca su nombre");
            // suponiendo que vamos a recibir un String
            String nombre = inputDatos.nextLine();
            // Seguimos pidiendo y capturando datos
            System.out.println("Introduzca el nombre del producto");
            String producto = inputDatos.nextLine();

            System.out.println("Introduzca el precio (valor decimal)");
            float precio = inputDatos.nextFloat(); // este dato debe ser float

            System.out.println("Introduzca la cantidad adquirida (valor núm entero)");
            int cantidad = inputDatos.nextInt(); // este dato debe ser un entero

            System.out.println("Introduzca el iva \nej.- para un iva del 21% introduzca 0,21 ");
            float iva = inputDatos.nextFloat();

            //creamos una variable para calcular el precio bruto y total
            float precioBruto = cantidad*precio;
            float precioTotal = precioBruto+(precioBruto*iva);

            // imprimimos en consola los datos finales
            System.out.println("\nDATOS DE LA FACTURA:\n" +
                    "\nNombre cliente: " + nombre +
                    "\nProducto adquirido: " + producto +
                    "\nPrecio producto: " + precio+
                    "\nCantidad adquirida: " + cantidad+
                    "\nIVA correspondiente: " + iva+
                    "\nPrecio bruto: " + precioBruto+
                    "\nPrecio con IVA: " + precioTotal);
        // En caso de error al introducir los datos
        }catch (Exception e){
            System.out.println("ERROR!!\nLos datos introducidos no son correctos \nRevise que los datos corresponden con lo que se solicita");
            main(args); // llamada recursiva a main() en caso de error
        }
    }
}
