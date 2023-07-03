package InputOutput;

import javax.swing.*;

public class InputOutputUsuario {
    public static void main(String[] args) {
        /**
         * VAMOS A TOMAR UN VALOR DE ENTRADA POR PARTE DEL USUARIO
         * --> En este ejemplo, necesitamos que el usuario ingrese un entero,
         *     pero la API swing OPtionPane() nos proporciona un String.
         * --> Debemos tener en cuenta que el usuario podría poner un dato no válido
         *     esto nos llevaría a un error y la aplicación se rompe,
         * --> Necesitamos controlar el flujo para errores previstos (bloque try - catch)
         * --> Vamos a tomar una cadena de caracteres en una variable
         * --> Vamos a convertirla a int con Integer en otra variable
         * */
        /*
        * para el manejo de errores, si provocamos de error, vemos la Excepción qu lanza:
        * Exception in thread "main" java.lang.NumberFormatException: For input string: "ho"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:665)
	at java.base/java.lang.Integer.parseInt(Integer.java:781)
	at InputOutput.InputOutputUsuario.main(InputOutputUsuario.java:22)
        * */
        // Nuestro código estará dentro del bloque try para evitar otros errores o conflictos de visibilidad
        try {
            // declaramos la variable String y la inicializamos con el valor de input obtenido
            String numString = JOptionPane.showInputDialog(null, "Ingrese un número entero");
            // declaramos la variable int y la inicializamos con la conversión a int del String anterior
            int numInt = Integer.parseInt(numString); // valor int obtenido por input (ventana)
            System.out.println(numInt);  // imprime el valor por consola el valor introducido

            /** Si quisiera mostrar ese al usuario tras una pequeña operación  */
            // operamos con el valor introducido
            int resultado = numInt * 5;
            // tenemos en cuenta que enviaremos un String
            String mensaje = "El resultado de multiplicar el valor " + numInt + " por 5 es: " + resultado;
            //JOptionPane.showMessageDialog(null, mensaje);

            /** Imaginemos que tenemos varias funciones cuyo resultado queremos mostrar en esta ventana  */
            // declaramos String mensaje para el resultado de cada función
            String mensaje2 = "Mensaje para la salida de la función 2";
            String mensaje3 = "Mensaje para la salida de la función 3";
            String mensaje4 = "Mensaje para la salida de la función 4";
            // creamos la ventana de salida y concatenamos los mensajes
            JOptionPane.showMessageDialog(null, mensaje + "\n" +
                    mensaje2 + "\n" + mensaje3 + "\n" + mensaje4);
            // cerramos el bloque try y abrimos el catch
        }catch (NumberFormatException e){ // ponemos la excepción que esperamos (ver resultado mostrado por consola) y la nombramos como 'e'
            // mostramos el mensaje al usuario para que vea el problema
            JOptionPane.showMessageDialog(null, "ERROR!!\nDede ingresar un número entero");
            // Volvemos a invocar el main() para que se vuelva a ejecutar el código
            main(args); // No debemos olvidar el argumento
        }

    }
}
