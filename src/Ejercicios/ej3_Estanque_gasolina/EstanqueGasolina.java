package Ejercicios.ej3_Estanque_gasolina;

import java.util.Scanner;

/**
 * Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
 *
 * La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero también puede ser del tipo int.
 *     Si la capacidad actual es 70 litros: imprimir Estanque lleno
 *     Si está entre 60 y menor a 70: imprimir Estanque casi lleno
 *     Si está entre 40 y menor a 60: imprimir Estanque 3/4
 *     Si está entre 35 y menor a 40: imprimir Medio Estanque
 *     Si está entre 20 y menor a 35: imprimir Suficiente
 *     Si está entre 1 y menor a 20: imprimir Insuficiente
 * */

public class EstanqueGasolina {
    public static void main(String[] args) {

        try {

            Scanner inputMedida = new Scanner(System.in);
            System.out.println("Introduzca la medida del tanque");
            double medida = inputMedida.nextDouble();

            if (medida>70){
                System.out.println("Valor máximo 70\nIntroduzca valores entre 0 y 70");
                main(args);
            } else if(medida == 70) {
                System.out.println("Estanque lleno");
            }else if (medida >= 60 && medida < 70) {
                System.out.println("Estanque casi lleno");
            } else if (medida >= 40 && medida < 60) {
                System.out.println("Estanque a 3/4");
            } else if (medida >= 35 && medida < 40) {
                System.out.println("Medio Estanque");
            } else if (medida >= 20 && medida < 35) {
                System.out.println("Suficiente");
            } else if (medida >=1 && medida < 20) {
                System.out.println("Insuficiente");
            } else {
                System.out.println("El estanque está seco");
            }
        }catch (Exception e){
            System.out.println("El valor introducido no es válido\nSolo valores numéricos\nValor máximo 70");
            main(args);
        }
    }
}
