package Bucles;

public class EtiquetasEnForWhile {
    public static void main(String[] args) {

        /**
         * CON LA ETIQUETA PODEMOS MARCAR SOBRE QUE BUCLE QUEREMOS
         * QUE ACTÚE UN BREAK O CONTINUE
         * CUANDO TENEMOS BUCLES ANIDADOS
         * */

        /** Ejemplo de for con un continue */
        for(int i = 0; i <= 4; i++){
            if(i == 2){ /** se va a saltar el 2 y el bucle continua */
                continue;
            }
            System.out.println("valor de i = " + i);
        }
        /** Aquí no hay problema, pero si tenemos un bucle anidado */


        /** marcamos el bucle con un ID: pegado al for por arriba o la izquierda */
       bucle1: // misma convención que para variables y métodos, seguido de dos puntos
        for (int i = 0; i <= 5; i++){

            System.out.println();//esto es para que se vea más claro
            for (int j = 0; j <=5 ; j++){
                if (i==2){
                    continue bucle1; /** marcamos que es para el bucle1*/
                } // queremos tener claro que el continue hace referencia al 1.er bucle
                System.out.println("[i = "+i+", j = "+j+"], ");
            }
        } /** VEMOS PERFECTAMENTE QUE EL BLOQUE DEL CONTINUE A ACTUADO SOLO SOBRE EL BUCLE 1
         --> Hemos quitado la marca y el bucle ha funcionado igual, pero entendemos que es un ejemplo  **/

        System.out.println("==================================================================");

        /** CON EL BRAKE EL FUNCIONAMIENTO ES EL MISMO
         * lo que con el break solo se van a ejecutar los bloques hasta i = 1 **/

        etiqueta1: // misma convención que para variables y métodos, seguido de dos puntos
        for (int i = 0; i <= 5; i++){

            System.out.println();//esto es para que se vea más claro
            for (int j = 0; j <=5 ; j++){
                if (i==2){
                    break etiqueta1; /** marcamos que es para etiqueta1*/
                } // queremos tener claro que el continue hace referencia al 1.er bucle
                System.out.println("[i = "+i+", j = "+j+"], ");
            }
        }
        /**
         *  TRAS ESTA SEGUNDA PRUEBA SI COMPROBAMOS QUE EFECTIVAMENTE,
         *  PUEDE HABER AMBIGÜEDAD SI NO MARCAMOS CORRECTAMENTE
         * --> El bloque if a actuado pero el brake no lo ha hecho
         * **/

        System.out.println("\n==================================================================\n");

        /** VEAMOS UN EJEMPLO PRÁCTICO */
        /** Vamos a contar cuantas veces aparece un carácter en una frase */
        String trabalenguas = "tres tristes tigres tragan trigo en un trigal";
        char letra = 't';
        int max = trabalenguas.length();
        int ocurrencias = 0;
        // recorremos el String
        for (int i = 0; i < max; i++){
            if (trabalenguas.charAt(i) == letra){
                ocurrencias++;
            }
        }
        System.out.println("ocurrencias = " + ocurrencias);

        /** Ampliamos el problema y ahora queremos saber cuantas veces aparece una palabra dada en el texto
         * suponemos que necesitamos un for para buscar en la frase y otro para comparar con la palabra  **/
        String frase = "un elefante dos elefantes tres elefantes y cuatro elefantes";
        String palabra = "elefante";
        int maxP = palabra.length();
        int maxF = frase.length() - maxP +1; // para optimizar la búsqueda al final de la frase
        int count = 0;

        buscar:
        for(int i = 0; i < maxF ; i++){
            int k = i; // necesitamos una variable auxiliar para incrementar con j sin alterar i
            for (int j = 0; j < maxP ; j++){ // frase.charAt(k++)--> primero busca y luego incrementa
                if(frase.charAt(k++) != palabra.charAt(j)){ // haya diferencias entre los caracteres de la frase y de la palabra
                    continue buscar; //marcamos el continue al 1.er bucle --> Si hay diferencia itera el 1.er bucle
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


