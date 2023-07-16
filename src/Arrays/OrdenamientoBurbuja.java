package Arrays;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {

        /**
         * VAMOS A IMPLEMENTAR UN ALGORITMO PARA ORDENAR UN ARRAY
         * RECORDAMOS QUE STRING IMPLEMENTA .compareTo()
         * VAMOS A NECESITAR DOS FORD ANIDADOS PARA COMPARAR CADA ELEMENTO CON TÓ EL ARRAY
         * */

         /** Cogemos el ejemplo de las frutas **/
        String[] frutas = {"Melocotones", "Manzanas", "Peras", "Zarzamora", "Uvas", "Aguacates", "Limones", "Bananas"};
        //INICIAMOS LOS FORD
        int contador = 0;
        int max = frutas.length;
        for (int i = 0; i < max; i++){
            for (int j = 0; j < max; j++){
                // comparamos los valores con compareTo() y si es menor a cero intercambiamos los valores
                if (frutas[i].compareTo(frutas[j])<0){ // menor a cero indica que 'i' es menor a 'j'
                    //para intercambiar los valores, es necesaria una variable auxiliar, porque el valor se machaca
                    String auxiliar = frutas[i];
                    frutas[i] = frutas[j];
                    frutas[j] = auxiliar;
                }
                contador++;
            }
        } /** AUNQUE ESTE MÉTODO ES EFECTIVO, SE PUEDE OPTIMIZAR **/
        System.out.println("contador = " + contador); // 64

        String[] frutas2 = {"Melocotones", "Manzanas", "Peras", "Zarzamora", "Uvas", "Aguacates", "Limones", "Bananas"};

        /** HAREMOS QUE
         * A CADA VUELTA DE I J SE COMPARE CON J+1 Y SE VAYA ORDENANDO
         * A CADA RECORRIDO DE I NO SE VUELVA A ITERAR EL ARRAY ENTERO, UNA POSICIÓN MENOS
         * YA QUE LA ÚLTIMA POSICIÓN ESTARÁ ORDENADA Y NO SERÁ NECESARIO */
        contador = 0;
        int max2 = frutas2.length;
    // i -1 para que no haga la última iteración, ya que no es necesaria
        for (int i = 0; i < max2 -1; i++){
    // j -1 para que no se salga del array // j -i En cada vuelta de 'i' y no se vuelvan a comparar las últimas posiciones
            for (int j = 0; j <max2 -1 -i; j++){
                if (frutas2[j+1].compareTo(frutas2[j])<0){ //comparamos j con el siguiente elemento de j
                    String auxiliar = frutas[j];
                    frutas2[j] = frutas2[j+1];
                    frutas2[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);// 28

        /**
         * SI LO QUISIÉRAMOS HACER CON UN NUMÉRICO
         * */

        /** 1. PARTIMOS DE UN TIPO DE REFERENCIA **/
        Integer[] numeros = {23, 57, 278, 1, 11, 109, 34, 98, 123, 15};
        /** y hacemos lo mismo pero cambiando los tipos de datos  */
        max = numeros.length;

        for (int i = 0; i < max -1; i++){

            for (int j = 0; j <max2 -1 -i; j++){
                if (numeros[j+1].compareTo(numeros[j])<0){
                    Integer auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
            }
        }

        /** 1. PARTIMOS DE UN TIPO DE PRIMITIVO **/
        int[] numeros2 = {23, 57, 278, 1, 11, 109, 34, 98, 123, 15};
        /** y hacemos lo mismo pero cambiando los tipos de datos  */
        max = numeros.length;

        for (int i = 0; i < max -1; i++){

            for (int j = 0; j <max2 -1 -i; j++){
                //COMO EL PRIMITIVO NO TIENE MÉTODO, DEBEMOS HACER UN CAST
                if (((Integer)numeros2[j+1]).compareTo(numeros2[j])<0){
                    Integer auxiliar = numeros[j];
                    numeros2[j] = numeros2[j+1];
                    numeros2[j+1] = auxiliar;
                }
            }
        }





    }
}
