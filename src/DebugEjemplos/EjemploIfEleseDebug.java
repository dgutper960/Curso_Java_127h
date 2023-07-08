package DebugEjemplos;

public class EjemploIfEleseDebug {
    public static void main(String[] args) {

        /**
         * VAMOS A DEPURARA ESTE CÓDIGO
         *
         * --> CON EL PUNTO DE RUPTURA INDICAMOS DÓNDE EMPIEZA EL DEBUG
         * 1. Colocamos el punto de ruptura en el 1.er if
         * 2. Pulsando Step Over, vamos paso a paso y vemos que las instrucciones que están en 'false' se las salta
         * 3. Llegamos a la que está en true, ahora sí entra a la sentencia, vez hecha, se va directamente al final del programa
         * */



        float promedio = 7.9f;

        System.out.println("Tu promedio es "+promedio+"\n");


        if(promedio == 10){
            System.out.println("¡¡Excelente!! Sacaste la nota máxima. ¡Felicidades!!");
        } else if (promedio >= 9 && promedio < 10) {
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
        } else {
            System.out.println("La nota introducida no es válida, revise los datos de entrada.");
        }

    }
}
