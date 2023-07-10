package EjerciciosFALTAN_9_Y_10_deFechaPracticar.ej5_NumeroMayor;

import java.util.Scanner;

/**
 * Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
 * usando la clase Scanner ingresar la cantidad de números a comparar,
 * luego utilizando una sentencia for iterar el número de veces (ingresado) para pedir el número entero, entonces se requiere:
 *
 *     Calcular el menor número e imprimir el valor.
 *
 *     Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
 *     Si no, imprimir: "el número menor es igual o mayor que 10!"
 * */

public class Main {
    public static void main(String[] args) {

        Scanner inputNumeros = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea comparar\n" +
                "Cantidad mínima 10");
        int cantidad = inputNumeros.nextInt();

        if(cantidad < 10){
            System.out.println("Por favor!! la cantidad mínima de números es 10");
            main(args);
        }


        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduzca un número entero");
            numeros[i] = inputNumeros.nextInt();
        }

        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < cantidad; i++) {
            menor = menor < numeros[i] ? menor : numeros[i];
        }
        System.out.println("El número menor es --> "+menor);

        if(menor < 10){
            System.out.println("El número menor es menor que 10!");
        }else {
            System.out.println("el número menor es igual o mayor que 10!");
        }

    }
}
