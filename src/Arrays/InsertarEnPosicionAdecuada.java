package Arrays;

public class InsertarEnPosicionAdecuada {
    public static void main(String[] args) {
        /** Creamos un array ordenado con una posición libre
         * La idea es insertar un número sin romper el orden **/
        int[] array = {1, 3, 5, 8, 9, 11, 13, 16, 20, 0};
        /** digamos que queremos insertar el 10 y desplazar el resto **/
        int insertar = 10;
        int posicion = 0;
        //calculamos la posición a insertar
        int max = array.length;
        int contador = 0;
        for (int i = 0; i < max; i++) {
            contador++;
            if (insertar > array[i] && insertar < array[i+1]) {
                posicion = i+1;
                break;
            }
        }
        System.out.println("posicion = " + posicion); //ver posición calculada
        System.out.println("contador = " + contador); //ver el numero de bucles

        for (int i = max - 2; i >= posicion; i--) {
            array[i + 1] = array[i];
        }
        array[posicion] = insertar;

        for (int n : array) {
            System.out.println("n = " + n);
        }
        /**
         * PARA PRACTICAR, INTENTAR LA CONDICIÓN CON UN WHILE
         * HACERLO CON UN 2º ARRAY DE TAMAÑO MAYOR
         * **/
    }
}
