package POO_Herencia;

/***
 * ESTA CLASE HEREDA DE ALUMNO QUE A SU VEZ HEREDA DE PERSONA QUE, COMO TODAS LAS CLASES, HEREDA DE OBJECT
 * **/

public class AlumnoInternacional extends Alumno{

    /** AL heredar de Persona, disponemos de todos los getters y setters de Alumno y persona **/

    private String pais;
    private double notaIdiomas;

    public String getPais() {
        return pais;
    }

    /** CREAMOS CONSTRUCTOR VACÍO COMO EJEMPLO
     * --> Solo para el ejemplo, añadimos un sout **/
    public AlumnoInternacional(){
        System.out.println("Inicializando constructor de AlumnoInternacional");
    }

    /*** CREAMOS CONSTRUCTORES PERSONALIZADOS **/

    public AlumnoInternacional(String nombre, String apellidos, String colegio, String pais) {
        super(nombre, apellidos, colegio);
        this.pais = pais;
    }

    public AlumnoInternacional(String nombre, String apellidos, String colegio, String pais, double notaIdiomas) {
        this(nombre, apellidos, colegio, pais);
        this.notaIdiomas = notaIdiomas;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String toString() {
        return "{\nNombre "+ super.getNombre()+
                "\nApellidos "+ super.getApellidos()+
                "\nEdad "+super.getEdad()+
                "\nColegio "+super.getColegio()+ // COMO EL this SE PUEDE PONER PARA EVITAR LA AMBIGÜEDAD
                "\nPais origen " + this.pais +
                "\nNota Lengua "+getNotasLengua()+ // PERO SI NO HAY RIESGO DE AMBIGÜEDAD, NO ES NECESARIO
                "\nNota Matemáticas "+getNotasMatematicas()+
                "\nNota Historia "+getNotasHistoria()+
                "\nNotaIdiomas " + notaIdiomas +
                "\n}";
    }
}
