package POO_ClasesAbstractas.elementos;
// Si esta clase fuese abstracta,
// no estaríamos obligados a sobrecargar el método de la clase padre
public class InputForm extends ElementoForm{


    private String tipo = "text";

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String dibujarHTML() {
        return "<input type=\""+this.tipo+
                "\" name=\""+this.nombre+
                "\" value=\""+this.valor+
                "\">";
    }
}
