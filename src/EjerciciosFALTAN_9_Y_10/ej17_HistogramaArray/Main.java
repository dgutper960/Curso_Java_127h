package EjerciciosFALTAN_9_Y_10.ej17_HistogramaArray;

import java.util.Random;

/**
 * Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
 *
 * El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
 *
 * Un histograma es una representación gráfica (de puntos o barra)
 * de que tanto un elemento aparece en un conjunto de datos,
 * es decir debe mostrar la frecuencia para todos los números del 1 al 6,
 * incluso si no están presente en el arreglo.
 *
 * Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
 *
 *     1: ***
 *     2:
 *     3: *
 *     4: *****
 *     5: *
 *     6: **
 *
 * Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma
 * **/

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] ocurrencias = new int[10];

        int numMaxOc = 0;
        int numOc = 0;

        Random numero = new Random();
        for (int i=0; i<10; i++){
            numeros[i] = 1+numero.nextInt(9);
            System.out.println("i = " + numeros[i]); // para comprobar
            for (int j = 0; j<10; j++){
                if(numeros[i]==j+1){
                    ocurrencias[j]++;
                }
            }
        }

        for (int i = 0; i<=9; i++) {
            System.out.println("El número "+(i+1)+" aparece "+ocurrencias[i]+" veces");

        }

    }
}
