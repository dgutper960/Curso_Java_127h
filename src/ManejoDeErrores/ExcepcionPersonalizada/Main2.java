package ManejoDeErrores.ExcepcionPersonalizada;

import javax.swing.*;
/** Vamos a manejar la Excepción obligatoria con un try/catch
 *  (OPCIÓN RECOMENDADA) **/
public class Main2 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        String valor = JOptionPane.showInputDialog("Introduzca un entero");

        try {
            // EL COMPILADOR NOS OBLIGA A MANEJAR ESTE ERROR, LO HACEMOS CON TRY/CATCH
            calculadora.division(890, Integer.parseInt(valor));
        }catch (CustomDivPorCeroException CDVC){
            System.err.println(CDVC.getMessage());
            main(args);
        }


    }
}
