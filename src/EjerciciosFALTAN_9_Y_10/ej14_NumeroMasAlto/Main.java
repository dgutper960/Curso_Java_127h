package EjerciciosFALTAN_9_Y_10.ej14_NumeroMasAlto;

import java.util.Random;

/**
 * Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
 * por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
 * **/

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[7];

        int max = numeros.length;
        Random num = new Random();

        for (int i = 0; i< max; i++){
            numeros[i] = 11 + num.nextInt((99+1)-11);
            System.out.println("i = " + numeros[i]); // Solo para comprobar el resultado

        }

        int mayor = 0;
        for (int n: numeros) {
            mayor = mayor > n ? mayor : n;
        }
        System.out.println("mayor = " + mayor);

    }
}
