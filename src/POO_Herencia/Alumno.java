package POO_Herencia;
/**
 * EN JAVA NO SE SOPORTA LA HERENCIA MÚLTIPLE
 * (varios nodos padre no permitido)
 * **/

public class Alumno extends Persona{

    /**
     * Ya tenemos todos los atributos de persona
     * Añadimos atributos propios **/

    private String colegio; //PODRÍA SER OTRA CLASE APARTE PERO LO DEJAMOS PARA SIMPLIFICAR
    private double notasMatematicas;
    private double notasLengua;
    private double notasHistoria;

    /** CREAMOS CONSTRUCTOR VACÍO COMO EJEMPLO
     * --> Solo para el ejemplo, añadimos un sout **/
    public Alumno(){
        System.out.println("Inicializando constructor de Alumno");
    }

    /** SI QUEREMOS AÑADIR AL CONSTRUCTOR ATRIBUTOS DEL PADRE,
     * DEBEMOS INICIALIZAR DE FORMA EXPLÍCITA UNO DE SUS CONSTRUCTORES**/
    public Alumno(String nombre, String apellidos, String colegio) {
        super(nombre, apellidos); //Llama al constructor de la clase padre
        this.colegio = colegio;
    }

    /** Podemos llamar al constructor de la clase padre con super */
    public Alumno(String nombre, String apellidos, int edad, String email, String colegio) {
        super(nombre, apellidos, edad, email); //Lama al constructor de la clase padre
        this.colegio = colegio;
    }
    /** Podemos llamar a un constructor previo con this **/
    public Alumno(String nombre, String apellidos, int edad, String email, String colegio, double notasMatematicas, double notasLengua, double notasHistoria) {
        this(nombre, apellidos, edad, email, colegio); // TAMBIÉN PODEMOS LLAMAR AL DE ARRIBA SI ES COMPATIBLE
        this.notasMatematicas = notasMatematicas;
        this.notasLengua = notasLengua;
        this.notasHistoria = notasHistoria;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public double getNotasMatematicas() {
        return notasMatematicas;
    }

    public void setNotasMatematicas(double notasMatematicas) {
        this.notasMatematicas = notasMatematicas;
    }

    public double getNotasLengua() {
        return notasLengua;
    }

    public void setNotasLengua(double notasLengua) {
        this.notasLengua = notasLengua;
    }

    public double getNotasHistoria() {
        return notasHistoria;
    }

    public void setNotasHistoria(double notasHistoria) {
        this.notasHistoria = notasHistoria;
    }
}
