package ManejoDeErrores.ExcepcionPersonalizada;
/**
 * TODAS LAS EXCEPCIONES HEREDAN DE THROWABLE Y EXISTEN DOS HERMANAS
 * --> RunTimeException, NO ESTAMOS OBLIGADOS A MANEJARLAS (si ocurren y no son manejadas el programa termina)
 * --> Exception, ESTAMOS OBLIGADOS A MANEJARLAS
 *
 * Como queremos que el manejo de esta Excepción sea obligatorio, vamos a heredar de Exception
 * */
public class CustomDivPorCeroException extends Exception {
    // DEBEMOS IMPLEMENTAR UNO DE LOS CONSTRUCTORES DE EXCEPTION
    // Elegimos uno con mensaje
    public CustomDivPorCeroException(String message) {
        super(message); // Accedemos al mensaje de la clase padre
        System.out.println("Mensaje personalizado para CustomDivPorCeroException");
    }

}
