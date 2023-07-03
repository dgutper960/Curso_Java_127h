package Primitivos;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        /** Siempre debemos inicializar los char con comillas simples */
        char c1 = 'a';
        char c2 = '5';
        System.out.println(c1+c2);

        /** Java trabaja con el mapa de caracteres Unicode */
        /* se puede revisar la equivalencia unicode o a entero decimal en el sistema o en Google --> rapidtables.com
        * de manera que podemos inicializar un carácter mediante el unicode o decimal correspondiente */
        char unicode = '\u0040'; // vemos que el sistema lo ha reconocido como '@'
        char decimal = 64; // vemos que el valor es también '@'
        System.out.println("El unicode u0040 corresponde a --> "+unicode+
                "\nEl unicode u0040 corresponde a --> "+decimal);
        System.out.println("Los valores de unicode y decimal son iguales?? "+(unicode == decimal));

        // para símbolos complejos se puede simplemente copiar de otra fuente por ej --> rapidtables.com
        char c3 = 'Æ';
        System.out.println(c3);

        /** Si declaramos con var debemos tener cuidado de no inicializar mediante decimal, ya que lo tomará como int */
        var c4 = '\u0040';  // es char
        var c5 = 64; // este literal lo va a tomar como '64' y no como '@'
        var c6 = '@'; // es char

        /** CARACTERES ESPECIALES */
        char espacio = ' '; // unicode u0020 --> '\u0020'
        char retroceso = '\b'; // elimina el último carácter del print
        char tabulador = '\t';
        char saltoLinea = '\n'; // salto linea
        char retornoCarro = '\r'; // reinicia la línea (comportamiento varía según SO)
        /** estos caracteres se puede usar igualmente en mitad de un string */

        System.out.println("Veamos las características de tamaño char con Character");
        System.out.println("Tamaño de char de bytes --> "+Character.BYTES);
        System.out.println("Tamaño de char de bites --> "+Character.SIZE);
        System.out.println("Valor mínimo --> "+Character.MIN_VALUE);
        System.out.println("Valor máximo --> "+Character.MAX_VALUE);

    }
}
