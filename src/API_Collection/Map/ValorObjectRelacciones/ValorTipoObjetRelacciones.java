package API_Collection.Map.ValorObjectRelacciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValorTipoObjetRelacciones {
    public static void main(String[] args) {

        /** MODIFICAMOS EL EJEMPLO ANTERIOR:
         * --> CAMBIAMOS EL TIPO DEL VALOR A OBJECT (el más genérico posible)  */

        Map<String, Object> persona = new HashMap<>();

        persona.put("nombre", "David"); // es tipo Object, admite String
        persona.put("apellido1", "Gutiérrez");
        persona.put("apellido2", "Pérez");
        persona.put("apellidos", "Gutiérrez Pérez");
        persona.put("email", "david_gutierrez@email.com");
        persona.put("edad", 39); // es tipo Object, admite Integer
        persona.put("altura", null);
        persona.put("peso", null);

        /** Creamos un Map para la dirección con sus propios elementos */
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "España");
        direccion.put("comunidad", "Andalucía");
        direccion.put("provincia", "Cádiz");
        direccion.put("localidad", "Ubrique");
        direccion.put("cod_postal", "11600");
        direccion.put("calle_via", "Guadalquivir");
        direccion.put("numero", "sn");

        /** Asignamos un Objeto HashMap como un elemento de persona (ahora los valores son tipo Object) **/
        persona.put("direccion", direccion);

        /** PODEMOS VERLO COMO UNO DE LOS CAMPOS DEL "ARRAY persona" QUE ES OTRO "ARRAY direccion" **/
        System.out.println("persona = " + persona);

        /** En el caso de que quisiéramos trabajar solo con los elementos de direccion:
         * --> podemos usar todos los métodos de List y Map directamente en direccion */
        String codPostal = direccion.get("cod_postal");
        System.out.println("El codigo postal de "+persona.get("nombre")+ " es "+codPostal);

         /** --> podemos inicializar direccion de la persona creando otro HashMap */
        // En este caso, debemos hacer el cast de Object a String
        Map<String, String> direccionPersona = new HashMap<>((Map<String, String>) persona.get("direccion"));
        /** Podemos inicializar variables con los diferentes elementos de direccion */
        String pais = direccionPersona.get("pais");
        String provincia = direccionPersona.get("provincia");
        System.out.println("La persona "+persona.get("nombre")+" "+persona.get("apellidos")+
                " reside en la provincia de "+provincia+
                " ("+pais+")");

        /** Si queremos inicializar con una clave que no existe o que es null podemos usar
         * --> .getOrDefault() y ponemos conjunto por defecto **/
        String distrito = direccionPersona.getOrDefault("distrito", "El Algarrobal");
        System.out.println("y su barrio o zona es "+distrito);


        System.out.println("\n");

        /** Podemos iterar las claves usando la API Set y el método keySet() de Map */
        System.out.println("=== Claves ===");
        Set<String> claves = persona.keySet();
        /** iteramos con foreach */
        for (String k: claves){
            System.out.println(k);
        }

        /** Podemos iterar los valores usando la API Collection y el método values() de Map */
        System.out.println("\n=== Valores ===");
        Collection<Object> valores = persona.values();
        /** iteramos con foreach */
        for (Object v: valores) {
            System.out.println(v);
        }

        /** Podemos iterar los conjuntos Clave-Valor con la Clase Entry de Map (clase Inner de Map) **/
        System.out.println("\n=== Conjuntos con foreach ===");
        for (Map.Entry<String, Object> par: persona.entrySet()){
            System.out.println(par);
            //System.out.println(par.getKey()+" => "+par.getValue()); // lo mismo de arriba pero personalizado
        }

        /** Podemos iterar los conjuntos Clave-Valor con el método forEach y expresión LAMBDA simplificada  **/
        System.out.println("\n=== Conjuntos con forEach() y expresión LAMBDA ===");
        persona.forEach((clave, valor) -> {
            System.out.println(clave+" => "+valor);
        });


        /** AL IGUAL QUE SET, LOS MAP NO MANTIENEN NINGÚN TIPO DE ORDEN
         * -> Podemos tener Map ordenados con TreeMap (lo veremos en otra package) **/


    }
}
