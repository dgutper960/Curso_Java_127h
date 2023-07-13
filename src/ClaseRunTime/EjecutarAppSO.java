package ClaseRunTime;

import java.io.IOException;

public class EjecutarAppSO {
    public static void main(String[] args) {
        /**
         * CON ESTA CLASE PODEMOS EJECUTAR APLICACIONES DEL SISTEMA
         *
         * **/
        try {

            /** Creamos objeto de Runtime */
            Runtime rt = Runtime.getRuntime();
            /** Creamos objeto Process para el proceso */
            Process proceso; // la dejamos definida
            /** NECESITAMOS SABER CON QUÉ SO ESTAMOS TRABAJANDO **/
            if (System.getProperty("os.name").toLowerCase().contains("windows")) { // .toLowerCase().contains() para asegurar que es correcto
                // debemos ejecutar el comando correspondiente para arrancar la App
                proceso = rt.exec("notepad"); // MANEJO OBLIGATORIO DE EXCEPCIÓN (no existe el comando)
            }else {
                proceso = rt.exec("gedit"); // EN CASO DE NO SER WINDOWS, PODEMOS AÑADIR MÁS SO CON OTROS else-if
            }
            // PARA QUE EL PROGRAMA QUEDE ESPERANDO A QUE LO CERREMOS
            proceso.waitFor(); //EXIGE MANEJO DE ERROR
        }catch (Exception e){
            System.err.println("El comando introducido no es correcto "+e.getMessage());
            System.exit(0);
        }
    }
}
