package POO.ProyectoFacturas.org.david.appfacturas.modelo;

public class Producto {

    private int codigo; //AUTOGEN
    private static int n_codigo;
    private String nombre;
    private float precio;

    public Producto() {
        this.codigo = ++n_codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "código producto "+codigo + "\nProducto " + nombre + "\nPrecio "+ precio+"€";
    }
}
