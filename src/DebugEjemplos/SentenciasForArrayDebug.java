package DebugEjemplos;

import javax.swing.*;

public class SentenciasForArrayDebug {
    public static void main(String[] args) {

        /**
         * ENTRAMOS AL MODO DEBUGGER Y VAMOS VIENDO EL PROCESO, PASO A PASO RESPECTO A
         * CREACIÓN DE ARRAYS
         * RECORRIDO CON BUCLES FOR
         * INCREMENTOS
         * CONTINUE Y BREAK
         * */


        String[] nombres = {"David", "María", "Julián", "Manolo", "Carlos", "Carmen","Mónica", "Victor"};


        int nomLength = nombres.length; /** con esto evitamos el cálculo en cada iteración **/


        for (int i = 0; i < nomLength; i++){
            System.out.println("En el indice "+i+" se encuentra --> "+nombres[i]);
        }




        System.out.println();


        for (int i = 0; i < nomLength; i++){
            if(nombres[i].equals("Julián") || // .ecuals compara el valor DISPONE DE IgnoreCase
                    nombres[i].contains("Mónica")){ // .contains (el valor que contiene) NO DISPONE DE IgnoreCase
                continue;
            }
            System.out.println("En el indice "+i+" se encuentra --> "+nombres[i]);
        }


        System.out.println();


        String buscado = JOptionPane.showInputDialog(null, "Ingrese un nombre para buscar en el \"arreglo\"");

        for (int i = 0; i < nomLength; i++) {
            if (nombres[i].equalsIgnoreCase(buscado)) {
                JOptionPane.showMessageDialog(null, "El nombre se encuentra en el array");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "El nombre no se encuentra en el array");
                break;
            }
        }

        /** el profesor lo hace de esta manera */
        String buscado2 = JOptionPane.showInputDialog(null, "Ingrese OTRO nombre para buscar en el \"arreglo\"");
        boolean encontrado = false;
        for (int i = 0; i < nomLength ; i++){
            if (nombres[i].equalsIgnoreCase(buscado2)){
                encontrado = true;
                break;
            }
        }

        if (encontrado){
            JOptionPane.showMessageDialog(null, "El nombre "+buscado2+" se encuentra en el array");
        } else {
            JOptionPane.showMessageDialog(null, "El nombre "+buscado2+" no se encuentra en el array");
        }




    }
}
