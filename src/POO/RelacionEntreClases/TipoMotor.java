package POO.RelacionEntreClases;

public enum TipoMotor {
    GASOLINA("Gasofa"),
    DIESEL("Diesel"),
    HIBRIDO("Hibrido"),
    ELECTRICO("Electric"),
    HIDROGENO("Hidrógeno");

    private String tipo;

    TipoMotor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
