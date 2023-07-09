package ClasesWrapper;

public class RepasoWarpper {
    public static void main(String[] args) {
        /**
         * NOS REFERIMOS A LAS CLASES DE REFERENCIA
         * ENVUELVEN A UN PRIMITIVO
         * APORTAN FUNCIONALIDADES A LOS PRIMITIVOS
         * EMPIEZAN CON MAYÚSCULA
         * SE PUEDEN INICIALIZAR MEDIANTE
         * --> LITERAL
         * --> MÉTODO PROPIO  -ej-> Integer.valueOf()
         * --> OPERADOR NEW (DEPRECATED)
         * --> DISPONEN DE OTROS MÉTODOS PARA
         *        Pasar de String a numérico
         *        Mostrar propiedades
         *        Realizar diversas modificaciones
         * */

        /** INICIALIZAR */
        //LITERAL
        Integer num = 457;
        //MÉTODO valueOf()
        Integer i = Integer.valueOf(133);
        //DESDE UN STRING
        Short s = Short.valueOf("12");
        /** OPERADOR NEW (OBSOLETO) */
//      Integer numero = new Integer(123); //--> MARCA ERROR porque es "deprecated"

        /** CONVERTIR A SU PRIMITIVO */
        float f = Float.valueOf(23.58f);
        //también mediante String
        double d = Double.valueOf("87.369852147");

        /** CAMBIAR DE TIPO A OTRO */
        //DE STRING A INTEGER
        int k = Integer.parseInt("526387");
        //DE STRING A LONG
        long l = Long.parseLong("15168431354343");

        /** CLASE CHARACTER **/
        Character c = Character.valueOf('A'); /** USAMOS UN MÉTODO ESTÁTICO */
        String toS = c.toString(); /** USAMOS UN MÉTODO DE LA INSTANCIA */
        //PASAMOS A SU TIPO PRIMITIVO
        char c2 = c.charValue();
        // USAMOS UN MÉTODO ESTÁTICO CON ARGUMENTO
        char c3 = Character.toLowerCase(c);
        /** Usamos métodos de Character con retorno booleano **/
        boolean b = Character.isDigit(c);
        boolean b2 = Character.isAlphabetic(c);
        boolean b3 = Character.isUpperCase(c);
        boolean b4 = Character.isLetter(c);
        /** etc */

        /** CLASE BOOLEAN */
        Boolean bool = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf("false");
        String s3 = bool.toString();
        boolean bool3 = bool.booleanValue();


        /**
         * PARA AMPLIAR ESTE TEMA, REVISAR LOS RECURSOS DEL CURSO
         * */










    }
}
