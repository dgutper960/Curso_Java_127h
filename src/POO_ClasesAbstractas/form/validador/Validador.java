package POO_ClasesAbstractas.form.validador;
/**
 * CREAREMOS UNA CLASE ABSTRACTA PARA VALIDADOR
 * */
abstract public class Validador {

    // mensaje que será sobreescrito por cada una de las clases Validar
    protected String mensaje;

    // getters y setters abstractos
    abstract public String getMensaje();

    abstract public void setMensaje(String mensaje);

    // método abstracto para validar
    abstract public boolean esValido(String valor);
}
