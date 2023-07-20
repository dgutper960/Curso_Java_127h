package EjerciciosFALTAN_9_Y_10.ej15_ResultadoEstadístico;

import java.util.Scanner;

/**
 * Leer 7 números por teclado para llenar un arreglo y a continuación calcular
 * -> el promedio de los números positivos
 * -> el promedio de los negativos
 * -> contar el número de ceros.
 * **/

public class Main {
    public static void main(String[] args) {

        try {
            Scanner inputNum = new Scanner(System.in);

            int[] numeros = new int[7];
            int max = numeros.length;

            for (int i = 0; i<max; i++){
                System.out.println("Inserte número entero positivo, negativo o cero");
                numeros[i] = inputNum.nextInt();
            }

            int positivo = 0, negativo = 0, ceros = 0;
            for (int n:numeros) {
                if (n>0){
                    positivo++;
                } else if (n<0) {
                    negativo++;
                } else {
                    ceros++;
                }
            }

            float promPos =  ((float) positivo/max)*100;
            float pormNeg =  ((float) negativo/max)*100;
            System.out.println("Promedio positivos "+promPos+"%");
            System.out.println("Promedio negativos " + pormNeg+"%");
            System.out.println("Número de ceros "+ceros);

        }catch (Exception e){
            System.err.println("DATOS NO VÁLIDOS");
            System.out.println("Debe introducir solo números ");
        }

    }
}
