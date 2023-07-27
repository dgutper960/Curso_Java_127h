package POO_Herencia;

/**
 * EN JAVA NO SE SOPORTA LA HERENCIA MÚLTIPLE
 * (varios nodos padre no permitido)
 * **/

public class Profesor extends Persona{

    /**
     * Ya tenemos todos los atributos de persona
     * Añadimos atributos propios **/

    private String asignatura; // PODRÍA SER UNA CLASE O ENUM PERO LO DEJAMOS PARA SIMPLIFICAR

    /** CREAMOS CONSTRUCTOR VACÍO COMO EJEMPLO
     * --> Solo para el ejemplo, añadimos un sout **/
    public Profesor(){
        System.out.println("Inicializando constructor de Profesor");
    }

    /** CREAMOS CONSTRUCTORES PERSONALIZADOS **/
    public Profesor(String nombre, String apellidos, String asignatura) {
        super(nombre, apellidos);
        this.asignatura = asignatura;
    }

    public Profesor(String nombre, String apellidos, int edad, String asignatura) {
        super(nombre, apellidos, edad);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
