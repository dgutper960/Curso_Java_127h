package POO.Ejemplos._id_Autoincremental;

public class Coche {
    private String marca;
    private  String modelo;
    private String color;
    private int numPuertas;
    /** CREAMOS LOS ATRIBUTOS ESTÁTICOS PARA ASIGNAR E INCREMENTAR EL ID */
    private int id;
    private static int ultimo_id;

    /** DISEÑAMOS EL 1er CONSTRUCTOR PARA ASIGNAR E INCREMENTAR EL ID **/
    public Coche(){
        this.id = ++ultimo_id;
    }/** IMPRESCINDIBLE QUE LOS DEMÁS CONSTRUCTORES INVOQUEN ESTE OTRO */
    public Coche(String marca, String modelo) {
        this();
        this.marca = marca;
        this.modelo = modelo;
    }
    /** LOS NUEVOS CONSTRUCTORES DEBEN INVOCARSE EN CADENA **/
    public Coche(String marca, String modelo, String color, int numPuertas) {
        this(marca, modelo);
        this.color = color;
        this.numPuertas = numPuertas;
    }
    /** IMPLEMENTAMOS EL toString PARA QUE INVOQUE EL id (no el ultimo_id) **/
    @Override
    public String toString() {
        return "Coche{\n" +
                "id = "+ id + '\n' +
                "marca = " + marca + '\n' +
                "modelo = " + modelo + '\n' +
                "color = " + color + '\n' +
                "numPuertas = " + numPuertas +
                '}';
    }

    /** visibilidad privada getters setters */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
