package POO_ClasesAbstractas.form.validador;

public class ValidarNotNull extends Validador{

    // el campo debe ser idéntico al de la clase abstracta
    protected String mensaje = "El valor no puede ser nulo";

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
    }


    // valida que el parámetro de entrada no sea nulo
    @Override
    boolean esValido(String valor) {
        return (valor != null);
    }
}
