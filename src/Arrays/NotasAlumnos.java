package Arrays;

import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        /**
         * Vamos a implementar un programa para evaluar las notas de cada alumno en 3 asignaturas
         * IMPLEMENTAREMOS:
         * --> Un array por asignatura (3)
         * --> Una posición por alumno en cada una de las asignaturas (4)
         * --> Suponemos que cada alumno se representa por id = índice
         * --> Entrada de notas por consola
         * */
        try {
            double[] matematicas, lengua, historia;
            matematicas = new double[4];
            lengua = new double[4];
            historia = new double[4];

            Scanner inputNotas = new Scanner(System.in);

            for (int i = 0; i < 4; i++) {
                System.out.println("Introduzca nota matemáticas alumno id. " + (i + 1));
                matematicas[i] = inputNotas.nextDouble();
                System.out.println("Introduzca nota lengua alumno id. " + (i + 1));
                lengua[i] = inputNotas.nextDouble();
                System.out.println("Introduzca nota historia alumno id. " + (i + 1));
                historia[i] = inputNotas.nextDouble();
            }

            // CALCULAMOS LAS NOTAS MEDIAS DE CADA ALUMNO
            double notaMedia = 0.0;
            for (int i = 0; i < 4; i++) {
                notaMedia = ((matematicas[i] + lengua[i] + historia[i]) / 3);
                System.out.println("La nota media del alumno " + (i + 1) + " es " + notaMedia);
            }

            // CALCULAMOS LA NOTA MEDIA POR ASIGNATURA
            double mediaMat = 0.0;
            double mediaLeng = 0.0;
            double mediaHist = 0.0;
            for (int i = 0; i < 4; i++) {
                mediaMat += matematicas[i];
                mediaLeng += lengua[i];
                mediaHist += historia[i];
            }

//            System.out.println("Si desea saber la nota de un alumno introduzca su id ");
//            System.out.println("Solo números del 1 al " + matematicas.length);
//            int id = inputNotas.nextInt() - 1;
//            double mediaAlumno;
//            if ((id >= 1) && (id <= matematicas.length)) {
//                mediaAlumno = (matematicas[id] + lengua[id] + historia[id]) / 3;
//                System.out.println("La media del alumno con id " + (id + 1) + " es " + mediaAlumno);
//            } else {
//                System.out.println("El id del alumno no existe, introduzca uno correcto");
//                id = inputNotas.nextInt() - 1;
//                mediaAlumno = (matematicas[id] + lengua[id] + historia[id]) / 3;
//                System.out.println("La media del alumno con id " + (id + 1) + " es " + mediaAlumno);
//            }

            System.out.println("La media de matemáticas entre todos los alumnos es = " + (mediaMat/3));
            System.out.println("La media de lengua entre todos los alumnos es = " + (mediaLeng/3));
            System.out.println("La media de historia entre todos los alumnos es = " + (mediaHist/3));


        }catch (Exception e){
            System.err.println("EL DATO INTRODUCIDO DEBE SER DOUBLE");
            main(args);
        }

    }
}
