package Operadores;

import java.util.Scanner;

/**
 * Programa que pide al usuario nombre y contraseña.
 * --> Validación requerida
 * --> Uso clase Scanner
 * --> Manejo de posibles errores
 * */

public class EjemploLoginScanner {
    public static void main(String[] args) {

        try{
            String usuario1 = "dgutper960";
            String contraseña1 = "1234567";

            String usuario2 = "xxxxxxx123";
            String contraseña2 = "1234567";



            Scanner login = new Scanner(System.in);
            System.out.println("BIENVENIDO AL SISTEMA DE VALIDACIÓN\n" +
                    "Ingrese su nombre de usuario:");
            String nombre = login.nextLine();
            System.out.println("Ingrese su contraseña:");
            String pass = login.nextLine();

            /**OPCIONAL*/
            // DECLARAMOS UN BOOLEANO QUE PODAMOS USAR EN OTROSR PROPÓSITOS Y QUE SEA TRUE O FALSE SEGÚN EL RESULTADO
            boolean esAutentificado = nombre.equals(usuario1) && pass.equals(contraseña1) || nombre.equals(usuario2) && pass.equals(contraseña2);
            /** podría ponerse esta consulta directamente en el if, el booleano es para qu pueda ser usada en más contextos */


            // Creamos la condicional para comparar los datos
            if(esAutentificado){
                System.out.println("HOLA "+nombre+" BIENVENID@ AL SISTEMA");
            }else {
                System.out.println("LO SENTIMOS,\nEl nombre de usuario y la contraseña no coinciden o no son válidos\nPor favor, Vuélvalo a intentar\n\n");
                main(args);
            }
        // POSIBLEMENTE, NO SEA NECESARIO, LO TOMA TÓ COMO UN STRING
        }catch (Exception e) {
            System.out.println("¡¡ERROR!!\n, Los datos introducidos no son soportados\n Por favor, revíselos y vuelva a intentarlo");
            main(args);
        }

    }
}
