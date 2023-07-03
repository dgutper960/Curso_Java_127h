package ClaseString;

public class ValidarString {
    public static void main(String[] args) {

        /** String null */
        String curso = null;
        // declaramos boolean
        boolean esNulo = curso == null;
        // imprimimos y efectivamente devuelve true
        System.out.println("esNulo = " + esNulo);

        if(esNulo){ // = --> esNulo == true
            curso = "Programación Java"; // si es true se inicializa curso
        }
        // si usamos una funcion con un String nulo, nos da una Exception
        System.out.println(curso.toUpperCase()); // Lo imprime en mayúsculas
        System.out.println("Bienvenid@ al curso ".concat(curso)); // lo imprime normal

        /** String vacío */
        String vacio = "";
        // le podemos añadir método y no da error aunque no imprima nada
        System.out.println("vacio = "+vacio.toUpperCase());

        //Si declaramos un booleano de la siguiente forma
        boolean esVacio = vacio.length() == 0; // sera true
        // Podemos obtener el mismo resultado con la función isEmpty()
        boolean esVacio2 = vacio.isEmpty();

        if (esVacio2){
            vacio = "Pues ya no está vacío";
        } else if (esVacio) { // como va a entrar arriba, ya no entrará abajo --remember--
            vacio = "Esto se ha sobrescrito";
        }
        System.out.println("vacio = " + vacio.toUpperCase());

        /** String en blanco  */
        String enBlanco = " ";
        //tenemos el método isBlanck()

        boolean esEnBlanco = enBlanco.isBlank(); // true

        System.out.println("está vacío? "+enBlanco.isEmpty());
        System.out.println("está en blanco? "+enBlanco.isBlank());
        // vamos a empezar la condicional negando como ejemplo
        if (!esEnBlanco){ // no va a entrar porque lo está negando
            enBlanco = "11111";
        } else if (esEnBlanco) {
            enBlanco = "Pues ya tampoco está en blanco";
        }
        System.out.println("enBlanco = "+enBlanco.toUpperCase());
    }
}
