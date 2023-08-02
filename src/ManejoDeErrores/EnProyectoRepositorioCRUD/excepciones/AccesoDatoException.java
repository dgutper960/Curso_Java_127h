package ManejoDeErrores.EnProyectoRepositorioCRUD.excepciones;

/** Excepción genérica de acceso datos**/

public class AccesoDatoException extends Exception{
    public AccesoDatoException(String message) {
        super(message);
    }
}
