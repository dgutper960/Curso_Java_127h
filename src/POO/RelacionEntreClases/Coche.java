package POO.RelacionEntreClases;

public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private double cilindrada;
    // una vez declarados los atributos nos vamos al main y creamos objetos de la clase

    private int capacidadDeposito = 50;
    private static int capDepositoStatic = 30;

    private static String colorPatente = "Azul";

    public Coche(){

    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche(String marca, String modelo, String color, double cilindrada, int capacidadDeposito) {
        this(marca, modelo); // USAMOS EL CONSTRUCTOR DE ARRIBA PARA OBTENER ESOS ATRIBUTOS
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadDeposito = capacidadDeposito;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente){
        Coche.colorPatente = colorPatente;
        //NO PODEMOS USAR this, debemos usar la clase en si
    }


    public void detalles(){
        String color = "azul"; // como en la de abajo pone this esta variable no es usada (solo para el ejemplo)
        System.out.println("auto2.fabricante = " + this.marca);
        System.out.println("auto2.modelo = " + this.modelo);
        System.out.println("auto2.color = " + this.color);
        System.out.println("auto2.cilindrada = " + this.cilindrada);

    }

    public StringBuilder detallesMejorado(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto2.fabricante = " + this.marca);
        sb.append("\nauto2.modelo = " + this.modelo);
        sb.append("\nauto2.color = " + this.color);
        sb.append("\nauto2.cilindrada = " + this.cilindrada);

        return sb;
    }

    public String marcaModelo(){
        return "\nLa marca del auto es "+this.marca +"\nEl modelo es "+this.modelo;

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



    public float mediaConsumo(int km, float porcentaje){ // requiere entrada en float ej.- 0.60f

        return km/(this.capacidadDeposito*porcentaje);
    }

    public float mediaConsumo(int km, int porcentaje){ // requiere entrada en int ej.- 60

        return km/(this.capacidadDeposito*(porcentaje/100f));
    }

    public static float mediaConsumoStatic(int km, int porcentaje){ // requiere entrada en int ej.- 60

        return km/(Coche.capDepositoStatic*(porcentaje/100f));
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

    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadDeposito=" + capacidadDeposito +
                '}';
    }


    public String toString2() {

        return marca + " " + modelo;
    }

}
