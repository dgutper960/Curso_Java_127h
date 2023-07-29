package POO_ClasesAbstractas.elementos.select;

public class Option {

    private String id;

    private String nombre;
    private boolean selected;

    public Option() {
    }

    public Option(String nombre, String id) {
        this();
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isSelected() {
        return selected;
    }

    public Option setSelected(boolean selected) {
        this.selected = selected;
        return this;
    }/**
     SOBRECARGAMOS EL SET
     PARA DIFERENTES IMPLEMENTACIONES EN EL MAIN
     **/
    public void setSelected() {
        this.selected = selected;
    }
}
