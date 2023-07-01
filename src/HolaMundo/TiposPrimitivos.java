package HolaMundo;

public class TiposPrimitivos {
    /** para usar variables sin inicializar dentro de un método cualquiera */
    // declaramos variable sin inicializar a nivel de clase
    static boolean porDefecto;
    public static void main(String[] args) {
        /**
         * TIPO DE DATOS PRIMITIVOS
         * --> Tipo y nombre debe empezar en minúscula
         * --> Contienen solo el valor (no son instancias de clases)
         * --> Diferentes espacios en memoria
         * --> Diferentes utilidades:
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

        // Veamos por consola algunas características de primitivos numéricos y sus envoltorios
        System.out.println("Características de primitivos numéricos y sus envoltorios:");

        byte numeroByte = 127; // valor máximo --> 128 debería ser short o int
        System.out.println("\n  El numeroByte es: "+numeroByte);
        System.out.println("tipo byte corresponde en bytes a = " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a = " + Byte.SIZE);
        System.out.println("Valor máximo de un byte en bytes: "+ Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte en bytes: "+ Byte.MIN_VALUE);

        short numeroShort = 32767; // valor máximo
        System.out.println("\n  El numeroShort es: "+numeroShort);
        System.out.println("tipo short corresponde en bytes a = " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a = " + Short.SIZE);
        System.out.println("Valor máximo de un short: "+ Short.MAX_VALUE);
        System.out.println("Valor mínimo de un shot: "+ Short.MIN_VALUE);

        int numeroInt = 2147483647; // valor máximo
        System.out.println("\n  El numeroInt es: "+numeroInt);
        System.out.println("tipo int corresponde en bytes a = " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a = " + Integer.SIZE);
        System.out.println("Valor máximo de un int: "+ Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: "+ Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L; // valor máximo + sufijo L
        System.out.println("\n  El numeroLong es: "+numeroLong);
        System.out.println("tipo long corresponde en bytes a = " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a = " + Long.SIZE);
        System.out.println("Valor máximo de un long: "+ Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: "+ Long.MIN_VALUE);
        // para números más grandes de que long se debe usar float o double --> literales con más capacidad

        float numeroFloat = 3.4028235E38f;
        System.out.println("\n  El numeroFloat es: "+numeroFloat);
        System.out.println("tipo float corresponde en bytes a = " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a = " + Float.SIZE);
        System.out.println("Valor máximo de un float: "+ Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: "+ Float.MIN_VALUE);
        System.out.println("Máximo exponente de un float: "+ Float.MAX_EXPONENT);
        System.out.println("Mínimo exponente de un float: "+ Float.MIN_EXPONENT);

        double numeroDouble = 1.7976931348623157E308; // podemos omitir el sufijo porque cuando hay coma es double por defecto
        System.out.println("\n  El numeroDouble es: "+numeroDouble);
        System.out.println("tipo double corresponde en bytes a = " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a = " + Double.SIZE);
        System.out.println("Valor máximo de un double: "+ Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: "+ Double.MIN_VALUE);
        System.out.println("Máximo exponente de un double: "+ Double.MAX_EXPONENT);
        System.out.println("Mínimo exponente de un double: "+ Double.MIN_EXPONENT);
        /* vemos que por consola siempre lo muestra co notación científica, ya que son números muy grandes */


        /** Declaramos valores numéricos de tipo dinámico con var */
        System.out.println("NUMÉRICOS DE TIPO DINÁMICO");
        // toma tipo int por defecto, aunque el número sea más pequeño
        var numeroVar1 = 34;
        // si nos pasamos de lo que soporta int, hay que especificar con sufijo
        var numeroVar2 = 23685287435L;
        var numeroVar3 = 92233720368547758095522858554545552246f; // f --> literal con más capacidad
        var numeroVar4 = 9223372036854775809552265451531354413484646531468955214502d; // d --> literal con más capacidad aun
        // si ponemos una coma, poe defecto va a ser double
        var numeroVar5 = 3.48;
        var numeroVar6 = 3.48972f; // si queremos que sea float, hay que especificarlo con sufijo f

        /** VEAMOS EJEMPLOS PARA PRIMITIVOS CON NÚMEROS REALES */
        System.out.println("VEAMOS EJEMPLOS PARA PRIMITIVOS CON NÚMEROS REALES");
        // podemos inicializar simplemente con sufijo f
        float numFloat1 = 2120f;
        System.out.println(numFloat1);
        // podemos inicializar con notación científica + sufijo f
        float numFloat2 = 2.12e3f; // El exponencial en positivo desplaza la coma a la derecha 3 veces
        System.out.println(numFloat2);
        // El exponencial en negativo, desplaza la coma hacia la izquierda
        float numFloat3 = 1.5e-4f; // Valor real --> 0.000150f
        System.out.println(numFloat3);
        /** Debemos tener en cuenta que los resultados grandes se van a mostrar de manera compacta */

        /**
         * HASTA EL MOMENTO HEMOS INICIALIZADO VARIABLES DENTRO DE UN MÉTODO (main)
         * --> Dentro de los métodos es obligatorio inicializar las variables
         * --> Si queremos tomar ell valor por defecto de una variable (sin inicializar)
         *     debemos declararla a de manera estática nivel de la clase (en este caso fuera del main)
         *     y luego ya la podemos usar por defecto dentro del método que queramos
         *     --> VEAMOS UN EJEMPLO:
         * */
       // boolean porDefecto; --> esta sin inicializar y da error, la declaramos como static fuera del método main
        System.out.println("\nTomando variable tipo boolean por defecto: \n"+porDefecto);

    }
}
