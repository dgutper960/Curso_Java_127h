package POO.Ejemplos.ParametrizarValores;

public class CochesPSA {
    /**
     * IMAGINEMOS QUE QUEREMOS TENER VALORES QUE ESTÉN PARAMETRIZADOS,
     * PODRÍAMOS TENER VALORES FINALES PARA ASIGNARLOS A NUESTROS ATRIBUTOS
     * **/

    /** Si tenemos coches del grupo PSA, solo vamos a tener coches de unas marcas concretas **/
    private static final String GRUPO_EMPRESARIAL = "PSA"; // valor común a todos los caches (no modificable)
    /** Todos los coches creados van a ser PSA, pero cada uno tendrá su marca
     * que podrá ser cualquiera de las que pertenecen al grupo PSA
     * PARA ELLO, DEBEMOS CREAR UNA CLASE DE TIPO Enum
     * --> El tipo de dato debe de ser la clase enum que hemos creado **/
    private MarcasPSA marca;
    private Color color = Color.BLANCO;

    public CochesPSA() {
    }

    public CochesPSA(MarcasPSA marca, Color color) {
        this();
        this.marca = marca;
        this.color = color;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMarca(MarcasPSA marca){
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "CochesPSA{" +
                " grupo= " + GRUPO_EMPRESARIAL+
                ", marca= " + marca.getMarca() + // TOMA EL VALOR DE ENUM
                ", color= " + color.getColor() + // TOMA EL VALOR DE ENUM
                 '}';
    }
}
