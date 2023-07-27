package POO_Sobrecarga;

public class Perro extends Animal{
    String nombrePerro;
    String color;

    /** Sobrecarga método saludar ***/
    @Override
    public String saludar() {
        return "¡¡Guauuu!!";
    }


    /** USAMOS EL toString de Animal y concatenamos **/
    @Override
    public String toString() {
        return super.toString() +
                "\nNombrePerro " + nombrePerro +
                "\nColor " + color;
    }


    public Perro() {
    }

    public Perro(String nombreAnimal, int numPatas, boolean pelaje, String nombrePerro) {
        super(nombreAnimal, numPatas, pelaje);
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
