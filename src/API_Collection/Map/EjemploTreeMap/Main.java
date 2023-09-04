package API_Collection.Map.EjemploTreeMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        /** Para este ejemplo usaremos la persona con la direccion anidada  */

        /** Creamos Map de persona, esta vez como treeMap (mapa ordenado)
         * --> TreeMap no admite null para la clave, ya que null, no se puede ordenar */
        Map<String, Object> persona = new TreeMap<>(String::compareToIgnoreCase);
                                                // (a, b) -> a.compareToIgnoreCase(b) //

        persona.put("nombre", "David"); // es tipo Object, admite String
        persona.put("apellido1", "Gutiérrez");
        persona.put("apellido2", "Pérez");
        persona.put("apellidos", "Gutiérrez Pérez");
        persona.put("email", "david_gutierrez@email.com");
        persona.put("edad", 39); // es tipo Object, admite Integer
        persona.put("altura", null);
        persona.put("peso", null);

        /** Creamos un HashMap para la dirección */
        Map<String, String> direccion = new TreeMap<>(Comparator.reverseOrder()); // orden descendente

        direccion.put("pais", "España");
        direccion.put("comunidad", "Andalucía");
        direccion.put("provincia", "Cádiz");
        direccion.put("localidad", "Ubrique");
        direccion.put("cod_postal", "11600");
        direccion.put("calle_via", "Guadalquivir");
        direccion.put("numero", "sn");

        /** Creamos otro Map para otro ejemplo de ordenación **/
        Map<String, String> direccionLaboral = new TreeMap<>(Comparator.comparing(String::length).reversed()); // por Largo del String
        direccionLaboral.put("localidad", "Ubrique");
        direccionLaboral.put("calle", "Camino del arroyo");
        direccionLaboral.put("numero", "23");


        /** Asignamos el Objeto HashMap direccion como un elemento de persona **/
        persona.put("direccion", direccion);
        persona.put("direccion laboral", direccionLaboral);



        System.out.println(persona);

        /**
         * COMO persona ES UN TREEMAP, AHORA SUS ELEMENTOS ESTÁN ORDENADOS DE FORMA NATURAL
         * --> Cuando direccion es un TreeMap también se ordena automáticamente
         * --> Podemos ordenar en el argumento de forma natural
         * --> Si tenemos un mapa de objetos podemos editar el compareTo()
         * **/

    }
}
