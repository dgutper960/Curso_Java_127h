package POO_ClasesAbstractas.form.validador;
/**
 * Para esta clase vamos a tener las opciones de que los valores mínimos y máximos sean
 * --> La propia longitud positiva de un tipo int
 * --> Valores dedos por constructor o método set
 * */
public class ValidarLongitud extends Validador{

    protected String mensaje = "Solo valores comprendidos entre un mínimo de d% y un máximo de d% ";
    private int min;
    private int max = Integer.MAX_VALUE;

    // constructor para valores por defecto
    public ValidarLongitud() {
    }
    // constructor para valores por entrada
    public ValidarLongitud(int min, int max) {
        this.min = min;
        this.max = max;
    }

    // setters para valores mínimos y máximos una vez creado el objeto
    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    boolean esValido(String valor) {
        // editamos el mensaje para dar los valores mínimos y máximos en el String
        this.mensaje = String.format(this.mensaje, this.min, this.max); // %d = digito, deben estar en orden
        // evitamos el NullPointException
        if (valor == null){
            return true;
        }// comprobamos que la longitud esté entre los valores
        int largo = valor.length();
        return (largo >= this.min && largo <= this.max);
    }
}
