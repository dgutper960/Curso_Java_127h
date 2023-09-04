package API_Collection.Map.EjemploHashMap;

import java.util.*;

public class PrincipalesMetodosHashMap {
    public static void main(String[] args) {

        /** Veamos los principales métodos de Map */

        Map<String, String> persona = new HashMap<>();

        persona.put("nombre", "David");
        persona.put("apellido1", "Gutiérrez");
        persona.put("apellido2", "Pérez");
        persona.put("apellidos", "Gutiérrez Pérez");
        persona.put("email", "david_gutierrez@email.com");
        persona.put("edad", "39"); // recordamos que debemos respetar el tipo de dato elegido
        persona.put("altura", null);
        persona.put("peso", null);

        System.out.println("persona = " + persona);

        /** Podemos usar los métodos comunes a las listas
         * y además los propios del Map */


        /** Eliminar atributo */
        persona.remove("apellido1"); // Solo con la clave -retorna-> String = "Gutiérrez"
        persona.remove("apellido2", "perez"); // con par Clave-Valor que deben ser exactos -> boolean = false
        System.out.println("persona = " + persona);
        persona.remove("apellido2", "Pérez"); // -retorna-> booleano = true
        System.out.println("persona = " + persona);

        /** ContainsKey y ContainsValue **/
        System.out.println("¿Contiene clave \"apellido1\"? "+persona.containsKey("apellido1")); // -retorna-> booleano = false
        System.out.println("¿Contiene valor \"null\"? "+persona.containsValue(null));// -retorna-> booleano = true
        System.out.println("¿Contiene clave \"email\"? "+persona.containsKey("email"));// -retorna-> booleano = true

        /** Vemos el número de conjuntos **/
        System.out.println("La persona tiene un total de "+persona.size()+" elementos");

        /** Esta vacío? **/
        boolean esVacio = persona.isEmpty();
        System.out.println("¿Hay elementos en persona? "+!esVacio); // contesta si está vacío, de debe negar

        /** Modificamos elementos **/
        // indicando solo la clave
        persona.replace("edad", "40");
        // indicando el oldValue y el newValue
        persona.replace("edad", "39", "41"); // no lo reemplaza porque 39 ya no existe
        System.out.println("¿Cuántos años tiene la persona? "+persona.get("edad"));

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
        Collection<String> valores = persona.values();
        /** iteramos con foreach */
        for (String v: valores) {
            System.out.println(v);
        }

        /** Podemos iterar los conjuntos Clave-Valor con la Clase Entry de Map (clase Inner de Map) **/
        System.out.println("\n=== Conjuntos con foreach ===");
        for (Map.Entry<String, String> par: persona.entrySet()){
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
