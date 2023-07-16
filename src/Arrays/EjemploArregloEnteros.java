package Arrays;

public class EjemploArregloEnteros {
    public static void main(String[] args) {

        /** Creamos un arreglo de 4 elementos **/
        int[] numeros = new int[4];

        /** Asignaríamos los valores de la siguiente manera, siempre respetando el tipo de dato a almacenar  */
        numeros[0] = 1;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 3;
        numeros[3] = (int)4L;

        /** Asignamos una variable int a cada índice.
         * Así no asignamos valor, por lo que por defecto sería 0) */
        int i = numeros[0]; // valor por defecto = 0
        int j = numeros[1]; // valor por defecto = 0
        int k = numeros[2]; // valor por defecto = 0
        int l = numeros[3]; // valor por defecto = 0


        /** Probamos así y vemos lo que pasa **/
        k = 47;
        System.out.println("k = " + k);  //valor 47
        System.out.println("numeros[2] = " + numeros[2]); //valor 3
        /** Lo dejamos como estaba **/
        k = numeros[2];

        /** Imprimimos **/
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        System.out.println();

        /** Imprimimos con length **/
        System.out.println("i = " + numeros[numeros.length -4]);
        System.out.println("j = " + numeros[numeros.length -3]);
        System.out.println("k = " + numeros[numeros.length -2]);
        System.out.println("l = " + numeros[numeros.length -1]);  // length muestra el número de elementos

    }
}
