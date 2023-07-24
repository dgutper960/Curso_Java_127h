package ModificadorAccesoPackage.Hogar;

public class Persona {
    /** clase persona es pública (puede ser vista fuera del paquete) **/

    /** sus atributos son privados (solo visibles desde la clase)
     * --> Solo accesibles desde métodos públicos **/
    private String nombre;
    private String apellidos;
    private double altura;

    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";

    /** necesitamos getters y setters para acceder a los atributos **/
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /** igualmente, podemos tener métodos que se puedan usar desde fuera del paquete Hogar (en el jardín)**/
    public String jugarConPero(){
        return this.nombre+" está jugando con el perro";
    }
    /** Creamos un método estático que será común a todas las personas habidas y por haber
     *  por ser estático, podremos importarlo y usarlo directamente desde fuera del paquete **/
    public static String saludar(){
        return "Saludo!";
    }/** Para importar este método estático, debemos poner
     --> import static _directorio_completo_._nombreMétodo() */


    @Override
    public String toString() {
        return nombre;
    }


}
