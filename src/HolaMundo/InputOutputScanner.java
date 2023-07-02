
package HolaMundo;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputOutputScanner {
    public static void main(String[] args) {
        /**
         * VAMOS A TOMAR UN VALOR DE ENTRADA POR PARTE DEL USUARIO
         * --> En este ejemplo, necesitamos que el usuario ingrese un entero,
         *     usaremos la clase Scanner para un input por consola
         * --> Debemos tener en cuenta que el usuario podría poner un dato no válido
         *     esto nos llevaría a un error y la aplicación se rompe,
         * --> Necesitamos controlar el flujo para errores previstos (bloque try - catch)
         * --> Vamos a tomar una cadena de caracteres en una variable
         * --> Vamos a convertirla a int con Integer en otra variable
         * */
        /*
        * para el manejo de errores, si provocamos de error, vemos la Excepción que lanza:
        * Exception in thread "main" java.lang.NumberFormatException: For input string: "xxx"
         --> Debemos capturar cada error posible si es posible gestionarlo en el bloque catch
        * */

        // necesitamos nuestro bloque try --> el catch al final
        try {
            // para usar Scanner (no es static) debemos instanciar un objeto de la clase
            Scanner scanner = new Scanner(System.in); // usamos la entrada por defecto
            System.out.println("Ingrese un número entero"); // mensaje para el usuario
            String numString = scanner.nextLine(); // usamos método nextLine() de Scanner para obtener la línea input del Usuario
            // Convertimos los String obtenidos a Integer
            int numInt = Integer.parseInt(numString);
            System.out.println("Ingrese el número para operar con el anterior");
            /** con Scanner podemos obtener directamente un entero */
            int operadorInt = scanner.nextInt();
            // nos ahorramos el paso de convertirlo, pero debemos capturar otro posible error en el catch

            // hacemos cosas con los números obtenidos
            // esto podría ser el argumento de otros métodos
            int suma = numInt + operadorInt;
            int resta = numInt - operadorInt;
            int multi = numInt * operadorInt;
            int div = numInt / operadorInt;
            int resto = numInt % operadorInt;

            // mostramos el mensaje por consola con el resultado de las operaciones
            // solo usamos el out por defecto

            System.out.println("RESULTADO DE LAS OPERACIONES: \n " +
                    "\n# SUMA --> "+suma+"\n# RESTA --> "+resta+"\n# MULTIPLICACIÓN --> "+multi+"\n# DIVISIÓN --> "+div+"\n# RESTO --> "+resto+
                    "\n# EL PROGRAMA HA FINALIZADO CON ÉXITO, \n# para volver a iniciarlo pulse 'play' en el panel de arriba ");

        }catch (NumberFormatException e) { // error para el input string
            // como es por consola solo ponemos un sout
            System.out.println("ERROR!!\nSolamente validos números enteros");
            main(args); // y volvemos a ejecutar el main
        }catch (InputMismatchException e){ // error para el input int
            System.out.println("ERROR!!\nSolamente validos números enteros");
            main(args); // y volvemos a ejecutar el main
        }
        /** Si no sabemos qu excepción debemos capturar, podemos capturar la excepción genérica,
         * ya que todas heredan de la clase Excepcion
         * ej.--> }catch (Exception e){
         *          ... instrucciones ... }*/

    }
}
