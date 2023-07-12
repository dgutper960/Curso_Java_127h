package EjerciciosFALTAN_9_Y_10.ej2_Nombres_Familiares;

import java.util.Scanner;

/**
 * La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
 *
 *     Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia
 *     o amigos como argumentos de línea de comandos.
 *
 *     Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter
 *     pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona.
 *     Por ejemplo para Andres debe quedar como N.es
 *
 *     Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
 *
 * Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
 *
 * N.es_A.ia_E.pe
 * */

public class Main {
    public static void main(String[] args) {

        try{
            //LO PRIMERO ES CREAR UNA INSTANCIA SCANNER
            Scanner inputNombres = new Scanner(System.in);
            // damos el mensaje principal y capturamos los nombres con .nexLine() de Scanner
            System.out.println("--BIENVENI@ AL GENERADOR AUTOMÁTICO--\n-----DE CÓDIGOS PERSONALIZADOS-----\n\nIntroduzca el nombre número 1");
            String nombre1 = inputNombres.nextLine();

            System.out.println("Introduzca el nombre número 2");
            String nombre2 = inputNombres.nextLine();

            System.out.println("Introduzca el nombre número 3");
            String nombre3 = inputNombres.nextLine();

            // inicializamos nuevos String para la salida con las funciones que nos crearán los respectivos códigos
            String codigo1 = nombre1.toUpperCase().charAt(1)+"."+nombre1.substring(nombre1.length()-2);
            String codigo2 = nombre2.toUpperCase().charAt(1)+"."+nombre2.substring(nombre2.length()-2);
            String codigo3 = nombre3.toUpperCase().charAt(1)+"."+nombre3.substring(nombre3.length()-2);

            // imprimimos el mensaje con el output
            System.out.println("\nLOS CÓDIGOS GENERADOS SON LOS SIGUIENTES:\n\n" +
                    "Código de "+nombre1+" --> "+codigo1+"\n" +
                    "Código de "+nombre2+" --> "+codigo2+"\n" +
                    "Código de "+nombre3+" --> "+codigo3+"\n" +
                    "\n¡MUCHAS GRACIAS!\nEstaremos encantados de volver a atenderle");
        // En caso de introducir datos no correctos, se captura la excepción y se maneja
        }catch (Exception e){
            System.out.println("ERROR!!\nLos datos introducidos no son válidos\nPor favor, revíselos, e ingrese los datos correctamente");
            main(args); // Llamada recursiva a main() en caso de error
        }
    }
}
