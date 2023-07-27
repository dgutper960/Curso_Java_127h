package POO_Herencia;

public class Persona {
    /** TODAS LAS CLASES QUE HEREDEN DE PERSONA
     * VAN A TENER ESTOS ATRIBUTOS DE POR SÍ */
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;
    /** Al ser de visibilidad privada, debemos implementar getters y setters para acceder
     * si fuesen protected se podrían usar directamente en las clases extends **/

    /** CREAMOS CONSTRUCTOR VACÍO COMO EJEMPLO
     * --> Solo para el ejemplo, añadimos un sout **/
    public Persona(){
        System.out.println("Inicializando constructor de Persona");
    }

    /**  CREAMOS CONSTRUCTORES PERSONALIZADOS **/
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this(nombre, apellidos); // SOBRECARGAMOS EL DE ARRIBA
        this.edad = edad;
    }

    public Persona(String nombre, String apellidos, int edad, String email) {
        this(nombre, apellidos, edad); // SOBRECARGAMOS EL DE ARRIBA
        this.email = email;
    }

    /** Las clases extends van a heredar estos getters y setters **/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
