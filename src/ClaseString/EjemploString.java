package ClaseString;

public class EjemploString {
    public static void main(String[] args) {
        /**
         * RECORDEMOS QUE UN STRING ES UN OBJETO Y DEBEMOS VERLO COMO TAL
         * --> Se pueden crear objetos String con operador el new
         * --> Cuando modificamos un string, siempre retorna una nueva instancia
         * --> Operador de suma para concatenar
         * --> Operador == solo compara el objeto (referencia), no compara el valor
         * --> .equals() para compara el contenido o sus variantes -> .equalsIgnoreCase()
         *
         * MÉTODOS MÁS IMPORTANTES DE STRING
         *
         * --> int .length() -> número de caracteres
         * --> boolean .equals(String b) -> compara por valor
         * --> boolean .equalsIgnoreCase(String b) -> compara por valor e ignora CamelCase
         * --> int .compareTo(String b) compara con la cadena del argumento y según la tabla Unicode:
         *          -retorna -> valor negativo si la cadena a, es anterior a la cadena b
         *          -retorna -> cero (0) si la cadena a, es igual a la cadena b
         *          -retorna -> valor positivo si la cadena a, es posterior a la cadena b
         * --> String trim() -> Elimina los espacios accidentales al principio o al final
         * --> char charAt(int posición) Extrae el carácter de la posición indicada
         *
         * --> char[] .toCharArray() -> convierte la cadena en un arreglo de caracteres
         * --> String .substring(int a, int b) -> Extrae la subcadena entre la posición a y b
         * --> String .substring(int desde) -> Extrae la subcadena desde la posición indicada
         * --> int .indexOf(String cadena) -> Indica la posición del carácter o cadena desde el principio
         * --> int .lastIndexOf(String cadena) -> Indica la posición del carácter o cadena desde el final
         * --> boolean .startsWith(String prefijo) -> Indica si la cadena comienza con el prefijo indicado
         * --> boolean endsWith(String sufijo) -> Indica si la cadena termina con el sufijo indicado
         * --> String[] split(String patron) -> Divide la cadena en subcadenas mediante el separador indicado
         *
         * */


        /** Cuando inicializamos una variable Strin, en realidad, por debajo se crea una instancia */
        String s1 = "Esto es un ejemplo de Cadena de Caracteres";

        /** También lo podemos hacer mediante constructor con operador new y pasando el String como argumento */
        String s2 = new String("Esto es un ejemplo de Cadena de Caracteres");

        /** En Java cada objeto tiene su propio identificador indistintamente del valor  */
        // Si comparamos los objetos mediante operador de igualdad nos compara por referencia
        boolean esIgualRef = (s1 == s2 ); // son diferentes objetos con el mismo valor
        System.out.println("esIgualRef = " + esIgualRef); // false

        // Si comparamos con el método equals() nos compara por valor
        boolean esIgualValor = s1.equals(s2); // se tiene en cuenta el CamelCase
        System.out.println("esIgualValor = " + esIgualValor); // true

        /** si queremos obviar el CamelCase usaremos .equalsIgnoreCase()  */
        s2 = s2.toUpperCase();
        esIgualValor = s1.equalsIgnoreCase(s2);
        System.out.println("esIgualValor = " + esIgualValor); // true


        /** Si tenemos dos instancias por literal con el mismo valor,
         * Java, al crear la segunda usará la misma referencia para optimizar
         * --ejemplo-->       */
        String texto1 = "prueba";
        String texto2 = "prueba";
        esIgualRef = (texto1 == texto2); // true?
        System.out.println("esIgualRef = " + esIgualRef); // true


        /**
         * VEAMOS UN EJEMPLO DE CONCATENACIÓN CON NUMÉRICOS Y OPERADORES
         * */

        // VARIABLES PARA EL EJEMPLO

        int numA = 5;
        int numB = 10;
        String frase1 = "Vamos a concatenar con números '";
        String frase2 = "' Esto es un ejemplo";
        String lenguaje = "Java";
        String nivel1 = "de cero";
        String nivel2 = "experto";
        String alumno = "David";

        // EJEMPLOS CONCATENACIÓN
        // String + variables String
        String curso = "Aprende "+lenguaje+" "+nivel1+" a "+nivel2;

        // String + variables String y numéricas
        System.out.println(frase1 + numA + numB + frase2); // --> numA y numB concatenan
        // observamos que hay dos números unidos por un signo + ¿sumarán o concatenarán?
        /** Cuando iniciamos una concatenación con un String, el compilador interpreta
         * que el resto del contenido se debe concatenar, aunque sean números junto a operadores.
         * --> Si queremos realizar operaciones lógicas, deben ir entre paréntesis */
        System.out.println(frase1 +(numA+numB)+frase2); // --> numA y numB suman


        // Función concat()
        String anuncio = "APROVECHA LA OPORTUNIDAD!!\n ".concat(curso).concat(" con ").concat(alumno).concat("\n Adquiere ya este completo curso online");
        System.out.println("anuncio =\n " + anuncio);

        System.out.println("\n");

        /**
         *          DEBEMOS TENER EN CUENTA QUE
         *
         * --> Cada vez usamos el operador más para concatenar, por debajo se crea una instancia con esa funcionalidad
         * --> Por lo tanto, es más eficiente el uso de la función .concat()
         *
         *          String Inmutable:
         *    Los String nunca cambian una vez creados, solo se modifica su referencia en memoria
         *
         * */

        /** Volvemos a imprimir todas nuestras variables y vemos que no se han modificado */

        System.out.println("nivel1 = " + nivel1);
        System.out.println("nivel2 = " + nivel2);
        System.out.println("alumno = " + alumno);
        System.out.println("curso = " + curso);

        // Aunque usemos una función landa para modificar un String
        String resultado = nivel1.transform(n ->{
           return n + " a "+nivel2+" con "+alumno;
        });
        // Si nos damos cuenta, hemos usado una serie de String para formar otro


        // Aunque usemos la función .replace()
        String resultado2 = resultado.replace("a", "A");

        /** SIEMPRE SON NUEVAS INSTANCIAS Y LOS STRING ORIGINALES MANTIENEN */
        System.out.println("resultado = " + resultado);
        System.out.println("resultado2 = " + resultado2);
        System.out.println("nivel1 = " + nivel1);
        System.out.println("nivel2 = " + nivel2);

        // PROBAMOS A SOBREESCRIBIR
        String texto3 = "Texto Original";
        System.out.println("texto3 = " + texto3);
        texto3 = "Texto Nuevo";
        System.out.println("texto3 = " + texto3); // Ahora lo machaca

    }
}
