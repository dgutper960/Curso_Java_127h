package ManejoDeErrores.ExcepcionPersonalizada;

import javax.swing.*;

/*** Vamos a PROPAGAR la excepción desde el main **/
public class Main1 {
    public static void main(String[] args) throws CustomDivPorCeroException{

        Calculadora calculadora = new Calculadora();

        String valor = JOptionPane.showInputDialog("Introduzca un entero");

        // EL COMPILADOR NOS OBLIGA A MANEJAR ESTE ERROR, LO HACEMOS DESDE EL MAIN
        calculadora.division(890, Integer.parseInt(valor));

    }
}
