package ClaseString;

public class StringMetodosArreglo {
    public static void main(String[] args) {

        /**
         * VAMOS A VER UN STRING A MODO DE ARRAY
         * **/

        /** Declaramos un String y lo convertimos a un Array de char*/
        String trabalenguas = "trabalenguas";

        //declaramos el char[] y lo inicializamos mediante la función toCharArray();
        char[] arreglo = trabalenguas.toCharArray();

        /** Si imprimimos arreglo por consola nos va a mostrar solo la referencia */
        System.out.println("arreglo = " + arreglo); // --> [C@4dd8dc3

        /** para obtener los valores hay que recorrerlo con iteración */
        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]); // en cada iteración va a imprimir una línea sin hacer salto de línea (NO-ln)
        }

        /** Sobre el length */

        // usado desde el String el length() es en método
        int longitudString = trabalenguas.length(); // valor = trabalenguas12
        System.out.println(longitudString);

        // usado sobre el array es un atributo
        int longitudArray = arreglo.length; // valor = 12
        System.out.println("longitudArray = " + longitudArray);

        System.out.println("\n");
        /** FUNCIÓN SPLIT() */
        /** Nos permite separar un String en índices de array mediante un identificador dado */

        String frase = "las luces de la ciudad lucen cuales luceros del alba";
        //usamos la función split() para crear el array
        String[] palabras = frase.split(" "); // usaremos el espacio como separador
        //iteramos sobre él e imprimimos
        for (int i = 0; i < palabras.length; i++){
            System.out.println("frase = " + palabras[i]);
        }

        /** Con split() podemos usar cualquier carácter como separador
         * --> DEBEMOS TENER EN CUENTA QUE
         *     --> La entrada del argumento nos pide una expresión regular (regex)
         *     --> Por lo que es conveniente escapar los signos y símbolos \\.
         *     --> También se pueden poner entre corchetes [.]
         * */

        /** USANDO SPLIT() PARA OBTENER LA EXTENSIÓN DE ARCHIVO */

        String archivo = "Don Quijote de la Mancha.pdf";
        String[] arrayArch = archivo.split("[.]"); // entre corchetes el punto para evitar la reg-ex
        // Sabemos que la extensión es el último elemento, solo hacemos lo siguiente:
        System.out.println("\nextensión de archivo = " + arrayArch[arrayArch.length -1]);
        // o bien esto:
        String extension = arrayArch[arrayArch.length -1];
        System.out.println("extension = " + extension);

        // el bucle es solo para el ejemplo, no es necesario para obtener la extensión de archivo
        for (int i = 0; i < arrayArch.length; i++){
            System.out.println("arrayArch = " + arrayArch[i]);
        }

        /** lo intentamos con otros ejemplos y de una forma más elegante */
        String arch1 = "Las Tortugas Ninja.THE MOVIE.webm";
        String[] arr1 = arch1.split("[.]");
        String ext1 = arr1[arr1.length -1];
        System.out.println("arch1 = " + ext1);


    }
}
