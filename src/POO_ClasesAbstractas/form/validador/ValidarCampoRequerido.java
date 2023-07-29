package POO_ClasesAbstractas.form.validador;

public class ValidarCampoRequerido extends Validador{

    // el campo debe ser idéntico al de la clase abstracta
    protected String mensaje = "El campo es obligatorio";

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    // 1º validar que no sea null, evitamos el NullPointException
    // 2º validar que tenga longitud
    @Override
    public boolean esValido(String valor) {
        return (valor != null && valor.length() > 0); // podríamos negar el .isEmpty o el .isBlank
    }
}
