package ClaseSystem;

import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        /**
         * UN MAPA O DICCIONARIO EN JAVA ES UN ARREGLO ASOCIATIVO
         * RELACIONA ELEMENTOS MEDIANTE PARES CLAVE-VALOR
         * --> Guardamos elementos u objetos de cualquier tipo asignados a un nombre
         * **/

        /**
         * Creamos un objeto Mapa para almacenar todas las variables de entorno
         * --> Palabra clave Map
         * --> Entre menor y mayor el tipo de dato de la clave y del valor
         * --> Nombre del objeto en sí
         * --> Inicializamos con el método System.getenv() que toma todas las variables de entorno
         * **/

        Map<String, String> variablesEntorno = System.getenv();
        //Imprimimos
        System.out.println("Todas las variablesEntorno del sistema = " + variablesEntorno);

        /** Para obtener una en particular hacemos lo mismo, pero pasamos la variable de entorno por argumento
         * --> Vamos a tener solo un retorno por lo que no hace falta el Map */
        String nombreUsuario = System.getenv("USERNAME");
        System.out.println("nombreUsuario = " + nombreUsuario);

        /** Si queremos iterar sobre el mapa lo podemos hacer a modo de Array,
         * pero debemos acceder a los métodos .keySet (tomar la clave) y .get (tomar el valor) de Map */
        for (String variable : variablesEntorno.keySet()) {
            System.out.println(variable+" --> "+variablesEntorno.get(variable));
        }

        /** Otro ejemplo para el path que devuelve todos los comandos **/
        // usando el ejemplo anterior
        String path = System.getenv("Path");
        System.out.println("path = " + path);
        // usando el mapa para tomar solo la del argumento
        String path2 = variablesEntorno.get("Path");
        System.out.println("path2 = " + path2);

    }
}
