package POO.AccesoPrivado;

public class CompararConEquals {
    public static void main(String[] args) {

        /**
         * VAMOS A COMPARAR DOS OBJETOS AUTOMOVIL CON == Y CON .equals
         * **/

        // CREAMOS DOS OBJETOS CON LOS MISMOS VALORES
        Automovil nissan1 = new Automovil("Nissan", "Navara");
        Automovil nissan2 = new Automovil("Nissan", "Navara");

        //COMPARAMOS CON == Y EVIDENTEMENTE COMPARA LAS REFERENCIAS
        System.out.println("son iguales con == ? " + (nissan1 == nissan2)); // false

        //SI LO HACEMOS CON EQUALS, VEMOS EL MISMO RESULTADO
        System.out.println("son iguales con .equals ? " + (nissan1.equals(nissan2))); // false

        /** RESULTA QUE EL EQUALS DE OBJECT HACE LO MISMO QUE ==
         * POR ESO DEBEMOS SOBRECARGARLO EN LA CLASE  Automovil PARA USARLO A NUESTRO ANTOJO **/
        //AHORA NUESTRO EQUALS PERSONALIZADO COMPARA LA MARCA Y MODELO DEL OBJETO Automovil
        System.out.println("son iguales con .equals ? " + (nissan1.equals(nissan2))); // TRUE

        /** Comparamos un objeto con otro que es null */
        Automovil nulo = new Automovil();
        System.out.println("Comparamos nissan con nulo = " + nissan1.equals(nulo));



    }
}
