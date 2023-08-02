package ManejoDeErrores.EjemploExcepciones;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {


        try {
            /** Si en una aplicación dividimos entre 0
             * la ejecución nos va a lanzar un error **/
            int division = 10 / 0;// este error es posible manejarlo
            System.out.println(division);// si lo envolvemos en un bloque tri/catch
        } catch (
                Exception e) { /** Exception es la forma más genérica de manejar errores, lo conveniente es tratar cada error de forma específica  **/
            // con este código manejamos el error
            System.out.println("Error en tiempo de ejecución por dividir entre o" +
                    "\ne.getMessage() -> " + e.getMessage());// tomamos el método de Exception
        }// después de manejar la excepción, el flujo continúa (fuera del bloque try)
        System.out.println("El flujo del programa continúa...");
        int suma = 2 + 2;
        System.out.println("después de manejar el error seguimos\nsuma 2+2 = " + suma);


        /** Resolvemos el mismo error de manera específica **/
        try {
            int division = 10 / 0;
            System.out.println(division);
        } catch (ArithmeticException ae) { /** Tratamos el error de forma específica (lo ideal)*/
            System.out.println("Error en tiempo de ejecución por dividir entre o" +
                    "\ne.getMessage() -> " + ae.getMessage());
        } finally {
            /** ESte bloque es para cuando nos queremos asegurar que una tarea se realize **/
            System.out.println(" finally -> Esta acción es opcional y se ejecuta siempre ");
        }
        System.out.println("Y el flujo del programa continua ... ");

        /** Si queremos encadenar bloques catch debemos tener en cuenta el orden en lo que las Excepciones pueden surgir */
        try { // DENTRO DEL try DEBE DE ESTAR TÓ EL CONTEXTO QUE INTERVENGAN EN LOS ERRORES QUE VAN A SER MANEJADOS
            String valor = JOptionPane.showInputDialog("Ingrese un entero");
            int divisor = Integer.parseInt(valor);
            int division = 1000 / divisor;
        }catch (NumberFormatException nfe){ /* Manejamos primero la que se puede lanzar antes */
            System.out.println("Debe ingresar un entero "+nfe.getMessage());
            main(args); //REINICIAMOS EL MAIN
        } catch (ArithmeticException ae){ /* Vamos manejando conforme a las posibilidades de que vayan surgiendo **/
            System.err.println(ae.getMessage());
            System.out.println("No es posible dividir entre 0");
            main(args); //REINICIAMOS EL MAIN
        } finally {
            System.out.println(" finally -> Esta acción es opcional y se ejecuta siempre ");
        }
        System.out.println("Y el flujo del programa continua ... ");


    }
}
