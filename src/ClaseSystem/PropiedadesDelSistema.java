package ClaseSystem;

import java.util.Properties;

/**
 * PARA CONSULTAR LAS KEYS IR A ESTA PÁGINA (PROPIEDADES DE SISTEMA)
 * --> https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
 * **/

public class PropiedadesDelSistema {
    public static void main(String[] args) {

        /**
         * INICIALIZAREMOS STRING CON EL MÉTODO System.getProperty Y SUS RESPECTIVAS LLAVES (ver documentación sugerida)
         * USAREMOS DIFERENTES KEYS PARA OBTENER INFORMACIÓN DEL SISTEMA Y ENTORNO
         * **/

        /** vemos el nombre de usuario */
        String username = System.getProperty("user.name");
        System.out.println("username = " + username); // imprime el nombre de nuestro usuario en el sistema

        /** para ver la ruta de usuario sería */
        String userhome = System.getProperty("user.home");
        System.out.println("userhome = " + userhome);

        /** para ver el directorio del proyecto */
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        /** para ver la versión de Java */
        String versionJava = System.getProperty("java.version");
        System.out.println("versionJava = " + versionJava);

        /** podemos crear un salto de línea */
        String saltoL1 = System.getProperty("line.separator");
        System.out.println("saltoL1 = " + saltoL1+"Nueva línea");
        //TAMBIÉN DE ESTA FORMA
        String saltoL2 = System.lineSeparator();
        System.out.println("saltoL2 = " + saltoL2+"Nueva línea 2");


        /** LISTAR TODAS LAS PROPIEDADES **/
        System.out.println("\n\nLISTA COMPLETA DE PROPIEDADES\n");
        Properties listaPropiedades = System.getProperties(); // en plural OJO objeto de Properties
        listaPropiedades.list(System.out);




    }
}
