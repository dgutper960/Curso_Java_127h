package POO.RelacionEntreClases;

public class Persona {

    // DEFINIMOS LOS ATRIBUTOS DE PERSONA
    private String nombre;
    private String apellido1;
    private String apellido2;

    // CREAMOS UN CONSTRUCTOR POR DEFECTO
    public Persona() {
    }

    // CREAMOS UN CONSTRUCTOR CON PARÁMETROS QUE HEREDE DEL ANTERIOR
    public Persona(String nombre, String apellido1) {
        this();
        this.nombre = nombre;
        this.apellido1 = apellido1;
    }

    // CREAMOS UN CONSTRUCTOR CON TODOS LOS PARÁMETROS QUE HEREDE DE LOS ANTERIORES
    public Persona(String nombre, String apellido1, String apellido2) {
        this(nombre, apellido1);
        this.apellido2 = apellido2;
    }

    // EN ESTE CASO VAMOS A MOSTRAR EL NOMBRE COMPLETO MEDIANTE EL toString
    @Override
    public String toString() {
        return nombre + " " + apellido1 + " " + apellido2;
    }
}
