package Bucles;

import javax.swing.*;

public class SentenciasForArray {
    public static void main(String[] args) {

        /** VAMOS A TRABAJAR CON ARRAYS USANDO EL BUCLE FOR **/

        /** Definimos un String[] Array y lo inicializamos con nombres */
        String[] nombres = {"David", "María", "Julián", "Manolo", "Carlos", "Carmen","Mónica", "Victor"};

        /** Podemos inicializar una variable con el largo del array*/
        int nomLength = nombres.length; /** con esto evitamos el cálculo en cada iteración **/

        /** Recorremos el array con el for, asamos la variable para la longitud */
        for (int i = 0; i < nomLength; i++){
            System.out.println("En el indice "+i+" se encuentra --> "+nombres[i]);
        }
        /** Vemos todos los índices con sus respectivos nombres */



        System.out.println();
        /** Implemente el código para omitir de la impresión a Julian y Mónica */

        for (int i = 0; i < nomLength; i++){
            if(nombres[i].equals("Julián") || // .ecuals compara el valor DISPONE DE IgnoreCase
                    nombres[i].contains("Mónica")){ // .contains (el valor que contiene) NO DISPONE DE IgnoreCase
                continue;
            }
            System.out.println("En el indice "+i+" se encuentra --> "+nombres[i]);
        }


        System.out.println();
        /** Suponemos que le pedimos al usuario que ingrese un nombre para que sea buscado en el array */

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
