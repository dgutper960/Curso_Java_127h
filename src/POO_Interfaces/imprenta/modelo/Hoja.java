package POO_Interfaces.imprenta.modelo;

abstract public class Hoja implements Imprimible{

    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public abstract String imprimir();

}
