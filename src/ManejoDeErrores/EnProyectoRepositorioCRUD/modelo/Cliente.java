package ManejoDeErrores.EnProyectoRepositorioCRUD.modelo;

/**
 * ESTA CLASE REPRESENTARÁ LA TABLE CLIENTE
 * ***/
public class Cliente extends BaseEntity {

    private static int ultimoId;
    private Integer id;
    private String nombre;
    private String apellidos;

    public Cliente(String nombre, String apellidos) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Cliente() {

    }


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


    @Override
    public String toString() {
        return "\nCliente id=" + id +
                "\n" + nombre + " " + apellidos;
    }
}
