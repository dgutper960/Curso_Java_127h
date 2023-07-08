package EjerciciosFALTAN_9_Y_10.ej7_MultiplicarSinX;

import java.util.Scanner;

/**
 * Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos,
 * pero sin usar el símbolo de multiplicación (*).
 *
 * Puede utilizar una sentencia for para realizar la multiplicación
 * y tener en cuenta los unarios, donde menos por menos es positivo.
 * **/
public class Main {
    public static void main(String[] args) {

        Scanner inputNumeros = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num1 = inputNumeros.nextInt();
        System.out.println("Ingrese el otro número entero");
        int num2 = inputNumeros.nextInt();

        for (int i = 1; i <= num2; i++){
            num1 += num1;
            System.out.println(num1);
        }
        System.out.println("num1 = " + num1);
    }
}

/**
 * SOLUCIÓN
 *
 * import java.util.Scanner;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *
 *         Scanner inputNumeros = new Scanner(System.in);
 *         System.out.println("Ingrese un número entero");
 *         int num1 = inputNumeros.nextInt();
 *         System.out.println("Ingrese el otro número entero");
 *         int num2 = inputNumeros.nextInt();
 *
 *         int resultado = 0;
 *
 *         for (int i = 1; i <= Math.abs(num1); i++) {
 *             resultado += Math.abs(num2);
 *         }
 *
 *         if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
 *             resultado = -resultado;
 *         }
 *
 *         System.out.println("El resultado de la multiplicación es: " + resultado);
 *     }
 * }
 * **/


