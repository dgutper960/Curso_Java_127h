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
        int ramdom3 = (int) Math.round(random2);
        System.out.println("ramdom3 = " + ramdom3);
    }
}
