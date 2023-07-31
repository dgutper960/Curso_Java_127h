package TiposGenericos.InterfacesCRUB.Clase_NoGenerica;

public class Animal {

    private String nombre;

    private String familia;

    public Animal(String nombre, String familia) {
        this.nombre = nombre;
        this.familia = familia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFamilia() {
        return familia;
    }
}
