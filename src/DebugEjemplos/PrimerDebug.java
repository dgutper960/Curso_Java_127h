package DebugEjemplos;

public class PrimerDebug {
    public static void main(String[] args) {

        /**
         * PARA EL DEBUG
         * 1. SE DEBEN PONER LOS PUNTOS RE RUPTURA
         *    EN LAS LÍNEAS DE INTERÉS
         * 2. PULSAMOS EN EL BICHO
         * 3. VAMOS VIENDO EN CONSOLA Y PASANDO LAS LÍNEAS CON LOS CONTROLES DEL DEBUGGER
         *    TAMBIÉN PODREMOS CAMBIAR AL SIGUIENTE MÉTODO EN EL CASO DE HABERLOS
         * 4. SE VAN MOSTRANDO LOS VALORES DE INTERÉS EN CADA MOMENTO
         *    TANTO EN LA CONSOLA COMO EN LA LINEA CORRESPONDIENTE
         * 5. SELECCIONANDO FRAGMENTOS DE LÍNEA CON EL RATÓN SE NOS MUESTRA EL RESULTADO EN CADA MOMENTO
         * 6. PODEMOS CAMBIAR ENTRE VISUALIZAR EL DEBUGGER Y LA CONSOLA
         * */

        int i = 14;
        int j = 81;
        int k = 20;

        /** Si queremos sacar la media,
         * NO PODEMOS HACER LO SIGUIENTE  */
        float media1 = i + j + k / 3;
        System.out.println("media1 = " + media1);
        // sería equivalente a hacer esto
        float media2 = i + j + (k / 3);
        System.out.println("media2 = " + media2);
        /** Debemos añadir prioridad a la suma con los paréntesis */
        float media3 = (i + j + k) / 3f; // recordemos que hay que devolver un float (3f)
        System.out.println("media3 = " + media3);

        /** PRIORIDAD ENTRE MULTIPLICACIÓN Y DIVISIÓN */
        // ¿QUÉ PASARÁ AHORA?
        float media4 = i + j + k / 3f * 10;
        // EN ESTE CASO LA DIFERENCIA LA MARCA LA DIRECCIÓN (de izquierda a derecha)
        float media5 = i + j + ((k / 3f) * 10);
        System.out.println("media5 = " + media4); /** 161.66666 */

        /** Si ponemos dos grupos de paréntesis va a primar la dirección */
        float media6 = (i + j + k) / (3f * 10);
        /**
         * 1. las sumas
         * 2. la multiplicación
         * 3. la división
         * */
        System.out.println("media6 = " + media6); /** 3.83 */

        /**
         * CUANDO ENTRAN EN JUEGO OPERADORES DE INCREMENTO
         * */

        int a = 10;
        int b = 5;

        float calculo1 = ++a + b++ + k / i * j;  // 97.0
        /**
         * 1. Va a sumar los valores con incremento (11+5) -> a con pre-incremnto
         * 2. Suma el resultado a (k/i)
         * 3. El resultado * j
         * */
        System.out.println("calculo1 = " + calculo1);

        /** Si añadimos este detalle */
        float calculo2 = ++a + b++ + k / i * j + b;  // 103.0 (ha sumado 6)
        System.out.println("calculo2 = " + calculo2);
        // vemos que al sumar d de nuevo ya ha incrementado


    }
}
