package POO_Sobrecarga;
/** Clase padre de perro y gato
 * Clase abuelo de PastorAleman **/
public class Animal {
    /** creamos algunos atributos de animal **/

    private String nombreAnimal;
    private int numPatas;
    private boolean pelaje;
    private boolean domestico;

    /** CREAMOS UN MÉTODO PARA ANIMAL **/
    public String saludar(){
        return "..sonido por definir..";
    }

    public Animal() {
    }

    public Animal(String nombreAnimal, int numPatas) {
        this.nombreAnimal = nombreAnimal;
        this.numPatas = numPatas;
    }

    public Animal(String nombreAnimal, boolean domestico) {
        this();
        this.domestico = domestico;
    }

    public Animal(String nombreAnimal, int numPatas, boolean pelaje, boolean domestico) {
        this(nombreAnimal, numPatas);
        this.pelaje = pelaje;
        this.domestico = domestico;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }


}
