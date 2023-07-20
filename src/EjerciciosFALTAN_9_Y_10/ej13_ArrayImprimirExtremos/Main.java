package EjerciciosFALTAN_9_Y_10.ej13_ArrayImprimirExtremos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
 * Luego debemos mostrarlos en el siguiente orden:
 * el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
 * **/

public class Main {
    public static void main(String[] args) {
        try{
            Scanner inputNum = new Scanner(System.in);
            int[] numeros = new int[10];
            int max = numeros.length;

            System.out.println("Debe introducir 10 números enteros\n");
            for (int i =0; i< max; i++){
                System.out.println("Introduzca el número "+(i+1)+" y pulse enter");
                numeros[i] = inputNum.nextInt();
            }

            Arrays.sort(numeros);
            int alto = max -1;
            int bajo = 0;
            for (int i =0; i< max/2; i++){
                System.out.println(numeros[alto]);
                System.out.println(numeros[bajo]);
                alto--;
                bajo++;
            }

        }catch (Exception e){
            System.err.println("TIPO DE DATO INCORRECTO");
            System.out.println("ERROR!\nSolo se admiten números enteros");
        }
    }
}
