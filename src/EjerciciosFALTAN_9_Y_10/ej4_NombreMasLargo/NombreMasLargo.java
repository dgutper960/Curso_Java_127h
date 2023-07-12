package EjerciciosFALTAN_9_Y_10.ej4_NombreMasLargo;

import javax.swing.*;

/**
 * Obtener el nombre más largo de tres personas, según los siguientes requerimientos
 *
 *     Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia
 *     o amigos usando la clase JOptionPane y método showInputDialog().
 *
 *     Calcular e Imprimir el nombre de la persona que tenga el nombre más largo
 *     (en cantidad de caracteres) (Imprimir solo uno de los tres, el de más caracteres en el nombre.)
 *
 *     Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo,
 *     y con el índice cero accedemos al nombre de la persona.
 *
 *     --> Restricción no usar loops en el desarrollo de la tarea.
 *
 * Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
 * **/

public class NombreMasLargo {
    public static void main(String[] args) {

        try {
            //inicializamos variables para capturar los nombres
            String nombre1 = JOptionPane.showInputDialog(null, "Ingrese nombre completo n1");
            String nombre2 = JOptionPane.showInputDialog(null, "Ingrese nombre completo n2");
            String nombre3 = JOptionPane.showInputDialog(null, "Ingrese nombre completo n3");

            //pasamos los String a arrays con Split
            String[] array1 = nombre1.split(" ");
            String[] array2 = nombre2.split(" ");
            String[] array3 = nombre3.split(" ");

            //Almacenamos el nombre en una variable
            String n1 = array1[0].toString();
            String n2 = array2[0].toString();
            String n3 = array3[0].toString();

            //Evaluamos con operador ternario
            String masLargo = n1.length() > n2.length() ? n1 : n2;
            masLargo = masLargo.length() > n3.length() ? masLargo : n3;

            JOptionPane.showMessageDialog(null, "El nombre más largo es "+masLargo);

        }catch (Exception e){
            System.out.println("Datos introducidos no soportados\nRevíselos y vuelva a introducirlos");
            main(args);
        }
    }
}
