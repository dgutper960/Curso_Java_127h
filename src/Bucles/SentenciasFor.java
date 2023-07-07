package Bucles;

public class SentenciasFor {
    public static void main(String[] args) {
        /**
         * OPCIÓN PARA CUANDO CONOCEMOS UN LÍMITE DE ITERACIONES
         *
         * ESTÁ FORMADO POR TRES PARES
         * --> Estado Inicial
         * --> Condición, si se cumple entrá al bloque de código
         * --> Incremento o decremento del índice
         * for (estado inicial; expresión booleana; pos-incremento ){
         * */

        System.out.println("Imprime los días el mes de enero");
        for (int i = 1; i <= 31; i++){
           System.out.println(i);
        }

        System.out.println("Imprime los días del mes de enero del revés");
        for (int i = 31; i >= 1 ; i--){
            System.out.println(i);
        }

        /** PODEMOS TOMAR EL ESTADO INICIAL DE UNA VARIABLE PREVIAMENTE INICIALIZADA */

        System.out.println("Imprime los días de mayo del revés");
        int diasMayo = 30;
        for (;diasMayo >= 1; diasMayo--){
            System.out.println(diasMayo);
        }
        /** DEBEMOS TENER EN CUENTA QUE, EN ESTE CASO, EL ESTADO DE LA VARIABLE SERÁ ALTERADO */
        System.out.println("diasMayo --> "+diasMayo); // --> 0 (se ha decrementado con cada iteración)
        /** POR LO QUE ES RECOMENDABLE SIEMPRE TOMAR EL VALOR DE FUERA INICIALIZANDO OTRA EN EL CONTEXTO DEL FOR */

        System.out.println("Imprime los días del mes de mayo");
        for (int i = diasMayo+1; i <= 30; i++){ /** tomamos el valor de fuera, pero no lo vamos a modificar */
            System.out.println(i);
        }
        /** HEMOS USADO EL VALOR DE mesMayo PERO LO LO HEMOS ALTERADO
         * YA QUE HEMOS USADO PARA EL INCREMENTO UNA VARIABLE QUE SOLO EXISTE DENTRO DEL FOR **/
        System.out.println("diasMayo --> "+diasMayo); // --> 0 (es el valor que tenía en ese momento)
        System.out.println("\n\n");

        /** PODEMOS CONTROLAR CON UN IF PARA QUE SE EJECUTE EL BLOQUE DE CÓDIGO SOLO EN ALGUNAS CIRCUNSTANCIAS */
        for (int i = 0; i <= 10; i++){
            if (i % 2 == 0){ /** Solo imprime los números pares */
                System.out.println(i);
            } /** ¿Te imaginas el código para imprimir solo los años bisiestos?? */
        }
        /** PARA NÚMERO IMPARES */
        for (int i = 0; i <= 10; i++){
            if (!(i % 2 == 0)){ /** Se niega la expresión entera */
                System.out.println(i);
            }
        }

        System.out.println();

        /** de esta forma lo ha puesto el profesor */
        for (int i = 0; i<=10 ; i++){
            if((i%2==0)){ // Este bloque no tiene ninguna ejecución
                continue; // para que el bucle continue (contrario a break)
            } // sout fuera del bloque if
            System.out.println(i); // solo imprime los impares
        }
        for (int i = 0; i<=10 ; i++){
            if(!(i%2==0)){ // niega la expresión entera -igual a--> i%2!=0
                // se podrían poner más sentencias
                continue;
            }
            System.out.println(i); //Fuera del bloque if solo imprime los pares
        }

        System.out.println("\n");

        /** PODEMOS TENER BUCLES FOR CON DOS ESTADOS INICIALES */
        for (int i = 1, j = 10; i < j ; i++, j--){
            //itera hasta que i llegue a 5
            System.out.println("i --> "+i);
            System.out.println("j --> "+j);
            System.out.println("-------------");
        }


        System.out.println("\n\n");
        /** TAMBIÉN PODEMOS SEPARAR EL RESTO DE SECCIONES DEL FOR Y PONER LA CONDICIÓN A PARTE CON UN IF
         * Y PONER EL INCREMENTO EN OTRAS PARTES DEL FLUJO O CÓDIGO PARA
         * FORMAR ESTRUCTURAS MÁS COMPLEJAS, aunque creo que poco prácticas ¬¬ */

        int i = 0;
        for ( ; ; ){
            if (i > 4){ /** ahora la condición ha cambiado a "hasta que" */
                break; // para evitar el bucle infinito
            }
            System.out.println("Esta es la vuelta "+(++i)); /** ojo que esta va con pre-incremento */
        }
        /** AUNQUE ESTO ES UN EJEMPLO PARA ENTENDER COMO FUNCIONA MÁS QUE NADA */
    }
}
