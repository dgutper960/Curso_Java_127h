package Condicionales;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        /**
         * Veamos un ejemplo práctico con Switch
         *
         * --> Según el valor de una variable se evaluan los casos
         *
         * --> SOPORTA SOLO:
         *      - Primitivos (char, byte, short, int)
         *      - Clases Referencias (Char. Byte, Short, Integer)
         *      - Enum
         *      - String
         *
         * --> ES FUNDAMENTAL PONER EL BRAKE DESPUÉS DE CADA BLOQUE DE INSTRUCCIONES, DE LO CONTRARIO, TENDREMOS PROBLEMAS
         * */

        /**
         * SE PROPONE TRANSCRIBIR EL EJEMPLO DE IF-NUM-DÍAS A SWITCH */

        short anyo = 1996;
        byte mes = 2;
        byte dias = 0;
        boolean esBisiesto = (anyo%4==0 && anyo%100!=0) || anyo%400==0;
        String mesS = null;

        switch (mes){
            case 1:
                mesS = "enero";
                break;
            case 2:
                mesS = "febrero";
                break;
            case 3:
                mesS = "marzo";
                break;
            case 4:
                mesS = "abril";
                break;
            case 5:
                mesS = "mayo";
                break;
            case 6:
                mesS = "junio";
                break;
            case 7:
                mesS = "julio";
                break;
            case 8:
                mesS = "agosto";
                break;
            case 9:
                mesS = "septiembre";
                break;
            case 10:
                mesS = "octubre";
                break;
            case 11:
                mesS = "noviembre";
                break;
            case 12:
                mesS = "diciembre";
                break;
            default:
                System.out.println("Ha introducido mal los datos");

        }

        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12:
                dias = 31;
                System.out.println("El mes de "+mesS+" tiene "+dias+" días");
                break;

            case 4, 6, 9, 11:
                dias = 30;
                System.out.println("El mes de "+mesS+" tiene "+dias+" días");
            break;

            case 2:
                if (esBisiesto){
                    System.out.println("Comprobando si el año "+anyo+" es bisiesto...please wait...");
                    dias = 29;
                    System.out.println("El mes de "+mesS+" de "+anyo+" tiene "+dias+" días");
                } else {
                    System.out.println("Comprobando si el año "+anyo+" es bisiesto...please wait...");
                    dias = 28;
                    System.out.println("El mes de "+mesS+" de "+anyo+" tiene "+dias+" días");
                }
                break;
        }

    }
}
