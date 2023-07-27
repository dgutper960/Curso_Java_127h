package POO_Sobrecarga;
/** Clase padre de perro y gato
 * Clase abuelo de PastorAleman **/
public class Animal {
    /** creamos algunos atributos de animal **/

    private String tipoAnimal;
    private int numPatas;
    private boolean pelaje;
    private boolean domestico;

    public Animal() {

    }

    /** CREAMOS UN MÉTODO PARA ANIMAL **/
    public String saludar(){
        return "..sonido por definir..";
    }

    /** PODEMOS REUTILIZAR EL toString de super en las extends **/
    @Override
    public String toString() {
        return "\nTipoAnimal " + tipoAnimal +
                "\nNumPatas " + numPatas +
                "\nPelaje " + pelaje +
                "\nDomestico " + domestico;
    }


    public Animal(String tipoAnimal, int numPatas) {
        this.tipoAnimal = tipoAnimal;
        this.numPatas = numPatas;
    }

    public Animal(String tipoAnimal, int numPatas, boolean pelaje) {
        this(tipoAnimal, numPatas);
        this.pelaje = pelaje;
    }



    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
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
