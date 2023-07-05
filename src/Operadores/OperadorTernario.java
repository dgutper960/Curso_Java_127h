package Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        /**
         *  LOS OPERADORES TERNARIOS
         * --> EVALUAN DOS OPCIONES
         * --> DEVUELVEN ALGO SEGÚN LA OPCIÓN QUE SE CUMPLA
         * --> LO PODEMOS CONTEMPLAR COMO UNA ABREVIATURA DEL IF-ELSE
         * --> NO RECOMENDABLE DENTRO DE UNA ESTRUCTURA QUE REQUIERA BRAKE
         * --> LA VARIABLE TERNARIA, DEBE DE SRE DEL TIPO DE DATO U OBJETO DEL RETORNO
         *
         *    ESTRUCTURA:
         * -> variable = condición? opción true: opción false
         * */

        // Siguiendo el ejemplo
        String variable = 7 > 3 ? "Es correcto" : "No es correcto";
        System.out.println("variable 7 > 3 ? = " + variable);

        System.out.println();

        // Para las notas
        float nota = 7.5f;
        String calificacion = nota >= 5? "Aprobado":"Suspenso";
        System.out.println("calificacion nota = 7.5f = " + calificacion);

        /** Esto lo podemos ver como una abreviatura del if-else
         * vamos a implementar un Scanner para que el usuario ponga las notas */

        try {

            Scanner inputNotas = new Scanner(System.in);

            System.out.println("Introduzca nota de Lengua");
            float lengua = inputNotas.nextFloat();
            System.out.println("Introduzca nota de Matemáticas");
            float mates = inputNotas.nextFloat();
            System.out.println("Introduzca nota de Inglés");
            float ingles = inputNotas.nextFloat();
            System.out.println("Introduzca nota de Geografía");
            float geografia = inputNotas.nextFloat();
            System.out.println("Introduzca nota de Historia");
            float historia = inputNotas.nextFloat();
            System.out.println("Introduzca nota de Informática");
            float informatica = inputNotas.nextFloat();

            float notaMedia = (lengua+mates+ingles+geografia+historia+informatica) / 6;

            String resultado = notaMedia >= 5? "NOTA MEDIA: "+notaMedia+"\nEnhorabuena has aprobado!!" : "NOTA MEDIA: "+notaMedia+"\nNota insuficiente, debes estudiar más!";
            main(args);

            System.out.println(resultado);

        }catch (Exception e){
            System.out.println("ERROR!!\nRevise los datos introducidos");
            main(args);
        }

    }
}
