package POO_Sobrecarga;

public class Perro extends Animal{
    String nombrePerro;
    String color;

    @Override
    public String saludar() {
        return "¡¡Guauuu!!";
    }

    /** Sobrecarga método sonido ***/


    public Perro() {
    }

    public Perro(String nombreAnimal, int numPatas, boolean pelaje, boolean domestico, String nombrePerro) {
        super(nombreAnimal, numPatas, pelaje, domestico);
        this.nombrePerro = nombrePerro;
        this.setDomestico(true);
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
