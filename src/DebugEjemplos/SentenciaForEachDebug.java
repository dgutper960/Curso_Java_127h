package DebugEjemplos;

public class SentenciaForEachDebug {
    public static void main(String[] args) {

        /**
         * PUNTO DE RUPTURA EN DECLARACIÓN DE 1.er ARRAY
         *
         * **/


        int[] numeros = {4,8,57,96,1,23,13,5};

        for(int num : numeros){
            System.out.println("num = " + num); // imprimimos cada uno de los elementos
        }

        System.out.println("\nnumeros[2] = " + numeros[2]+"\n");


        String[] nombres = {"monica","pepe","rocio","almudena","gonzalo","sebastian"};
        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre.toUpperCase());
        }
    }
}
