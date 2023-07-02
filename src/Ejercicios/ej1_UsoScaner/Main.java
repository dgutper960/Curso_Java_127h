package Ejercicios.ej1_UsoScaner;

import java.util.Scanner;

/** Se requiere desarrollar un programa que reciba datos de la factura
 * utilizando la clase Scanner */

public class Main {
    public static void main(String[] args) {

        try {
            // instanciamos objeto de Scanner
            Scanner inputDatos = new Scanner(System.in);

            // pedimos los datos por consola
            System.out.println("Introduzca el dato 1");
            // suponiendo que vamos a recibir un String
            String dato1 = inputDatos.nextLine();
            // Seguimos pidiendo y capturando datos
            System.out.println("Introduzca el dato 2");
            String dato2 = inputDatos.nextLine();

            System.out.println("Introduzca el dato 3");
            String dato3 = inputDatos.nextLine();
            // imprimimos los datos introducidos
            System.out.println("Los datos introducidos son:" +
                    "\n" + dato1 +
                    "\n" + dato2 +
                    "\n" + dato3);
        // En caso de error al introducir los datos
        }catch (Exception e){
            System.out.println("El dato introducido no es correcto");
            main(args); // llamada recursiva a main() en caso de error
        }
    }
}
