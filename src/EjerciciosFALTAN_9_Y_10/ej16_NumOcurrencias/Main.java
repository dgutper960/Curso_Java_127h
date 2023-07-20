package EjerciciosFALTAN_9_Y_10.ej16_NumOcurrencias;

import java.util.Random;

/**
 * Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
 * Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo
 * y también imprimir la cantidad de veces que aparece en el arreglo.
 *
 * Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
 *
 * Como resultado debería imprimir lo siguiente:
 *
 *     La mayor ocurrencias es: 3
 *     El elemento que más se repite es: 5
 *
 * En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces
 * */

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

//         int n1=0, n2=0, n3=0, n4=0, n5=0, n6=0, n7=0, n8=0, n9=0;
