package POO_ClasesAbstractas.form.validador;

public class ValidarCampoNumerico extends Validador{

    // el campo debe ser idéntico al de la clase abstracta
    protected String mensaje = "El campo debe ser un numero";

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


    // en este caso usaremos un bloque try/catch
    @Override
    public boolean esValido(String valor) {
        try {
            Integer.parseInt(valor); // Si no puede realizar el cast, no es un dato válido
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
