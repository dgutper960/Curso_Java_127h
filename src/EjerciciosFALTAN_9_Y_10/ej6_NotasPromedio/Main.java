package EjerciciosFALTAN_9_Y_10.ej6_NotasPromedio;

import java.util.Scanner;

/**
 * Pedir 20 notas finales de alumnos en una escala de 1 a 7,
 * manejar decimales en las notas (double).
 * Mostrar el promedio de las notas mayores a 5,
 * promedio de notas inferiores a 4 y la cantidad de notas 1,
 * ademas mostrar el promedio total.
 *
 * Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar
 * los cálculos (contadores, sumas).
 *
 * Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
 * */

public class Main {
    public static void main(String[] args) {

        Scanner inputNotas = new Scanner(System.in);

        //declaramos un double[] para almacenar las notas
        double[] notas = new double[20];
        double nota = 1;
        // pedimos las 20 notas por consola y lo metemos en el array
        for (int i = 0; i < 20; i++){
            System.out.println("Por favor, ingrese su nota en escala 1 a 7");
            if(nota == 0 || nota > 7 ) {
                System.out.println("Error finalizando el programa");
                break;
            }
            nota = inputNotas.nextDouble();
            notas[i] = nota;
            }

        double mas5 = 0;
        double menos4 = 0;
        double de1 = 0;
        double promTotal = 0;

        for (int i =0; i < 20; i++){
            if (notas[i] > 5 ){
                mas5++;
            } else if (notas[i] < 4) {
                menos4++;
            }
            if (notas[i] == 1) {
                de1 += 1;
            }
            promTotal += notas[i];
        }
        System.out.println("El promedio de notas mayores a 5 es de "+(mas5/20)*100+"%");
        System.out.println("El promedio de notas inferiores a 4 es de "+(menos4/20)*100+"%");
        System.out.println("El número de notas igual a 1 es de "+(de1/20)*100+"%");
        System.out.println("El promedio total es de "+promTotal/20);

    }
}
