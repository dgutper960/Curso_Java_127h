package POO.Ejemplos.ParametrizarConEnum;

public enum TipoVehiculo {
    CUPE("Vehículo para sorteros", 3, "Ocio", 4),
    FAMILIAR("Coche espacioso y confortable", 5, "Cargar niños y mandados", 7),
    DEPORTIVO("Rápido y manejable", 2, "Coche para fardar", 2),
    FURGON("Espacioso adaptado a mercancias", 4, "Trabajo", 3);

    String descripcion;
    int numPuertas;
    String uso;
    int numPlazas;

    TipoVehiculo(String descripcion, int numPuertas, String uso, int numPlazas) {
        this.descripcion = descripcion;
        this.numPuertas = numPuertas;
        this.uso = uso;
        this.numPlazas = numPlazas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getUso() {
        return uso;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    @Override
    public String toString() {
        return "TipoVehiculo{" +
                "descripcion='" + descripcion + '\'' +
                ", numPuertas=" + numPuertas +
                ", uso='" + uso + '\'' +
                ", numPlazas=" + numPlazas +
                '}';
    }
}
