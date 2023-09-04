package API_Collection.Map.EjemploHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /**
         * Sistema de almacenamiento par Clave-Valor (las claves deben ser únicas)
         * **/

        /** Creamos un elemento (persona) y en el constructor:
         * Debemos indicar el tipo de dato de la clave y del valor **/
        Map<String, String> persona = new HashMap<>();

        /** Para agregar atributos al elemento usamos el método put() */
        persona.put("nombre", "David");
        persona.put("apellidos", "Gutiérrez Pérez");
        persona.put("email", "david_gutierrez@email.com");
        persona.put("edad", "39"); // recordamos que debemos respetar el tipo de dato elegido

        /** EL resultado de este elemento persona será un array con todos los pares clave-valor inicializados **/
        System.out.println("persona = " + persona);

        /** Podemos tener una clave null mientas no se repita */
        persona.put(null, "hola");
        System.out.println("persona = " + persona);

        /** En el valor puedo tener todos los null y valores repetidos que quiera */
        persona.put("altura", null);
        persona.put("peso", null);
        persona.put("saludo", "hola");
        System.out.println("persona = " + persona);

        /** Si repetimos una clave se va a sobreescribir la anterior */
        persona.put("email", "david@gmail.com");
        System.out.println("persona = " + persona);

        /** Podemos imprimir o inicializar variables con el valor mediante get() */
        System.out.println("persona.get(\"nombre\") = " + persona.get("nombre"));
        String apellidos = persona.get("apellidos");
        System.out.println("apellidos de persona = " + apellidos);


    }
}
