package ClasesWrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        /**
         * EL MÉTODO .getClass() PERTENECE A LA CLASE OBJET
         * POR LO TANTO, PUEDE SER IMPLEMENTADO POR CUALQUIER OBJETO
         * */

        /** Creamos un objeto de String */
        String texto = "Hola que tal!";

        /** llamamos a su método .getClass() */
        texto.getClass();
        /** este método retorna una instancia del tipo Class, por lo tanto, podemos hacer: */
        Class strClass = texto.getClass();
        /** y podemos desplegar los métodos de Class */
        System.out.println("strClass = " + strClass);
        System.out.println("strClass.getName() = " + strClass.getName()); // muestra el nombre completo de la clase
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());


        /** VEMOS UN ADELANTO PARA RECORRER LOS MÉTODOS DE UNA CLASE CON UN FOREACH
         *
         * 1. Vemos el tipo de dato de getMethod que es Method he importamos
         * 2. Ponemos la fuente de donde tomaremos los métodos (nombreObjeto.getMethods())
         * 3. sout + el metodo que queremos imprimir en cada iteración --> nombreIteración.nombreMétodo  */

        System.out.println("\nIMPRIMIMOS TODOS LOS MÉTODOS DE String\n");
        for (Method metodo: strClass.getMethods()) {
            System.out.println(strClass+" --> " + metodo.getName());
        } /** Recordemos que partimos de un String, por lo que veremos los métodos de String
                --> Los que se repiten es por la sobrecarga */

        System.out.println("=======================================================================================");
        /**
         * Hacemos lo mismo con un Integer
         * */
        
        Integer num = 34;
        Class intClass = num.getClass();

        System.out.println("intClass.getPackageName() = " + intClass.getPackageName());
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        System.out.println("intClass.getTypeName() = " + intClass.getClass().getPackage());
        System.out.println("intClass.getSuperclass( = " + intClass.getSuperclass()); // Number
        System.out.println("intClass.getSuperclass( = " + intClass.getSuperclass().getSuperclass()); // Objet
        /** podemos crear un objeto de Object */
        Object objecClass = intClass.getSuperclass().getSuperclass();

        System.out.println("\nIMPRIMIMOS TODOS LOS MÉTODOS DE Object\n");
        for (Method metodo: objecClass.getClass().getMethods()) {
            System.out.println(objecClass+" --> "+metodo.getName());
        }


        System.out.println("\nIMPRIMIMOS TODOS LOS MÉTODOS DE Integer\n");
        for (Method metodo: intClass.getMethods()) {
            System.out.println(intClass+" --> "+metodo.getName());
        }

    }
}
