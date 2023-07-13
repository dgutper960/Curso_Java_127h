package ClaseMath;

public class EjemploMath {
    public static void main(String[] args) {
        /**
         * PODEMOS USAR ESTA CLASE PARA UNA GRAN VARIEDAD DE APLICATIVOS MATEMÁTICOS
         * ESTA CLASE ESTÁ DISEÑADA PARA USAR SUS MÉTODOS ESTÁTICOS SIN INSTANCIAS NI HERENCIAS
         * */

        /** OBTENER EL VALOR ABSOLUTO Math.abs() **/
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        /** OBTENER EL MÁXIMO DE DOS VALORES DADOS .max() */
        double mayorD = Math.max(54.189e-62, 13.28e-24);
        System.out.println("mayorD = " + mayorD);

        /** OBTENER EL MÁXIMO DE DOS VALORES DADOS .min() */
        double menorD = Math.min(54.189e-62, 13.28e-24);
        System.out.println("mayorD = " + menorD);

        /** REDONDEO HACIA ARRIBA */
        float redondeo1 = (float) Math.ceil(7.5f);
        System.out.println("redondeo1 = " + redondeo1);

        /** REDONDEO HACIA ABAJO */
        float redondeo2 = (float) Math.floor(7.5f);
        System.out.println("redondeo2 = " + redondeo2);

        /** RETORNO DE ENTERO DE VALOR MÁS CERCANO .round() **/
        long redondeo3 = Math.round(2765.5);
        System.out.println("redondeo3 = " + redondeo3);

        /** OBTENER LA CONSTANTE PI */
        double pi = Math.PI;
        System.out.println("pi = " + pi);

        /** Combinación de las dos anteriores */
        redondeo3 = Math.round(Math.PI);
        System.out.println("redondeo3 = " + redondeo3);

        /** VEMOS El VALOR DE LA POTENCIA n DE LA CONSTANTE e CON .exp() RETORNA DOUBLE **/
        double exp = Math.exp(2); // constante e = 2.718281828459045 elevado a 2
        System.out.println("exp = " + exp);

        /** LOGARITMO NATURAL DE UN VALOR DADO TOMANDO COMO BASE EL VALOR DE e RETORNA DOUBLE **/
        double log = Math.log(10);
        System.out.println("log = " + log);

        /** POTENCIA NORMAL POR ARGUMENTO NÚN, POTENCIA .pow() RETORNA DOUBLE **/
        double potencia = Math.pow(79, 3);
        System.out.println("potencia = " + potencia);

        /** RAÍZ CUADRADA DE UN VALOR DADO */
        double raiz = Math.sqrt(potencia);
        System.out.println("raiz = " + raiz);

        /** PASAR DE RADIANES A GRADOS RETORNA DOUBLE */
        double aGrados = Math.toDegrees(12.6);
        System.out.println("Pasamos de radianes a grados = " + aGrados);

        /** PASAR DE GRADOS A RADIANES */
        double aRadianes = Math.toRadians(45d); // recibe un double
        System.out.println("Pasamos de grados a radianes = " + aRadianes);

        /** SENO **/
        double seno = Math.sin(90d);
        System.out.println("coseno = " + seno);

        /** COSENO **/
        double coseno = Math.cos(90d);
        System.out.println("coseno = " + coseno);






    }
}
