package POO.RelacionEntreClases;

public enum TipoCoche {
    FAMILIAR("Familiar", "Coche ideal para multitud de usos", 7),
    DEPORTIVO("Deportivo", "Para gente la tiene pequeña", 2),
    SUV("SUV", "Parece un todoterreno pero no lo es", 5),
    CUPE("Cupé", "Ideal para personas que no se complican la vida", 5),
    FURGONETA("Furgoneta", "Para el trabajo o para camperizar, tu decides", 9),
    TODOTERRENO("Todo terreno", "Si te gusta la aventura o el medio rural", 5);

    private String tipo;
    private String descripcion;
    int numPlazas;

    TipoCoche(){
    }

    TipoCoche(String tipo, String descripcion, int numPlazas) {
        this();
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.numPlazas = numPlazas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    @Override
    public String toString() {
        return "TipoCoche{" +
                "\ntipo -> '" + tipo +
                "\ndescripción -> '" + descripcion +
                "\nnumPlazas -> " + numPlazas +
                "\n}";
    }
}
