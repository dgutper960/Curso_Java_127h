package Operadores;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /** podemos declarar numerosas variables del mismo tipo en una sola línea */
        int i = 5, j = 4, suma = i+j;

        System.out.println("suma = " + suma); // --> 9
        /** MUCHO OJO!!
         * Si queremos sumar donde haya un String, hay que ponerlo entre paréntesis */
        // lo que queramos sumar hay que ponerlo entre paréntesis
        System.out.println("i + j = " + (i + j)); /** Así no hay problema */
        // si lo hacemos al contrario, la prioridad es de la suma
        System.out.println(i + j + " = i + j "); // --> Primero suma y luego concatena

        /** Aunque el operador menos no es compatible con String podemos tener problemas si no ponemos el paréntesis */
        // sin el paréntesis, el compilador quiere tratar al operador menos con String, cosa que no es compatible
        int resta = i - j;
        System.out.println("resta = " + (i - j));

        /** multiplicación */
        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        /** con la división vemos que el resultado es float, pero nuestras variables son int */

        //NO basta con declarar la división como float
        float division = (float) i / (float) j; /** con uno de los dos bastaría */
        // en estos casos debemos hacer un cast con los operadores
        System.out.println("division = " + division); // --> 1,25

        /** Resto */
        int resto = i % j;
        System.out.println("resto = " + resto);

        /** REPASAMOS PEDIR Y MOSTRAR DATOS EN VENTANAS **/
        // declaramos variable para capturar un int usamos parseInt de Integer, ya que tomaremos un String con JOptionPane
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un entero"));
        // averiguamos si es par
        if (num % 2 == 0){
            JOptionPane.showMessageDialog(null, "El número es par");
        }else {
            JOptionPane.showMessageDialog(null, "El número es impar");
        }



    }
}
