package EjerciciosFALTAN_9_Y_10.ej3_OrdenarNumeros;

/**
 * El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
 *
 * PISTA: Podría ser utilizando operador ternario.
 * */

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        try {
            Scanner inputNum = new Scanner(System.in);
            System.out.println("Introduzca un número");
            float num1 = inputNum.nextFloat();
            System.out.println("Introduzca otro número diferente al primero");
            float num2 = inputNum.nextFloat();

            if(num1 == num2){
                System.out.println("¡¡ERROR!! DEBE INTRODUCIR DOS NÚMEROS DIFERENTES!!\nVuelva a empezar\n");
                main(args);
            }else {
                String mayor = num1 > num2? num1+" -> "+num2 : num2+" -> "+num1;
                System.out.println("El orden de mayor a menor es "+mayor);
                main(args);
            }

        }catch (Exception e){
            System.out.println("¡¡ERROR!!\nTipo de dato no válido:\n--Solo datos numéricos\n--Decimales separados por coma\nVuelva a intentarlo");
            main(args);
        }
    }
}
