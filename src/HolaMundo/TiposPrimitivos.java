package HolaMundo;

public class TiposPrimitivos {
    public static void main(String[] args) {
        /**
         * TIPO DE DATOS PRIMITIVOS
         * -> Tipo y nombre debe empezar en minúscula
         * -> Contienen sólo el valor (no son instancias de clases)
         * -> Diferentes espacios en memoria
         * -> Diferentes utilidades:
         *
         * -- EJEMPLOS -->                  */

        // valores booleanos (1bit)
        boolean b1 = true;
        boolean b2 = false; // VALOR POR DEFECTO

        // caracteres (16 bit)
        char c1 = 'a'; // comillas simples
        char c2 = '1'; // literal del número 1
        char c3 = '\u0021'; // ejemplo del unicode --> !

        // números enteros, tenemos 4 tipos
        byte eByte = 127; // (8 bit) valores entre -128 y 127
        short eShort = 32767; // (16 bit) valores entre -32768 y 32767
        int eInt = 2147483647; // (32 bit) valores entre -2147483648 y 2147483647
        long eLong = 9223372036854775807L; // (64 bit)  debe tener sufijo 'L'

        // números reales
        float realf = 3.1416f; // precisión simple sufijo f
        double reald = 4.7029235E3; // precisión doble

        /** TODOS ESTOS TIPOS PRIMITIVOS TIENEN SU CORRESPONDENCIA CON
         * SUS CLASES ENVOLTORIO / REFERENCIA Y SUS RESPECTIVOS MÉTODOS
         *
         * -> boolean --> Boolean
         * -> char --> Character
         * -> byte --> Byte
         * -> short --> Short
         * -> int --> Interger */

    }
}
