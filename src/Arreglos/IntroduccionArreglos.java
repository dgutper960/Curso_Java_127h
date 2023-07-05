package Arreglos;

import java.util.Scanner;

/**
 * EN UN EJERCICIO ANTERIOR HABÍAMOS CREADO UN SOFTWARE
 * PARA VALIDAR UN LOGIN CON USUARIO Y CONTRASEÑA
 *
 * --> Ejercicio original en src.Operadores.EjemploLoginScanner
 * */

public class IntroduccionArreglos {
    public static void main(String[] args) {

        /**
         * En el código original, por poco que tengamos varios usuarios
         * ya vamos a tener problemas de optimización
         *
         * La solución puede pasar por almacenar los datos en un Arreglo o Array
         * */

            /** Declaramos un array String[] para los usuarios y otro para las contraseñas  */
            String[] users = new String[2]; // debemos poner el tamaño para que se reserve el espacio en memoria
            String[] passwords = new String[2]; // array con 8 posiciones

            /** Almacenamos los datos en los respectivos índices, hay que mostrar la posición deseada entre corchetes */
            users[0] = "da";
            passwords[0] = "123";
            /** Este código funciona tal cual porque los índices de users y passwords siempre coinciden */
            users[1] = "es";
            passwords[1] = "321";



            Scanner login = new Scanner(System.in);
            System.out.println("BIENVENIDO AL SISTEMA DE VALIDACIÓN\n" +
                    "Ingrese su nombre de usuario:");
            String nombre = login.nextLine();
            System.out.println("Ingrese su contraseña:");
            String pass = login.nextLine();
            boolean esUsuario = false;

            // CREAMOS UNA ESTRUCTURA FORD PARA BUSCAR LOS DATOS EN EL ARRAY
            for(int i = 0; i < users.length; i++){
                if (users[i].equals(nombre) && passwords[i].equals(pass)) {
                    esUsuario = true;
                    break; // rompemos para que no siga iterando
                } // si la validación es correcta, se pone esUsuario a true
            }
            // se evalúa el booleano esUsuario para lanzar el mensaje
            if (esUsuario){
                System.out.println("HOLA "+nombre+" BIENVENID@ AL SISTEMA\n\n");
                main(args);
            }else {
                System.out.println("LO SENTIMOS,\nEl nombre de usuario y la contraseña no coinciden o no son válidos\nPor favor, Vuélvalo a intentar\n\n");
                main(args);
            }

            /**
             * CABE DESTACAR, QUE SE HAN TENIDO PROBLEMAS, HASTA QUE SE HA OPTIMIZADO EL CÓDIGO
             * */
    }
}
