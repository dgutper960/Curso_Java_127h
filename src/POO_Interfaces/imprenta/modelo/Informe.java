package POO_Interfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{

    private String autor; // podría ser del tipo persona
    private String revisor; // podría ser del tipo persona

    // constructor obligado al no haber constructor vacío en Hoja
    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: "+this.autor+
                "\nRevisado por: "+this.revisor+
                "\nContenido:\n"+this.contenido; // contenido se hereda como propia
    }
}
