package HolaMundo;

public class ConversionDeTipos {
    public static void main(String[] args) {

        /**
         * VEAMOS LA CONVERSIÓN DE DATOS ENTRE PRIMITIVOS
         * --> Es importante saber cuando deberemos asumir la pérdida de información
         * */

        /** ENTRE PRIMITIVOS NUMÉRICOS */
        /** cuando pasamos de un tipo más pequeño a uno más grande, no hay problema */
        int i = 10000;
        long l = i;
        System.out.println("l = " + l);
        /** al pasar de uno grande a uno más pequeño, es posible que la información se trunque creando ambigüedad
         * por ello, el compilador nos avisa de ese riesgo y debemos hacerlo mediante casting */
        //short s = i; --> esto de por sí da error, ya que es posible exceder la memoria del short
        // veamos la capacidad de short
        short s1 = Short.MAX_VALUE;  // --> 32767
        System.out.println("s1 = " + s1); // vemos que 10000 cabe perfectamente en un short
        // por lo que en este caso podremos hacer el casting sin riesgos
        short s = (short)i; // debemos hacer el casting, ya que i es de tipo int

        /** En el caso de que no nos quede más remedio de convertir con truncado de información,
         * mejor hacerlo manualmente, ya que si lo hace el compilador, lo puede poner en negativo */
        int i1 = 32768; //excede la capacidad del short
        short s2 = (short) i1; // hacemos el casting igualmente
        System.out.println("s2 = " + s2); // se ha puesto el valor en negativo

        //DECLARAMOS i1 (32768) COMO FLOAT
        float f = i1; // no hay problema
        System.out.println("f = " + f);

        // veamos que ocurre si forzamos un truncado entre números reales
        f = Float.MAX_VALUE; // 3.4028235E38
        System.out.println("f = " + f);
        System.out.println("veamos que ocurre si forzamos un truncado entre números reales");
        double d = 46546846845867687167.35464684684604068684354136314354364354;
        float f1 = (float) d; // --> f1 = 4.654685E19
        System.out.println("d = " + d);
        System.out.println("f1 = " + f1);


        /** ENTRE ENTEROS Y CHAR */
        byte b = 64; // lo convertimos a char con casting
        char c = (char) b; // recordamos que cada unicode se representa con un entero
        System.out.println("c = " + c); // en este caso c = 64 -- corresponde a --> @

        /** NO PODEMOS PRETENDER CONVERTIR TIPOS INCOMPATIBLES */
        boolean bol = true;
        /** directamente daría error */
//        int i3 = (int) bol;
//        char c3 = (char) bol;


        System.out.println("\n");

        /** CONVERSIÓN String --> int */
        String numString = "50";
        int numInt = Integer.parseInt(numString);
        System.out.println("numInt = " + numInt);;; //vemos el resultado
        /** El método parse... lo encontramos en todos los tipos envoltorio numéricos (Byte, Short, Long ...)*/

        // LO MISMO PARA NÚMEROS REALES
        // double declarado normal
        String numDoubleStr1 = "45896.36";
        double numDouble1 = Double.parseDouble(numDoubleStr1);
        System.out.println("numDouble1 = " + numDouble1);
        // double declarado con notación científica igualmente
        String numDoubleStr2 = "45.89e-27";
        double numDouble2 = Double.parseDouble(numDoubleStr2);
        System.out.println("numDouble2 = " + numDouble2);

        // CON BOOLEANOS
        String boolString = "true"; // solo admite true/false --> usa el método ignoreCase()
        boolean booleano1 = Boolean.getBoolean(boolString);
        System.out.println("booleano1 = " + booleano1);


        System.out.println("\n");
        /**  A PARTIR DE JAVA 10, DISPONEMOS DE TIPOS DINÁMICOS (var)
         *   donde lo qu manda es la literal */


        /** CONVERSIÓN String --> int */
        var numString7 = "50";
        var numInt7 = Integer.parseInt(numString7);
        System.out.println("numInt = " + numInt7); //vemos el resultado
        /** El método parse... lo encontramos en todos los tipos envoltorio numéricos (Byte, Short, Long ...)*/

        // LO MISMO PARA NÚMEROS REALES
        // double declarado normal
        var numDoubleStr5 = "45896.36";
        var numDouble5 = Double.parseDouble(numDoubleStr5);
        System.out.println("numDouble1 = " + numDouble5);
        // double declarado con notación científica igualmente
        var numDoubleStr8 = "45.89e-27";
        var numDouble8 = Double.parseDouble(numDoubleStr8);
        System.out.println("numDouble2 = " + numDouble8);

        // CON BOOLEANOS
        var boolString2 = "true"; // solo admite true/false --> usa el método ignoreCase()
        var booleano12 = Boolean.getBoolean(boolString2);
        System.out.println("booleano1 = " + booleano12);

        System.out.println("\n");

        /**
         * VAMOS A INVERTIR EL PROCESO
         * POR LO QUE TOMAMOS UN PRIMITIVO Y LO CONVERTIMOS A STRING
         * */

        /** int --> String */

        // usamos Integer.toString()
        int num = 256;
        String numStr = Integer.toString(num);
        System.out.println("numStr = " + numStr);

        // usamos String.valueOf()
        int num2 = 78;
        String numStr2 = String.valueOf(num2);
        System.out.println("numStr2 = " + numStr2);

        /** double --> String */

        // toString()
        double numDouble = 78.55851264e12;
        String numDoubleStr = Double.toString(numDouble);
        System.out.println("numDoubleStr = " + numDoubleStr);

        // valueOf()
        double numDouble22 = 1.36986544158;
        String numDouble22Str = String.valueOf(numDouble22);
        System.out.println("numDouble22Str = " + numDouble22Str);

        System.out.println("\n");

        /** También lo podemos hacer poniendo directamente el valor*/

        // valueOf()
        String prueba = String.valueOf(58.365986e3f); // inicializamos String directamente con float
        System.out.println("prueba = " + prueba);

        // toString()
        String prueba2 = Double.toString(48.36985325471e28);
        System.out.println("prueba2 = " + prueba2);

        /**
         * IGUALMENTE LO HARÍAMOS PARA CONVERTIR CUALQUIER TIPO DE PRIMITIVO A STRING
         * */


    }
}
