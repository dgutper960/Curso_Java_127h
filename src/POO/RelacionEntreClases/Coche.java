package POO.RelacionEntreClases;

public class Coche {

    private int id;
    private static int ultimo_id;

    private String marca;
    private String modelo;

    private Color color;
    private Motor motor;
    private Deposito deposito;

    private Rueda[] ruedas;

    private Persona conductor;

    public Coche(){
        this.id = ++ultimo_id;
    }

    public Coche(String marca, String modelo, Color color) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Coche(String marca, String modelo, Motor motor, Deposito deposito, Color color, Persona conductor, Rueda[] ruedas) {
        this(marca, modelo, color);
        this.motor = motor;
        this.deposito = deposito;
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId(){
        return id;
    }

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

    public Motor getMotor() {
        return motor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }


    public String acelerar(int rpm){
        return "\nEl "+this.marca +" "+this.modelo+" acelerando a "+rpm+"rpm";
    }

    public String frenar(){
        return "\nEl "+ marca +" "+modelo+" ha frenado";
    }


    public String aceleraFerna(int rmp){
        String acelerar = this.acelerar(rmp);
        String frenar = frenar(); // si no hay posibilidad de ambigüedad, no hace falta el this
        return acelerar + frenar;
    }



    public double mediaConsumo(int km, float porcentaje){ // requiere entrada en float ej.- 0.60f

        return km/(this.deposito.getCapacidad()*porcentaje);
    }

    public double mediaConsumo(int km, int porcentaje){ // requiere entrada en int ej.- 60

        return km/(this.deposito.getCapacidad()*(porcentaje/100f));
    }


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                ", deposito=" + deposito +
                ", color=" + color +
                ", conductor=" + conductor +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Coche)){
            return false;
        }
        Coche a = (Coche) obj;
        return (this.marca != null && this.modelo != null &&
                this.marca.equalsIgnoreCase(a.getMarca()) &&
                this.modelo.equalsIgnoreCase(a.getModelo()));
    }



}
