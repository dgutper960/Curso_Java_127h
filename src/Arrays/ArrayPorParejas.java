package Arrays;

public class ArrayPorParejas {
    public static void main(String[] args) {


        /** declaramos el array con tamaño de 10 **/
        int[] numeros = new int[10];

        /** lo inicializamos de manera consecutiva */
        for (int i = 0; i< numeros.length; i++){
            numeros[i] = i+1;
        }

        /** VAMOS A IMPRIMIR POR PAREJAS CON LOS INDICES DE LOS EXTREMOS */
        for (int i =0; i< numeros.length/2; i++){ // ENTRE DOS PARA EVITAR EL CRUCE DE ÍNDICES
            System.out.println("El "+numeros[i]+" con el "+numeros[numeros.length -1 -i]);
        }    /** otra forma sería --> (int i =0; i< numeros.length -i ; i++) **/

        /** SI QUISIÉRAMOS LLENAR UN ARRAY CON ESTE ORDEN */
        int[] nuevoArray = new int[10];
        int aux = 0; // NO PODEMOS USAR I PARA MARCAR EL ÍNDICE
        for (int i =0; i< numeros.length -i ; i++){
            nuevoArray[aux++] = numeros[i];
            nuevoArray[aux++] = numeros[numeros.length -1 -i];
        }

        for (int n:
             nuevoArray) {
            System.out.println("n = " + n);
        }

    }
}
