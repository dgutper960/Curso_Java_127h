package POO_ClasesAbstractas.form.validador;

public class ValidarForamatoEmail extends Validador{

    protected String mensaje = "El formato de email no es correcto";
    private final static String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        // comprobamos que el valor coincida con la expresión regular
        return valor.matches(EMAIL_REGEX);
    }
}
