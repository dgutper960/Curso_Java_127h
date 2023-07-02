package HolaMundo;

public class ConversionDeTipos {
    public static void main(String[] args) {

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

        /**
         * IGUALMENTE LO HARÍAMOS PARA CONVERTIR CUALQUIER TIPO DE PRIMITIVO
         * */













    }
}
