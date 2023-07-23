package POO.RelacionEntreClases;

public class Rueda {

    private String marca;
    private double pulgadas;
    private double ancho;

    // PARA RUEDA NO VAMOS A PONER SET POR LO QUE ES OBLIGATORIO INICIALIZAR
    // TODOS LOS ATRIBUTOS MEDIANTE CONSTRUCTOR

    public Rueda(String marca, double pulgadas, double ancho) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.ancho = ancho;
    }

    public String getMarca() {
        return marca;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public double getAncho() {
        return ancho;
    }
}
