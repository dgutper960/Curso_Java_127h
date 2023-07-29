package POO_ClasesAbstractas.elementos.select;

public class Option {
    private String nombre;
    private String valor;
    private boolean selected;

    public Option() {
    }

    public Option(String nombre, String valor) {
        this();
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
