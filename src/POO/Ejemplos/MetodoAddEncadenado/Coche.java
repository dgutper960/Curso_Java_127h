package POO.Ejemplos.MetodoAddEncadenado;

public class Coche {

    private String marcaModelo;
    private String color;
    private Rueda[] ruedas;
    private int indiceRuedas = 0;


    public Coche(){

    }

    public Coche(Rueda ruedas) {
        this.ruedas[4] = ruedas;
    }

    public Coche(String marcaModelo, String color, Rueda ruedas, int indiceRuedas) {
        this(ruedas);
        this.marcaModelo = marcaModelo;
        this.color = color;
        this.indiceRuedas = indiceRuedas;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public String getColor() {
        return color;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void addRuedas(Rueda rueda){
        if (indiceRuedas > this.ruedas.length){
            this.ruedas[indiceRuedas++] = rueda;
        }
    }


}
