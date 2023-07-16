package Arrays;

public class SaberSiHayOrdenArray {
    public static void main(String[] args) {
        /**
         * VAMOS A COMPROBAR SI NUESTRO ARRAY ESTA ORDENADO
         * Y SI LO ESTÁ DETERMINAR EL ORDEN ASC O DESC
         * **/

        /** creamos nuestro array */
        int[] arreglo = {132,2,213,4,515,66,79,8,92};
//        {9,8,7,6,5,4,3,2,1};
//        {132,2,213,4,515,66,79,8,92};

        boolean ascendente = false, descendente = false;
        for (int i = 0; i < arreglo.length -1; i++){
            if (arreglo[i] < arreglo[i+1]){
                ascendente = true;
            }
            if (arreglo[i] > arreglo[i+1]) {
                descendente = true;
            }
        }
        if ((ascendente == true) && (descendente = false)){
            System.out.println("El array es ascendente");
        }
        if ((descendente == true) && (ascendente = false)) {
            System.out.println("El array es descendente");
        }
        if ((ascendente == true) && (descendente == true)){
            System.out.println("El arreglo está desordenado");
        }
        if ((ascendente == false)&&(descendente == false)){
            System.out.println("Todos los valores son iguales");
        }

    }
}
