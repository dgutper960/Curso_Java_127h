package POO_Sobrecarga;

public class Gato extends Animal{

    private String nombreGato;

    private String raza;
    private String color;

    @Override
    public String saludar() {
        return "Soy un gato... miau";
    }

    /** SOBREESCRIBIMOS EL MÉTODO SONIDO DE ANIMAL **/


    public Gato() {
    }

    public Gato(String nombreAnimal, boolean domestico, String nombreGato, String raza) {
        super(nombreAnimal, domestico);
        this.setDomestico(true);
        this.nombreGato = nombreGato;
        this.raza = raza;
    }

    public String getNombreGato() {
        return nombreGato;
    }

    public void setNombreGato(String nombreGato) {
        this.nombreGato = nombreGato;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
