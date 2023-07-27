package POO_ClasesAbstractas.elementos;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    public ElementoForm() {
    }
    //el nombre solo entra por constructor
    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }
    //el valor solo entra por set
    public void setValor(String valor) {
        this.valor = valor;
    }
    //métodos abstractos solo se pueden implementar en clases abstractas
    abstract public String dibujarHTML();

}
