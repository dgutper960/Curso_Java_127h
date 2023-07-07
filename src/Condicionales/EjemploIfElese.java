package Condicionales;

public class EjemploIfElese {
    public static void main(String[] args) {

        /**
         *      CONTROL DE FLUJO O CONDICIONAL IF-ELSE
         * Se usa para evaluar expresiones y manejar el flujo según se cumplan o no las condiciones
         * --> Si se cumple la condición se ejecuta su bloque de código y se sale el bloque IF (no se ejecuta el siguiente)
         * --> Si no se cumple, pasa al siguiente bloque del condicional sin ejecutar el código de ese 1.er bloque
         * --> Podemos poner un bloque else por si no se cumple ninguna condición
         * --> El flujo continúa hasta que se cumpla alguna condición o se acabe la estructura en caso de no tener }else{
         * */

        /** VEAMOS UN EJEMPLO */

        // variable de ejemplo para la condición booleana
        float promedio = 7.9f;

        System.out.println("Tu promedio es "+promedio+"\n");

        // estructura if para evaluar las condiciones
        if(promedio == 10){ /** Si es true se ejecuta el código de este bloque */
            System.out.println("¡¡Excelente!! Sacaste la nota máxima. ¡Felicidades!!");
        } else if (promedio >= 9 && promedio < 10) { // debemos de tener cuidado de que no se solapen las condiciones
            System.out.println("¡¡Enhorabuena!! ¡Tienes un sobresaliente!");
        } else if (promedio >= 7.5 && promedio < 9) {
            System.out.println("¡Muy bien hecho! Tienes un notable.");
        } else if (promedio >= 6 && promedio < 7.5) {
            System.out.println("¡Buen trabajo! Esa nota esta bastante bien, sigue así.");
        } else if (promedio >= 5 && promedio < 6) {
            System.out.println("Tu nota es suficiente, pero te animo a que intentes mejorarla.");
        } else if (promedio >= 3.5 && promedio < 5) {
            System.out.println("Lo siento pero tu nota no es suficiente, debes estudiar más.");
        } else if (promedio >= 1.5 && promedio < 3.5) {
            System.out.println("Debes esforzarte mucho más, tal vez debas organizarte mejor el tiempo.");
        } else if (promedio >= 0 && promedio < 1.5) {
            System.out.println("Lo siento pero sin esfuerzo no hay recompensa, tienes la nota mínima.");
        } else { // en caso de que no se cumpla ninguna condición
            System.out.println("La nota introducida no es válida, revise los datos de entrada.");
        }

    }
}
