package POO.AccesoPrivado;

public class Automovil {
    /**
     * HEMOS COPIADO AUTOMOVIL CON ACCESO POR DEFECTO Y LO HEMOS COPIADO A ESTE PAQUETE
     * LO VAMOS A PONER PRIVADO PARA VER LAS DIFERENCIAS Y TENER LOS DOS EJEMPLOS */

    private String fabricante;
    private String modelo;
    private String color = "verde";
    private double cilindrada;
    // una vez declarados los atributos nos vamos al main y creamos objetos de la clase

    private int capacidadDeposito = 50;
    private static int capDepositoStatic = 30;

    private static String colorPatente = "Azul";

    /**
     * CUANDO IMPLEMENTAMOS UN CONSTRUCTOR,
     * DEBEMOS TENER EN CUENTA QUE EL QUE ESTÁ POR DEFECTO SE SOBREESCRIBE
     * PARA EVITAR ERRORES PODEMOS CREAR UNO VACÍO Y OTROS PERSONALIZADOS
     * **/

    /** CONSTRUCTOR POR DEFECTO (Sin Parámetros)
     * EVITA CONFLICTOS CON OBJETOS CREADOS CON CONSTRUCTOR POR DEFECTO (sobreescrito por constructor con parámetros)*/
    public Automovil(){

    }

    /** CONSTRUCTOR CON PARÁMETROS OBLIGATORIOS (argumento del método) **/
    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    /** OTRA VERSIÓN CON TODOS LOS PARÁMETROS OBLIGATORIOS (argumento del método)
     * --> Para no repetir código podemos usar los parámetros de otros constructores previos  **/
    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadDeposito) {
        this(fabricante, modelo); // USAMOS EL CONSTRUCTOR DE ARRIBA PARA OBTENER ESOS ATRIBUTOS
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadDeposito = capacidadDeposito;
        /** SI SOLO USAMOS ESTE CONSTRUCTOR, LOS GETTERS Y SETTERS YA NO SON NECESARIOS **/
    }

    /** getter solo retorna el dato/valor */
    public String getFabricante() {
        return fabricante;
    }

    /** Set NO RETORNA(void) solo lo modifica (this obligatorio por ambigüedad)*/
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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
        Automovil.colorPatente = colorPatente;
        //NO PODEMOS USAR this, debemos usar la clase en si
    }

    /**
     * AL PONER LOS ATRIBUTOS EN PRIVATE
     * DEBEMOS DEFINIR LOS GETTERS Y SETTERS
     * PARA ACCEDER DESDE FUERA DE LA CLASE
     * **/




    //MÉTODO QUE IMPRIME LOS DETALLES DEL AUTO
    public void detalles(){
        String color = "azul"; // como en la de abajo pone this esta variable no es usada (solo para el ejemplo)
        System.out.println("auto2.fabricante = " + this.fabricante);
        System.out.println("auto2.modelo = " + this.modelo);
        System.out.println("auto2.color = " + this.color);
        System.out.println("auto2.cilindrada = " + this.cilindrada);

    }

    public StringBuilder detallesMejorado(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto2.fabricante = " + this.fabricante);
        sb.append("\nauto2.modelo = " + this.modelo);
        sb.append("\nauto2.color = " + this.color);
        sb.append("\nauto2.cilindrada = " + this.cilindrada);

        return sb;
    }

    public String marcaModelo(){
        return "\nLa marca del auto es "+this.fabricante+"\nEl modelo es "+this.modelo;

    }

    public String acelerar(int rpm){
        return "\nEl "+this.fabricante+" "+this.modelo+" acelerando a "+rpm+"rpm";
    }

    public String frenar(){
        return "\nEl "+fabricante+" "+modelo+" ha frenado";
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

    /***
     * SI TENGO UN MÉTODO ESTÁTICO, SOLO PODRÉ USAR ATRIBUTOS ESTÁTICOS
     * **/
    public static float mediaConsumoStatic(int km, int porcentaje){ // requiere entrada en int ej.- 60

        return km/(Automovil.capDepositoStatic*(porcentaje/100f));
    }

    /**
     * TODOS LOS OBJETOS HEREDAN DE OBJET
     * POR LO QUE PODEMOS SOBRECARGAR UNO DE SUS MÉTODOS PARA USARLO COMO QUERAMOS
     * **/


    /** click derecho/generate/sobrecarga -> elegimos métodos de las clases padre **/
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Automovil)){ // PARA ASEGURARNOS QUE SOLO COMPARA OBJETOS DE TIPO AUTOMOVIL
            return false;
        }
        Automovil a = (Automovil) obj; // debemos comparar dos objetos del mismo tipo
        return (this.fabricante != null && this.modelo != null && //PARA EVITAR ERROR SI UNO DE LOS DOS ES NULL
                this.fabricante.equalsIgnoreCase(a.getFabricante()) &&
                this.modelo.equalsIgnoreCase(a.getModelo()));
        // MODIFICAMOS EL MÉTODO PARA COMPARAR LA MARCA Y MODELO DE ESTA CLASE
    }

    /**
     * GRENERAMOS UNA SOBRECARGA DE toString (de Object) para que se muestren todos los atributos
     * */
    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadDeposito=" + capacidadDeposito +
                '}';
    }

    /**
     * GRENERAMOS OTRO MÉTODO ALTERNATIVO DE toString PARA QUE MUESTRE SOLO fabricante y modelo
     */

    /**
     * GRENERAMOS UN MÉTODO ALTERNATIVO PARA QUE SE MUESTRE SOLO LA MARCA Y MODELO
     */
    public String toString2() {
        return fabricante + " " + modelo;
    }
    /** ESte método debe ser llamado de forma explícita */


}
