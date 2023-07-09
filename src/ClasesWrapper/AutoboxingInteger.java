package ClasesWrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {

        /**
         * LLAMAMOS AUTOBOXING CUANDO
         * INICIALIZAMOS UN TIPO REFERENCIA MEDIANTE LITERAL
         * */

        /** Inicializamos por ejemplo un array de enteros de referencia */
        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        /** vamos a sumar solo los números que sean pares */
        // CON FOR NORMAL
        int sumaPar2 = 0;

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 == 0) {
                sumaPar2 += enteros[i];
            }
        }
        // CON FOREACH
        int sumaPar = 0;

        for (Integer i : enteros) {  /** DEBEMOS DECLARAR LA VARIABLE A INTEGER (mismo tipo de dato que se maneja)*/
            if (i.intValue() % 2 == 0) {  /** DEBEMOS TOMAR EL VALOR DEL ÍNDICE CON .intValue() */
                sumaPar += i.intValue(); /** .intValue() toma el valor primitivo de un Integer */
            }
        }
        /** EL COMPILADOR DE JAVA VA A INVOCAR EL MÉTODO .intValue() DE FORMA AUTOMÁTICA */
        /** el mismo ejemplo con números impares */
        int sumaImpar = 0;
        for (Integer i : enteros) {
            if (i % 2 != 0) { /** El compilador llama al método .intValue() de forma automática */
                sumaImpar += i;
            }
        }

        // DA EL MISMO RESULTADO
        System.out.println("suma = " + sumaPar);
        System.out.println("suma2 = " + sumaPar2);
        // SUMA DE IMPARES
        System.out.println("sumaImpar = " + sumaImpar);
    }
}
