package LineaDeComando;

public class EjemploLineaComando {
    public static void main(String[] args) {
        /**
         * REVISAREMOS LOS ARGUMENTOS (args) QUE RECIBE LA CLASE MAIN
         * VAMOS A ITERAR SOBRE EL STRING[] DE LA CLASE MAIN (args)
         * */

        /** Ponemos un if por si no se pasan argumentos */
        if(args.length==0){
            System.err.println("Debe introducir argumentos");
            System.err.println("Argumentos compuestos entre comillas dobles");
            System.exit(-1); // código de salida para errores (-1)
        }

        /** Veamos, iteramos sobre el array args de main */
        int argsLargo = args.length;//optimizamos un poco
        for (int i = 0; i > argsLargo; i++){
            System.out.println("El argumento "+i+" es --> "+args[i]);
        } /** SI EJECUTAMOS ESTO AQUÍ NO VA A PASAR NADA PORQUE ESTE MAIN NO TIENE ARGUMENTOS
         NECESITAMOS DÁRSELOS, VAMOS A VER UN EJEMPLO  **/


        /**
         * PARA COMPILARA UNA CLASE DEBEMOS IR A LA CONSOLA (del IDE o del sistema)
         * 1. POSICIONARNOS EN LA RUTA DE NUESTRA CLASE
         * 2. COMANDO javac _nombreClase_.java
         * 3. DEBERÍA APARECER NUESTRO FICHERO EN BYTECODE _nombreClase_.class
         * **/

        /**
         * UNA VEZ COMPILADA EJECUTAMOS VÍA CONSOLA
         * 1. NOS POSICIONAMOS EN LA RUTA DEL .class
         * 2. COMANDO java _nombreClase_ SIN EXTENSIÓN
         * */

        //LOS COMENTARIOS DAN ERROR AL COMPILAR
        //AL EJECUTAR NOS MUESTRA EL MENSAJE:
        /**Error: no se ha encontrado o cargado la clase principal EjemploLineaComando**/
        //INVESTIGAR COMO AÑADIR A PRODUCCIÓN

    }
}
