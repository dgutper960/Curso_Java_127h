package HolaMundo;

public class Variables {
    public static void main(String[] args) {
        /** Las variables siguen las sig convenciones en Java:
         * 1. Empiezan por una letra minúscula, subrayado o símbolo de dólar.
         * 2. Caracteres en Unicode, evitar caracteres especiales.
         * 3. No palabras reservadas.
         * 4. Nombre único en el mismo ámbito o bloque.
         * 5. Para más de una palabra uso de camelCase.
         * 6. En la declaración siempre se debe poner el tipo y el nombre.
         * --> EJEMPLOS  --> \n      */

        /** Clase envoltorio o referencia String, se escriben en mayúsculas */
        // Tipo nombre = valor
        String saludar = "Hola Mundo, esto es una instancia de la clase String";
        /* Los String son clases completas y sus métodos pueden ser llamados desde sus instancias
        * llamamos al método toUpperCase() de String con la variable String 'saludar'*/
        System.out.println("Llamamos a toUpperCase de saludar --> "+saludar.toUpperCase());

        Integer numero = 12;
        // Es una instancia y Tiene métodos
        System.out.println("Llamamos a compareTo de num --> "+numero.compareTo(14));

        /** Tipo primitivos, se escriben en minúscula */
        // tipo nombre = valor
        int num = 10;
        // numero. --> Solo representan valores, no tienen métodos
        System.out.println("Imprimimos primitivo el valor del primitivo num --> "+num);

        /** PODEMOS DECLARAR VARIABLES DE TIPO DINÁMICO */
        var trece = 13; // el tipo de dato cambia según el contexto del valor
        var doce = "doce";

        System.out.println(doce+" y "+trece);

        /** Uso de variables en contexto de bloque */
        // declaramos variables a nivel de main
        String nombre = "Lucía";
        int n = 14; // las variables deben ser inicializadas
        // abrimos bloque if y podemos usar las variables del bloque de fuera
        if (n > 12){ // si declaramos una variable en este bloque, solo será visible dentro del mismo
            nombre = "Mara"; // una vez entra en una condición se hace un brake automático
        } else if (n == 14) { // como se ha entrado al bloque anterior, el flujo no llega a este
            nombre = "Caro";
        }
        System.out.println(nombre); // se imprime nombre según e resultado de la condicional

    }
}
