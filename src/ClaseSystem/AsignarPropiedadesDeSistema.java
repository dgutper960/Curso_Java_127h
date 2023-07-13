package ClaseSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * PARA ESTE EJEMPLO DEBEMOS CREAR UN ARCHIVO CON LA EXTENSIÓN .properties
 *      EN EL ARCHIVO
 * --> Combinación par clave valor separados por un signo igual (=)
 * --> Se escribe en minúscula
 * --> Las palabras compuestas se separan por puntos
 * */

public class AsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        /** UNA VEZ TENEMOS EL ARCHIVO DE CONFIGURACIÓN CREADO
         * DEBEMOS PARARLO COMO INPUT A NUESTRO SISTEMA **/

        /** Creamos un objeto FileInputStream para el flujo de datos
         * --> debemos pasar la ruta como argumento
         * --> debemos manejar obligatoriamente el posible error de que el archivo no se encuentre **/
        try {
            FileInputStream archivo = new FileInputStream("src/ClaseSystem/mi_configuración.properties");

            /** Debemos agregar este objeto a un objeto Properties
             * --> Creamos el objeto y cargamos las configuraciones standard
             * --> Cargamos la configuración personalizada
             * --> También podemos agregar nuevas configuraciones */
            Properties propiedaesNuevas = new Properties(System.getProperties());
            propiedaesNuevas.load(archivo); // NOS ADVIERTE DE QUE SE DEBE MANEJAR OTRO ERROR
            propiedaesNuevas.setProperty("mi.nueva.config","Nueva configuracion"); // clave y valor separados por coma

            /** Si en este momento, imprimimos todas las configuraciones vemos que las nuevas no están */
            System.getProperties().list(System.out); // LAS CONFIGURACIONES NUEVAS NO APARECEN
            /** Esto es porque antes debemos actualizar las propiedades con las nuevas como argumento **/
            System.setProperties(propiedaesNuevas); // OJO EN PLURAL

            //LLAMANDO AL MISMO MÉTODO PODEMOS AÑADIR SOLO UNA
            System.setProperty("clave.propiedad","Valor Propiedad");

            /** VOLVEMOS A IMPRIMIR A VER SI APARECEN TODAS */
            System.getProperties().list(System.out);

            /** PARA IMPRIMIR SOLO UNA */
            System.out.println("propiedaesNuevas.getProperty(\"clave.propiedad\") = " + propiedaesNuevas.getProperty("clave.propiedad"));
            /** O si está actualizado ya también directamente de System */
            System.out.println(System.getProperty("nombre.autor"));




        } catch (Exception e) { // MANEJAMOS EL ERROR DE FORMA GENÉRICA PARA EVITAR MAYORES CONFLICTOS
            System.out.println("¡¡ERROR!!\nNO SE HA ENCONTRADO EL ARCHIVO");
            throw new RuntimeException(e);
        }

    }
}
