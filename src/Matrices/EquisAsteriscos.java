package Matrices;

import java.util.Scanner;

public class EquisAsteriscos {
    public static void main(String[] args) {

        // Pedimos por consola el tamaño de la matriz

        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el tamaño deseado de la matriz (min 3 / max 30)");
            int n = input.nextInt();

            // Inicializamos la matriz con el tamaño del usuario
            String[][] matriz = new String[n][n];

            // Pintamos las X, o mejor ponemos asteriscos y espacios en blanco
            // También le ponemos el marco de regalo
            for (int i =0; i< matriz.length; i++){
                for (int j = 0; j< matriz.length; j++){
                    if (i == j || j == n -i -1 ||
                    i == 0 || i == matriz.length -1 ||
                    j == 0 || j == matriz[i].length -1){
                        matriz[i][j] = "*";
                    }else {
                        matriz[i][j] = " ";
                    }
                }
            }

            for (String[] fila: matriz){
                for (String pos : fila){
                    System.out.print(pos+"\t");
                }
                System.out.println();
            }



        } catch (Exception e){
            System.out.println("Solo admitidos números enteros");
            System.err.println("DATO DE ENTRADA NO VALIDO");
        }
    }
}
