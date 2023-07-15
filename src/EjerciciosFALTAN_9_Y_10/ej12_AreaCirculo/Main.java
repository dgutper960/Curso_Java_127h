package EjerciciosFALTAN_9_Y_10.ej12_AreaCirculo;

import java.util.Scanner;

/**
 * Pedir el radio de un círculo y calcular su área.
 * Utilizar la formula:
 * area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
 *
 * Recomiendo primero implementar la tarea en el IDE para probarla y revisarla bien,
 * luego publica tu código de la clase main por esta vía.
 * **/

public class Main {
    public static void main(String[] args) {
        try {
            Scanner inputArea = new Scanner(System.in);
            System.out.println("Ingrese el radio del círculo");
            double radio = inputArea.nextDouble();
            System.out.println("El área de su círculo es "+calculaAreaCirculo(radio));
        }catch (Exception e){
            System.err.println("Tipo de dato incorrecto");
            System.out.println("El tipo de dato introducido no es correcto");
            main(args);
        }
    }

    static double calculaAreaCirculo(double radio){
        double area = Math.PI* Math.pow(radio, 2);
        return area;
    }
}
