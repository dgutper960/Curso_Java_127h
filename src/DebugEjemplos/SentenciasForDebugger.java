package DebugEjemplos;

public class SentenciasForDebugger {
    public static void main(String[] args) {

        /**
         * PUNTO DE RUPTURA Y DEBUG EN CUALQUIER FOR DE ESTE CÓDIGO
         * SE A AÑADIDO AL FINAL EL EJEMPLO DE FOR ANIDADO PARA ETIQUETAS
         * */


        System.out.println("Imprime los días el mes de enero");
        for (int i = 1; i <= 31; i++){
           System.out.println(i);
        }

        System.out.println("Imprime los días del mes de enero del revés");
        for (int i = 31; i >= 1 ; i--){
            System.out.println(i);
        }


        System.out.println("Imprime los días de mayo del revés");
        int diasMayo = 30;
        for (;diasMayo >= 1; diasMayo--){
            System.out.println(diasMayo);
        }

        System.out.println("diasMayo --> "+diasMayo); // --> 0 (se ha decrementado con cada iteración)


        System.out.println("Imprime los días del mes de mayo");
        for (int i = diasMayo+1; i <= 30; i++){
            System.out.println(i);
        }

        System.out.println("diasMayo --> "+diasMayo); // --> 0 (es el valor que tenía en ese momento)
        System.out.println("\n\n");


        for (int i = 0; i <= 10; i++){
            if (i % 2 == 0){ /** Solo imprime los números pares */
                System.out.println(i);
            } /** ¿Te imaginas el código para imprimir solo los años bisiestos?? */
        }

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

//        int i = 0;
//        for ( ; ; ){
//            if (i > 4){ /** ahora la condición ha cambiado a "hasta que" */
//                break; // para evitar el bucle infinito
//            }
//            System.out.println("Esta es la vuelta "+(++i)); /** ojo que esta va con pre-incremento */
//        }
        /** EJEMPLO FOR ANIDADO Y SU VERSIÓN OPTIMIZADA PARA VER EN DEBUG  */

        /** Ampliamos el problema y ahora queremos saber cuantas veces aparece una palabra dada en el texto
         * Necesitamos un for para buscar en la frase y otro para comparar con la palabra  **/
        String frase = "un elefante dos elefantes tres elefantes y cuatro elefantes";
        String palabra = "elefante";
        int maxP = palabra.length();
        int maxF = frase.length() - maxP +1;
        int count = 0;

        buscar:
        for(int i = 0; i < maxF ; i++){
            int k = i;
            for (int j = 0; j < maxP ; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }
            count++; // cuando no halla ninguna diferencia entre los caracteres de la frase y la palabra suma 1
        }
        System.out.println("Palabras iguales = " + count);

        /** Veamos un ejemplo de como se puede optimizar ese código */
        count = 0;
        buscar2:
        for(int i = 0; i < maxF ; ){
            int k = i;
            for (int j = 0; j < maxP ; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    i++; /** cuando no la encuentra hace el incremento normal */
                    continue buscar2;
                }
            }
            count++;
            i = i + maxP; /** cuando encuentra una palabra no vuelve atrás de esa misma palabra */
        }
        System.out.println("Palabras iguales = " + count);

    }
}
