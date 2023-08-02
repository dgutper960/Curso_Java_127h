package TiposGenericos.InterfacesCRUB.Generic_InterfacesCRUB.modelo;
/** Los productos tienen id, pues reutilizamos el de BaseEntity
 * que además tiene autoincremento  */
public class Producto extends BaseEntity {
    /** definimos los atributos propios ***/
    private String descripcion;
    private double precio;

    public Producto(String descripcion, double precio) {
        super();
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nid=" + id+
                "\nDescripción " + descripcion+
                "\nPrecio=" + precio;
    }
}
