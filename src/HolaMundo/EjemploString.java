package HolaMundo;

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
    }
}
