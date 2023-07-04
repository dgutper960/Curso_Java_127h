package Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        /** Iniciamos con un entero a valor negativo */
        int i = -5;

        /** Asignamos a otra variable ese valor pero con el signo opuesto */
        int j = +i; // --> j = (1)*i => -5 (menos x más = menos)
        System.out.println("j = " + j);

        /** Inicializamos otra variable con el valor de -i (que contiene un valor negativo) */
        int k = -i; // --> k = (-1)*i => 5 (menos x menos = más)
        System.out.println("k = " + k);

        /** Vamos a modificar el valor de i */
        i = 6;
        /** Asignamos a j */
        j = +i; // --> j = (1)*i = 6 (más x más = más)
        System.out.println("j = " + j);

        /** Asignamos a k */
        k = -i; // --> k = (-1)*i = -6 (más x menos = menos)
        System.out.println("k = " + k);

        /**
         * En resumen, los operadores unarios se usan para invertir el signo de un valor numérico
         * */
    }
}
