package Arrays;

import java.util.Random;

public class MayorEnArray {
    public static void main(String[] args) {
        /**
         * VAMOS A RELLENAR UN ARRAY CON NÚMEROS ALEATORIOS
         * Y VAMOS A VER CUAL ES EL MAYOR
         * **/

        int[] numeros = new int[100];
        System.out.println("Rellenando el Array");
        int mayor = 0;
        for (int n : numeros){
            n = (int) ((Math.random()*1000)+1);
            System.out.println("n = " + n);
            if(n > mayor){
                mayor = n;
            }
        }
        System.out.println("El número mayor es " + mayor);
    }
}
