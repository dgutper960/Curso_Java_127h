package ClaseString;

public class MetodosDeString {
    public static void main(String[] args) {

        String nombre = "David";
        String apellidos = "Gutiérrez Pérez";
        String nombreCompleto = nombre+" "+apellidos;

        //saber la longitud de la cadena
        System.out.println("nombreCompleto.length() = " + nombreCompleto.length());

        //pasar tó a mayúsculas
        System.out.println("nombre.toUpperCase() = " + nombreCompleto.toUpperCase());

        //pasar tó a minúsculas
        System.out.println("nombre.toLowerCase() = " + nombreCompleto.toLowerCase());

        //comparar dos String
        System.out.println("nombre.equals() = " + nombre.equals("David")); // true
        System.out.println("nombre.equals() = " + nombre.equals(apellidos));  // false

        //obviar las mayúsculas y minúsculas
        System.out.println("apellidos.equalsIgnoreCase() = " + apellidos.equalsIgnoreCase("gutiérrez pérez")); //true

        //compara el orden lexico-gráfico
        System.out.println("nombre.compareTo() = " + nombre.compareTo("David")); // --> da 0 porque no hay diferencias en el orden Unicode
        System.out.println("nombre.compareTo() = " + nombre.compareTo("Andrés")); //--> 3
        System.out.println("nombre.compareTo() = " + nombre.compareTo(nombreCompleto)); // -16

        //obtener carácter a partir del índice
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // recordamos que empiezan desde 0
        System.out.println("nombre.charAt(nombre.length() -1) = " + nombre.charAt(nombre.length() -1));

        //para extraer un fragmento dado por argumento
                //desde (inclusive) hasta el final
        System.out.println(" nombre.substring(1)= " + nombre.substring(1)); // extrae 'avid'
                //desde (inclusive) hasta un valor dado (no inclusive)
        System.out.println("nombreCompleto.substring(0, 5) = " + nombreCompleto.substring(0, 5)); // extrae 'David'

        //reemplazar un carácter o secuencia de caracteres
        System.out.println("nombreCompleto.replace('é', 'e') = " + nombreCompleto.replace('é', 'e'));
        System.out.println("nombreCompleto.replace(' ', '_') = " + nombreCompleto.replace(' ', '_'));
        System.out.println("nombreCompleto.replace(\"avid\", \"AVID\") = " + nombreCompleto.replace("avid", "AVID"));

        //retornar la primera posición de índice del carácter o secuencia por argumento
        System.out.println("nombreCompleto.indexOf('é') = " + nombreCompleto.indexOf('é')); // --> 10

        //retornar la última posición de índice del carácter o secuencia por argumento
        System.out.println("nombreCompleto.lastIndexOf('é') = " + nombreCompleto.lastIndexOf('é')); // --> 17

        //para saber si está o no una secuencia, retorna booleano
        System.out.println("nombre.contains(\"z\") = " + nombre.contains("z")); // false
        System.out.println("nombre.contains(\"avi\") = " + nombre.contains("avi")); // true

        //saber si comienza con
        System.out.println("nombre.startsWith(\"Da\") = " + nombre.startsWith("Da"));

        //quitamos espacios en blanco accidentales
        System.out.println("nombreCompleto.trim() = " + nombreCompleto.trim());














    }
}
