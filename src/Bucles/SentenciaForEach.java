package Bucles;

public class SentenciaForEach {
    public static void main(String[] args) {

        /**
         * SE TRATA DE UN FOR OPTIMIZADO PARA ARRAYS Y COLECCIONES
         * */

        /** definimos un arreglo de enteros */
        int[] numeros = {4,8,57,96,1,23,13,5};

        /** lo recorremos con el foreach */
        /** variable interna del tipo de dato de los elementos */
        for(int num : numeros){
            System.out.println("num = " + num); // imprimimos cada uno de los elementos
        }

        System.out.println("\nnumeros[2] = " + numeros[2]+"\n");

        /** LO IMPORTANTE ES DAR A LA VARIABLE EL TIPO DE DATO DEL ARREGLO */
        String[] nombres = {"monica","pepe","rocio","almudena","gonzalo","sebastian"};
        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre.toUpperCase());
        }
    }
}
