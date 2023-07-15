package ClaseMath;

public class MathRandom {
    public static void main(String[] args) {

        /**
         * MÉTODO DE LA CLASE MATH PARA GENERAR NÚMEROS ALEATORIOS
         * --> El método en sí devuelve un valor aleatorio entre 0 y 1 (ambos no inclusive)
         * */

        /** Random por defecto (entre 0 y 1)*/
        double random = Math.random();
        System.out.println("random = " + random);

        /** Lo mismo si queremos un número entre 0 y 7 (no inclusive) */
        double random2 = random *= 7;
        System.out.println("random2 = " + random2);

        /** Lo podemos redondear y cambiar a otro tipo como queramos */
        double aleatorio1 = Math.floor(random2);
        System.out.println("double aleatorio1 = " + aleatorio1);
        float aleatorio2 = (float) Math.ceil(random2);
        System.out.println("float aleatorio2 = " + aleatorio2);
        int ramdom3 = (int) Math.round(random2);
        System.out.println("int ramdom3 = " + ramdom3);

        /**
         * SUPONGAMOS QUE QUEREMOS OBTENER COLORES ALEATORIOS PARTIENDO DE UN NÚMERO RANDOM
         * */

        /** Creamos un array de colores (imaginemos que no sabemos cuantos colores hay) */
        String[] colores = {"verde","azul", "turquesa", "rojo", "amarillo", "violeta", "naranja", "ocre", "rosa"};

        /** necesitamos el número random por el tamaño del array
         * y lo usamos para imprimir el valor del índice aleatorio **/
        int numColor = (int) Math.round(Math.random()* colores.length);
        String color = colores[numColor];
        System.out.println("color aleatorio = " + color);

    }
}
